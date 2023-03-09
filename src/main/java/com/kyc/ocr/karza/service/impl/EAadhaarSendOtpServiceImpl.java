package com.kyc.ocr.karza.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kyc.ocr.karza.request.aadhaar.EAadhaarSendOtpRequest;
import com.kyc.ocr.karza.response.aadhaar.EAadhaarSendOtpResponse;
import com.kyc.ocr.karza.service.IEAadhaarSendOtpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EAadhaarSendOtpServiceImpl implements IEAadhaarSendOtpService {

	@Override
	public EAadhaarSendOtpResponse getOtpResponse(EAadhaarSendOtpRequest aadhaarOtpRequest) {
		aadhaarOtpRequest.setConsent("Y");
		String uri = "https://testapi.karza.in/v3/eaadhaar/otp";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-karza-key", "RvOtIFlQRfLVW9YL");
		HttpEntity<Object> entity = new HttpEntity<>(aadhaarOtpRequest, headers);
		ResponseEntity<EAadhaarSendOtpResponse> response = restTemplate.exchange(uri, HttpMethod.POST, entity,
				EAadhaarSendOtpResponse.class);
		if (response.getBody() != null) {
			log.info("response :" + response.getBody());

		} else {
			log.error("Invalid otp");
		}

		return response.getBody();
	}

}
