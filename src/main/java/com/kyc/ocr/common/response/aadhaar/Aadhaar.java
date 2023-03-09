package com.kyc.ocr.common.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Aadhaar {

	private String isMasked;
	private String value;
	private float conf;
}
