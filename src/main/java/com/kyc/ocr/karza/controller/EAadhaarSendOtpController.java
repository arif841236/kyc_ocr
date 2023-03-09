package com.kyc.ocr.karza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyc.ocr.karza.request.aadhaar.EAadhaarSendOtpRequest;
import com.kyc.ocr.karza.response.aadhaar.EAadhaarSendOtpResponse;
import com.kyc.ocr.karza.service.IEAadhaarSendOtpService;

@RestController
@RequestMapping("/aadhaar")
public class EAadhaarSendOtpController {

	@Autowired
	private IEAadhaarSendOtpService iEAadhaarSendOtpService;

	@PostMapping("/send/otp")
	public ResponseEntity<EAadhaarSendOtpResponse> sendOtResponseEntity(@RequestBody EAadhaarSendOtpRequest aadhaarOtpRequest) {

		EAadhaarSendOtpResponse aadhaarOtpResponse = iEAadhaarSendOtpService.getOtpResponse(aadhaarOtpRequest);

		return ResponseEntity.ok(aadhaarOtpResponse);
	}
}