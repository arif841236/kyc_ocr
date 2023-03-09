package com.kyc.ocr.karza.service;
import com.kyc.ocr.karza.request.aadhaar.EAadhaarSendOtpRequest;
import com.kyc.ocr.karza.response.aadhaar.EAadhaarSendOtpResponse;

public interface IEAadhaarSendOtpService {

	public EAadhaarSendOtpResponse getOtpResponse(EAadhaarSendOtpRequest aadhaarOtpRequest);
}