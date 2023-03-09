package com.kyc.ocr.karza.response.pan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Response {

	private Integer statusCode;
	private Boolean status;
	private String message;
}
