package com.kyc.ocr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.service.IKycOcrCommonService;
import com.kyc.ocr.service.IKycOcrService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/kyc")
@Slf4j
public class KycOcrController {

	@Autowired
	private IKycOcrService iKycOcrService;
	
	@Autowired
	private IKycOcrCommonService iKycOcrCommonService;
	
	@PostMapping("/ocr")
	public ResponseEntity<Object> saveFileDetails(@RequestBody KycOcrDto request) {
		log.info(String.format("KYC OCR Request %s",request.toString()));
		iKycOcrService.saveKycOcrDetails(request);
		return ResponseEntity.ok(iKycOcrCommonService.kycOcrDetails(request));
	}
}
