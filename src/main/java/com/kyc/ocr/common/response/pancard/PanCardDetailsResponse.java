package com.kyc.ocr.common.response.pancard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
public class PanCardDetailsResponse {

	private Integer statusCode;
    private String requestId;
    private Result[] result;
}
