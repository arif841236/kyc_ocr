package com.kyc.ocr.common.response.aadhaar;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class JSONObjectConverter implements AttributeConverter<Map<String, Object>, String> {
	private static final ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(Map<String, Object> meta) {
		try {
			return objectMapper.writeValueAsString(meta);
		} catch (JsonProcessingException ex) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> convertToEntityAttribute(String dbData) {
		try {
			return objectMapper.readValue(dbData, Map.class);
		} catch (IOException ex) {
			return new HashMap<>();
		}
	}
}
