package com.kyc.ocr.common.response.aadhaar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DetailsBottom {

	private Common2Data qr;
	private Aadhaar aadhaar;
	private CommonData name;
	private CommonData father;
	private CommonData mother;
	private CommonData gender;
	private CommonData dob;
	private CommonData yob;
	private Common2Data imageUrl;
}
