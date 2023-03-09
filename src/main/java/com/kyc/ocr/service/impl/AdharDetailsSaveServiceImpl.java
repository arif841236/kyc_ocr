package com.kyc.ocr.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.kyc.ocr.common.request.passport.PassportDetailsRequest;
import com.kyc.ocr.common.response.aadhaar.AadhaarBack;
import com.kyc.ocr.common.response.aadhaar.AadhaarBottom;
import com.kyc.ocr.common.response.aadhaar.AadhaarTop;
import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.entity.OCRDataBase;
import com.kyc.ocr.service.IAdharDetailsSave;
import com.kyc.ocr.service.IKycOcrService;

@Service
public class AdharDetailsSaveServiceImpl implements IAdharDetailsSave {

	@Autowired
	private IKycOcrService iKycOcrService;
	
	String drivingLicense = "Driving License";
	String uri = "https://testapi.karza.in/v3/kycocr";
	String key = "x-karza-key";
	String value = "RvOtIFlQRfLVW9YL";
	@Override
	public AadhaarTop getResAdharFrontDetailsTop(KycOcrDto request) {
		String docType = "";
		if (request.getDocType().equalsIgnoreCase(drivingLicense)) {
			docType = drivingLicense;
		}
		PassportDetailsRequest detailsRequest = PassportDetailsRequest.builder().fileB64(request.getFileB64())
				.maskAadhaar(false).hideAadhaar(false).conf(true).docType(docType).build();
		HttpHeaders headers = new HttpHeaders();
		headers.add(key, value);
		HttpEntity<Object> entity = new HttpEntity<>(detailsRequest, headers);
		AadhaarTop cardDetailsResponse = new RestTemplate().exchange(uri, HttpMethod.POST, entity, AadhaarTop.class)
				.getBody();

		Map<String, Object> details = new HashMap<>();
		details.put("Aadhaar Front Top", cardDetailsResponse);
		OCRDataBase dataBase = OCRDataBase.builder().approved("No").poa("Yes").poi("yes").typeOfProof(details).build();
		iKycOcrService.saveOcrDetails(dataBase);
		return cardDetailsResponse;
	}

	@Override
	public AadhaarBottom adharFrontDetailsBottom(KycOcrDto request) {
		String docType = "";
		if (request.getDocType().equalsIgnoreCase(drivingLicense)) {
			docType = drivingLicense;
		}
		PassportDetailsRequest detailsRequest = PassportDetailsRequest.builder().fileB64(request.getFileB64())
				.maskAadhaar(false).hideAadhaar(false).conf(true).docType(docType).build();
		HttpHeaders headers = new HttpHeaders();
		headers.add(key, value);
		HttpEntity<Object> entity = new HttpEntity<>(detailsRequest, headers);
		AadhaarBottom cardDetailsResponse = new RestTemplate()
				.exchange(uri, HttpMethod.POST, entity, AadhaarBottom.class).getBody();

		Map<String, Object> details = new HashMap<>();
		details.put("Aadhaar Front Bottom", cardDetailsResponse);
		OCRDataBase dataBase = OCRDataBase.builder().approved("No").poa("Yes").poi("yes").typeOfProof(details).build();
		iKycOcrService.saveOcrDetails(dataBase);
		return cardDetailsResponse;
	}

	@Override
	public AadhaarBack adharDetailsBack(KycOcrDto request) {
		String docType = "";
		if (request.getDocType().equalsIgnoreCase(drivingLicense)) {
			docType = drivingLicense;
		}
		PassportDetailsRequest detailsRequest = PassportDetailsRequest.builder().fileB64(request.getFileB64())
				.maskAadhaar(false).hideAadhaar(false).conf(true).docType(docType).build();
		HttpHeaders headers = new HttpHeaders();
		headers.add(key, value);
		HttpEntity<Object> entity = new HttpEntity<>(detailsRequest, headers);
		AadhaarBack cardDetailsResponse = new RestTemplate().exchange(uri, HttpMethod.POST, entity, AadhaarBack.class)
				.getBody();

		Map<String, Object> details = new HashMap<>();
		details.put("Aadhaar Back", cardDetailsResponse);
		OCRDataBase dataBase = OCRDataBase.builder().approved("No").poa("Yes").poi("yes").typeOfProof(details).build();
		iKycOcrService.saveOcrDetails(dataBase);
		return cardDetailsResponse;
	}

}
