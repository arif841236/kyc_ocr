package com.kyc.ocr.common.response.passport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Spouse {
	
	private String value;
	private float conf;

}
