package com.kyc.ocr.karza.response.pan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Result {

	private String status;
	private Boolean duplicate;
	private Boolean nameMatch;
	private Boolean dobMatch;

}
