package com.kyc.ocr.service;

import com.kyc.ocr.common.response.passport.PassportDetailsResponse;
import com.kyc.ocr.dto.KycOcrDto;

public interface IPassportDetailsService {

	PassportDetailsResponse passportKycOcr(KycOcrDto request);

}
