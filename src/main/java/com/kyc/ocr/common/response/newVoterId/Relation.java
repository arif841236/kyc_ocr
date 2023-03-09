package com.kyc.ocr.common.response.newVoterId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Relation {
	
	private String value;
	private float conf;

}
