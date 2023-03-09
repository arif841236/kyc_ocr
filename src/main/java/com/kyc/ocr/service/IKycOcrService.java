package com.kyc.ocr.service;

import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.entity.OCRDataBase;

public interface IKycOcrService {

	void saveKycOcrDetails(KycOcrDto request);
	public void saveOcrDetails(OCRDataBase aDetailsTop);

}
