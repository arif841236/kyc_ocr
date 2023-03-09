package com.kyc.ocr.entity;

import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.kyc.ocr.common.response.aadhaar.JSONObjectConverter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class OCRDataBase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String poa;
	private String  poi;
	private String approved;
	@Column(name = "type_of_proof", columnDefinition = "json")
	@Convert(attributeName = "data", converter = JSONObjectConverter.class)
	private Map<String, Object> typeOfProof;
		
}
