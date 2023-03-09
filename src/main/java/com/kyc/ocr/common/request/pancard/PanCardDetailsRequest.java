package com.kyc.ocr.common.request.pancard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class PanCardDetailsRequest {

	private String fileB64;
	private boolean maskAadhar;
	private boolean hideAadhaar;
	private boolean conf;
	private String docType;
}
