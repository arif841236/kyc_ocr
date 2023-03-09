package com.kyc.ocr.common.response.pancard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Setter
public class Father {
    private String value;
    private float conf;
}