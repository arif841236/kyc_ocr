package com.kyc.ocr.service;

import com.kyc.ocr.common.response.drivinglicense.DrivingLicenceResponse;
import com.kyc.ocr.dto.KycOcrDto;

public interface IDrivingLicenseDetailsService {

	DrivingLicenceResponse drivingLicenseKycOcr(KycOcrDto request);

}
