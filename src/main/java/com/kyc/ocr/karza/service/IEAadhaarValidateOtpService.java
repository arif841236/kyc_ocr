package com.kyc.ocr.karza.service;

import com.kyc.ocr.karza.request.aadhaar.EAadhaarValidateOtpRequest;
import com.kyc.ocr.karza.response.aadhaar.EAadhaarValidateOtpResponse;

public interface IEAadhaarValidateOtpService {

	EAadhaarValidateOtpResponse aadhaarVerification(EAadhaarValidateOtpRequest request);


}
