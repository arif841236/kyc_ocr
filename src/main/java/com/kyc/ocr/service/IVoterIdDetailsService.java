package com.kyc.ocr.service;

import com.kyc.ocr.common.response.voterId.VoterIdDetailsResponse;
import com.kyc.ocr.dto.KycOcrDto;

public interface IVoterIdDetailsService {

	VoterIdDetailsResponse voterIdKycOcr(KycOcrDto request);

}
