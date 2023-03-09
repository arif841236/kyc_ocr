package com.kyc.ocr.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KycOcrDto {
	
	private String processId;
	private String docType;
	private String fileB64;


}
