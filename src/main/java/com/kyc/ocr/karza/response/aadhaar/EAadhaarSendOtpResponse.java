package com.kyc.ocr.karza.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EAadhaarSendOtpResponse {

	private Integer statusCode;
	
	private String requestId;
	
	private ResultOtp result;
	
	
}
