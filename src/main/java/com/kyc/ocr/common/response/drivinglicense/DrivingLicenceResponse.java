package com.kyc.ocr.common.response.drivinglicense;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DrivingLicenceResponse {
    
    private Integer statusCode;
    private String requestId;
    private Result[] result;
    

}