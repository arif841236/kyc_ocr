package com.kyc.ocr.common.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DetailsBack {

	private Common2Data qr;
	private Aadhaar aadhaar;
	private CommonData name;	
	private CommonData father;
	private CommonData husband;
	private CommonData gender;
	private CommonData dob;
	private CommonData yob;
	private CommonData address;
	private AddressSplit addressSplit;
	private CommonData pin;
	private CommonData phone;
	private Common2Data imageUrl;
	
	
	
	
	
}
