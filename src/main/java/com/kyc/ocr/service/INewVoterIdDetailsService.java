package com.kyc.ocr.service;

import com.kyc.ocr.common.response.newVoterId.NewVoterIdDetailsResponse;
import com.kyc.ocr.dto.KycOcrDto;

public interface INewVoterIdDetailsService {

	NewVoterIdDetailsResponse newVoterIdKycOcr(KycOcrDto request);

}
