package com.kyc.ocr.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.kyc.ocr.common.request.newVoterId.NewVoterIdDetailsRequest;
import com.kyc.ocr.common.response.newVoterId.NewVoterIdDetailsResponse;
import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.entity.OCRDataBase;
import com.kyc.ocr.service.IKycOcrService;
import com.kyc.ocr.service.INewVoterIdDetailsService;
@Service
public class NewVoterIdDetailsServiceImpl implements INewVoterIdDetailsService {

	@Autowired
	private IKycOcrService iKycOcrService;
	
	@Override
	public NewVoterIdDetailsResponse newVoterIdKycOcr(KycOcrDto request) {
		String docType = "";
		if (request.getDocType().equalsIgnoreCase("Driving License")) {
			docType = "Driving License";
		}
		NewVoterIdDetailsRequest detailsRequest = NewVoterIdDetailsRequest.builder().fileB64(request.getFileB64())
				.maskAadhaar(false).hideAadhaar(false).conf(true).docType(docType).build();
		String uri = "https://testapi.karza.in/v3/kycocr";
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-karza-key", "RvOtIFlQRfLVW9YL");
		HttpEntity<Object> entity = new HttpEntity<>(detailsRequest, headers);
		NewVoterIdDetailsResponse cardDetailsResponse = new RestTemplate()
				.exchange(uri, HttpMethod.POST, entity, NewVoterIdDetailsResponse.class).getBody();

		Map<String, Object> details = new HashMap<>();
		details.put("VoterID Front New", cardDetailsResponse);
		OCRDataBase dataBase = OCRDataBase.builder().approved("No").poa("Yes").poi("Yes").typeOfProof(details).build();
		iKycOcrService.saveOcrDetails(dataBase);
		return cardDetailsResponse;
	}

}
