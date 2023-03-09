package com.kyc.ocr.karza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyc.ocr.karza.request.pan.PanAuthenticationRequest;
import com.kyc.ocr.karza.response.pan.Response;
import com.kyc.ocr.karza.service.impl.PanServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/verification")
public class PanAuthenticationController {
	@Autowired
	private PanServiceImpl iPanServiceImpl;

	@PostMapping("/pan")
	public ResponseEntity<Response> getPanStatus(@RequestBody PanAuthenticationRequest request) {
		log.info(request.toString());
		return ResponseEntity.ok(iPanServiceImpl.getAuthenticationStatus(request));
	}

}
