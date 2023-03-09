package com.kyc.ocr.common.request.drivinglicense;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DrivingLicenseDetailsRequest {
    
    private String fileB64;
    private boolean maskAadhaar;
    private boolean hideAadhaar;
    private boolean conf;
    private String docType;
}