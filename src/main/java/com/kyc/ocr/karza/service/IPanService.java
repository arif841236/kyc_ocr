package com.kyc.ocr.karza.service;

import com.kyc.ocr.karza.request.pan.PanAuthenticationRequest;
import com.kyc.ocr.karza.response.pan.Response;

public interface IPanService {
	public Response getAuthenticationStatus(PanAuthenticationRequest request);

}
