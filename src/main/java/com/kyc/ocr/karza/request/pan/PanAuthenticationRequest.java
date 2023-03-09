package com.kyc.ocr.karza.request.pan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class PanAuthenticationRequest {

	private String pan;
	private String name;
	private String dob;
	private String consent;

}
