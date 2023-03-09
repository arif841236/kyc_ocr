package com.kyc.ocr.common.response.newVoterId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Details {
	
	private VoterId voterId;
	private Name name;
	private Relation relation;


}
