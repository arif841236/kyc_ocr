package com.kyc.ocr.karza.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.kyc.ocr.karza.request.aadhaar.EAadhaarValidateOtpRequest;
import com.kyc.ocr.karza.response.aadhaar.EAadhaarValidateOtpResponse;
import com.kyc.ocr.karza.service.IEAadhaarValidateOtpService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EAadhaarValidateOtpServiceImpl implements IEAadhaarValidateOtpService {

	@Override
	public EAadhaarValidateOtpResponse aadhaarVerification(EAadhaarValidateOtpRequest request) {
		log.info("aadhaarVerification method response start.");		
		request.setConsent("Y");
		String uri = "https://testapi.karza.in/v3/eaadhaar/file";
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-karza-key", "RvOtIFlQRfLVW9YL");
		HttpEntity<Object> entity = new HttpEntity<>(request, headers);
		EAadhaarValidateOtpResponse response = new RestTemplate().exchange(uri, HttpMethod.POST, entity, EAadhaarValidateOtpResponse.class).getBody();
		if(response != null) {
			log.info("response : " +response);
		}
		else {
			log.error("Invalid otp");
		}
		return response;
	}

}
