package com.kyc.ocr.karza.response.pan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PanAuthenticationResponse {

	@JsonProperty("request_id")
	private String requestId;
	
	@JsonProperty("status-code")
	private String statusCode;
	
	private Result result;

}
