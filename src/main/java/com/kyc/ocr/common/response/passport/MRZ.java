package com.kyc.ocr.common.response.passport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MRZ {

	private String line2;
	private String line1;
	private float conf;
}
