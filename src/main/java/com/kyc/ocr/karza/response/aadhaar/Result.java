package com.kyc.ocr.karza.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {

	private DataFromAadhaar dataFromAadhaar;
	private String message;
	private String shareCode;
}
