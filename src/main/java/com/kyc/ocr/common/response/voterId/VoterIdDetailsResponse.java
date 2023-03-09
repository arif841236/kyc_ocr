package com.kyc.ocr.common.response.voterId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoterIdDetailsResponse {
	
	private Integer statusCode;
	private String requestId;
	private Result[] result;
	
}
