package com.kyc.ocr.common.response.voterId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Details {
	
	private VoterId voterid;
	private Name name;
	private DOB dob;
	private Gender gender;
	private Age age;
	private Relation relatoin;
	private Doc doc;
	private Address address;
	private Pin pin;
	private AddressSplit addressSplit;
	private Date date;
	private Type type;

}
