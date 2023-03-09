package com.kyc.ocr.common.response.aadhaar;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AadhaarTop {
	private Integer statusCode;
	private String requestId;
	private List<ResultsTop> result;

}
