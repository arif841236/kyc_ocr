package com.kyc.ocr.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.kyc.ocr.common.request.pancard.PanCardDetailsRequest;
import com.kyc.ocr.common.response.pancard.PanCardDetailsResponse;
import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.entity.OCRDataBase;
import com.kyc.ocr.service.IKycOcrService;
import com.kyc.ocr.service.IPanCardDetailsService;

@Service
public class PanCardDetailsServiceImpl implements IPanCardDetailsService {
	@Autowired
	private IKycOcrService iKycOcrService;

	@Override
	public PanCardDetailsResponse getDetails(KycOcrDto request) {
		String docType = "";
		if (request.getDocType().equalsIgnoreCase("Driving License")) {
			docType = "Driving License";
		}
		PanCardDetailsRequest panCardDetailsRequest = PanCardDetailsRequest.builder().fileB64(request.getFileB64())
				.maskAadhar(false).hideAadhaar(false).conf(true).docType(docType).build();
		String uri = "https://testapi.karza.in/v3/kycocr";
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-karza-key", "RvOtIFlQRfLVW9YL");
		HttpEntity<Object> entity = new HttpEntity<>(panCardDetailsRequest, headers);
		PanCardDetailsResponse cardDetailsResponse = new RestTemplate()
				.exchange(uri, HttpMethod.POST, entity, PanCardDetailsResponse.class).getBody();

		Map<String, Object> details = new HashMap<>();
		details.put("Pan", cardDetailsResponse);
		OCRDataBase dataBase = OCRDataBase.builder().approved("No").poa("No").poi("yes").typeOfProof(details).build();
		iKycOcrService.saveOcrDetails(dataBase);
		return cardDetailsResponse;

	}

}