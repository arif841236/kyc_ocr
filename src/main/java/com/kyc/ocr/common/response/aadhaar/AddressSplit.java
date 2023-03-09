package com.kyc.ocr.common.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressSplit {
	private String careOf;
	private String line1;
	private String line2;
	private String houseNumber;
	private String street;
	private String locality;
	private String landmark;
	private String city;
	private String district;
	private String state;
	private String pin;

}
