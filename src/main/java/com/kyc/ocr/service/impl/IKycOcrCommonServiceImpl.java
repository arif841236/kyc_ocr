package com.kyc.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kyc.ocr.dto.KycOcrDto;
import com.kyc.ocr.service.IAdharDetailsSave;
import com.kyc.ocr.service.IDrivingLicenseDetailsService;
import com.kyc.ocr.service.IKycOcrCommonService;
import com.kyc.ocr.service.INewVoterIdDetailsService;
import com.kyc.ocr.service.IPanCardDetailsService;
import com.kyc.ocr.service.IPassportDetailsService;
import com.kyc.ocr.service.IVoterIdDetailsService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IKycOcrCommonServiceImpl implements IKycOcrCommonService {
	
	@Autowired
	private IPassportDetailsService iPassportDetailsService;

	@Autowired
	private IPanCardDetailsService iPanCardDetailsService;

	@Autowired
	private IAdharDetailsSave iAdharDetailsSave;
	
	@Autowired
	private IDrivingLicenseDetailsService iDrivingLicenseDetailsService;
	
	@Autowired
	private IVoterIdDetailsService iVoterIdDetailsService;
	
	@Autowired
	private INewVoterIdDetailsService iNewVoterIdDetailsService;
	

	@Override
	public Object kycOcrDetails(KycOcrDto request) {
		 Object response = new Object();
		 switch(request.getDocType().toUpperCase())  
		    {  
		        case "PAN":   
					response = iPanCardDetailsService.getDetails(request);
		            break;  
		        case "PASSPORT":   
		        	response = iPassportDetailsService.passportKycOcr(request);  
		            break;  
		        case "AADHAAR FRONT TOP":   
		        	response = iAdharDetailsSave.getResAdharFrontDetailsTop(request);
		            break;  
		        case "AADHAAR FRONT BOTTOM":   
		        	response = iAdharDetailsSave.adharFrontDetailsBottom(request);  
		            break;  
		        case "AADHAAR BACK":   
		        	response = iAdharDetailsSave.adharDetailsBack(request);  
		            break;
		        case "DRIVING LICENSE":   
		        	response = iDrivingLicenseDetailsService.drivingLicenseKycOcr(request);  
		            break;
		        case "VOTERID":   
		        	response = iVoterIdDetailsService.voterIdKycOcr(request);  
		            break;
		        case "VOTERID FRONT NEW":   
		        	response = iNewVoterIdDetailsService.newVoterIdKycOcr(request);  
		            break;
		        default:   
		            log.info("DocType Not Match");
		    }  
		return response;
	}

}
