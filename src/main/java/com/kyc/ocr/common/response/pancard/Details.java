package com.kyc.ocr.common.response.pancard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Details {
    private PanNO panNo;
    private Name name;
    private Father father;
    private Date date;
    private DateOfIssue dateOfIssue;
}