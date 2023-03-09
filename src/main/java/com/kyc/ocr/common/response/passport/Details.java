package com.kyc.ocr.common.response.passport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Details {

	private PassportNum passportNum;
	private GivenName givenName;
	private SurName surName;
	private Gender gender;
	private DOB dob;
	private PlaceOfBirth placeOfBirth;
	private CountryCode countryCode;
	private Nationality nationality;
	private PlaceOfIssue placeOfIssue;
	private DOI doi;
	private DOE doe;
	private Type type;
	private MRZ mrz;
	private Spouse spouse;
	private Address address;
	private Pin pin;
	private AddressSplit addressSplit;
	private OldPassportNum oldPassportNum;
	private OldDoi oldDoi;
	private OldPlaceOfIsssue oldPlaceOfIsssue;
	private FileNum fileNum;
}
