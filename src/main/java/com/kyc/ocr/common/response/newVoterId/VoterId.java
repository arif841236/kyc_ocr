package com.kyc.ocr.common.response.newVoterId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoterId {

	private String value;
	private float conf;

}
