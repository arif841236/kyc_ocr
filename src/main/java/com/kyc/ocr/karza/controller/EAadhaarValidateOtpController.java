package com.kyc.ocr.karza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyc.ocr.karza.request.aadhaar.EAadhaarValidateOtpRequest;
import com.kyc.ocr.karza.response.aadhaar.EAadhaarValidateOtpResponse;
import com.kyc.ocr.karza.service.IEAadhaarValidateOtpService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/aadhaar")
@Slf4j
public class EAadhaarValidateOtpController {

	@Autowired
	private IEAadhaarValidateOtpService iEAadhaarValidateOtpService;

	@PostMapping("/validate/otp")
	public ResponseEntity<EAadhaarValidateOtpResponse> aadhaarVerification(@RequestBody EAadhaarValidateOtpRequest request) {
		log.info("aadhaarVerification method request is start.");
		log.info(request.toString());
		EAadhaarValidateOtpResponse verificationResponse = iEAadhaarValidateOtpService.aadhaarVerification(request);
		return new ResponseEntity<>(verificationResponse, HttpStatus.OK);
	}
}
