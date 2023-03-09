package com.kyc.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyc.ocr.entity.KycOcrEntity;
@Repository
public interface IKycOcrRepository extends JpaRepository<KycOcrEntity, Long> {

}
