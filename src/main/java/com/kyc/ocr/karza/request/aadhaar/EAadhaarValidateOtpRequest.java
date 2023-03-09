package com.kyc.ocr.karza.request.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EAadhaarValidateOtpRequest {

	private String consent;
	private String otp;
	private String accessKey;
	private String aadhaarNo;
}
