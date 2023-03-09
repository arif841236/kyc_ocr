package com.kyc.ocr.karza.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataFromAadhaar {

	private String generatedDateTime;
	private String maskedAadhaarNumber;
	private String name;
	private String dob;
	private String gender;
	private String mobileHash;
	private String emailHash;
	private String fatherName;
	private String relativeName;
	private String husbandName;
	private Address address;
}
