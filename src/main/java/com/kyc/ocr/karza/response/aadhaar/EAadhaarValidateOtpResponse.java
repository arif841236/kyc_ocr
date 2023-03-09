package com.kyc.ocr.karza.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EAadhaarValidateOtpResponse {
	
	private Integer statusCode;
	private String requestId;
	private Result result;
}
