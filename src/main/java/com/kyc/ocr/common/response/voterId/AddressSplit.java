package com.kyc.ocr.common.response.voterId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressSplit {

    private String line1;
    private String line2;
    private String houseNUmber;
    private String street;
    private String locality;
    private String landmark;
    private String city;
    private String district;
    private String state;
    private String pin;
}
