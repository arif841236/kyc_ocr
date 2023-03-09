package com.kyc.ocr.common.response.drivinglicense;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Details {
    
    
    private DOB dob;
    private DlNo dlNo;
    private Name name;

}