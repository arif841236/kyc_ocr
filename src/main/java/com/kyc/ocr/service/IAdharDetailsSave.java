package com.kyc.ocr.service;

import com.kyc.ocr.common.response.aadhaar.AadhaarBack;
import com.kyc.ocr.common.response.aadhaar.AadhaarBottom;
import com.kyc.ocr.common.response.aadhaar.AadhaarTop;
import com.kyc.ocr.dto.KycOcrDto;

public interface IAdharDetailsSave {

	public AadhaarTop getResAdharFrontDetailsTop(KycOcrDto request);

	public AadhaarBottom adharFrontDetailsBottom(KycOcrDto request);

	public AadhaarBack adharDetailsBack(KycOcrDto request);

}
