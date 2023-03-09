package com.kyc.ocr.karza.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kyc.ocr.karza.request.pan.PanAuthenticationRequest;
import com.kyc.ocr.karza.response.pan.PanAuthenticationResponse;
import com.kyc.ocr.karza.response.pan.Response;
import com.kyc.ocr.karza.response.pan.Result;
import com.kyc.ocr.karza.service.IPanService;

@Service
public class PanServiceImpl implements IPanService {

	@Override
	public Response getAuthenticationStatus(PanAuthenticationRequest request) {

		try {
			request.setConsent("Y");
			RestTemplate restTemplat = new RestTemplate();
			String uri = "https://testapi.karza.in/v2/pan-authentication";
			HttpHeaders headers = new HttpHeaders();
			headers.add("x-karza-key", "RvOtIFlQRfLVW9YL");
			HttpEntity<Object> entity = new HttpEntity<>(request, headers);
			ResponseEntity<PanAuthenticationResponse> resp = restTemplat.exchange(uri, HttpMethod.POST, entity,
					PanAuthenticationResponse.class);

			PanAuthenticationResponse body = resp.getBody();
			Result result = body.getResult();
			if (result.getNameMatch().equals(Boolean.TRUE) && result.getDobMatch().equals(Boolean.TRUE)
					&& result.getStatus().equals("Active")) {
				return Response.builder().statusCode(200).status(true).message("Valid PAN").build();
			} else {
				return Response.builder().statusCode(400).status(false).message("Invalid PAN").build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.builder().statusCode(400).status(false).message("Invalid PAN").build();

		}
	}

}
