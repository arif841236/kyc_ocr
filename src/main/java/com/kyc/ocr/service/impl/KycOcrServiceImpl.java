package com.kyc.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.entity.KycOcrEntity;
import com.kyc.ocr.entity.OCRDataBase;
import com.kyc.ocr.repository.IOCRResponseRepository;
import com.kyc.ocr.repository.IKycOcrRepository;
import com.kyc.ocr.service.IKycOcrService;

@Service
public class KycOcrServiceImpl implements IKycOcrService {

	@Autowired
	private IOCRResponseRepository iOCRResponseRepository;
	
	@Autowired
	private IKycOcrRepository iKycOcrRepository;

	@Override
	public void saveKycOcrDetails(KycOcrDto request) {
		KycOcrEntity entity = new KycOcrEntity();
		entity.setProcessId(request.getProcessId());
		entity.setDocType(request.getDocType());
		entity.setFileB64(request.getFileB64());
		iKycOcrRepository.save(entity);
	}

	@Override
	public void saveOcrDetails(OCRDataBase aDetailsTop) {
		iOCRResponseRepository.save(aDetailsTop);

	}

}
