package com.kyc.ocr.common.response.pancard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class DateOfIssue {
    private String value;
    private float conf;
}