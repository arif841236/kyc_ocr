package com.kyc.ocr.service;

import com.kyc.ocr.common.response.pancard.PanCardDetailsResponse;
import com.kyc.ocr.dto.KycOcrDto;

public interface IPanCardDetailsService {
    public PanCardDetailsResponse getDetails(KycOcrDto request);

}