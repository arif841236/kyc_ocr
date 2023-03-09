package com.kyc.ocr.common.request.newVoterId;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewVoterIdDetailsRequest {
	
	private String fileB64;
	private boolean maskAadhaar;
	private boolean hideAadhaar;
	private boolean conf;
	private String docType;

}
