package com.kyc.ocr.karza.request.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EAadhaarSendOtpRequest {

	private String consent;
	private String aadhaarNo;
}
