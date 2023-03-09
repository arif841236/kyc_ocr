package com.kyc.ocr.karza.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SplitAddress {

	private String houseNumber;
	private String street;
	private String landmark;
	private String subdistrict;
	private String district;
	private String vtcName;
	private String location;
	private String postOffice;
	private String state;
	private String country;
	private String pincode;
	
}
