package com.kyc.ocr.common.request.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AdharRequest {

	private String fileB64;
	private boolean maskAadhaar;
	private boolean hideAadhaar;
	private boolean conf;
	private String docType;
}
