package com.kyc.ocr.common.response.aadhaar;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AadhaarBottom {

	private Integer statusCode;
	private String requestId;
	private List<ResultsBottom> result;
}
