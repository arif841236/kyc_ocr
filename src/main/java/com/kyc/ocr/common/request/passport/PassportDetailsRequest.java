package com.kyc.ocr.common.request.passport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassportDetailsRequest {

	private String fileB64;
	private boolean maskAadhaar;
	private boolean hideAadhaar;
	private boolean conf;
	private String docType;
}
