package com.kyc.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyc.ocr.entity.OCRDataBase;

@Repository
public interface IOCRResponseRepository extends JpaRepository<OCRDataBase, Long> {

}
