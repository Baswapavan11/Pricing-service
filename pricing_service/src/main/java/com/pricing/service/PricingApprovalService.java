package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.PricingApproval;
import com.pricing.repository.PricingApprovalRepository;

@Service
public class PricingApprovalService {

	@Autowired
	private PricingApprovalRepository pricingApprovalRepository;
	
	public PricingApproval createParcelSizes(PricingApproval pricingApproval) {
		return pricingApprovalRepository.save(pricingApproval);
	}

	public List<PricingApproval> getAllPriceApprovals() {
		return pricingApprovalRepository.findAll();
	}

	public PricingApproval getPricepprovedById(Long id) {
		 Optional<PricingApproval> priceApproved = pricingApprovalRepository.findById(id);
	        return priceApproved.orElseThrow(() -> new RuntimeException("parcel size not found with id " + id));
	}

	public PricingApproval updatePriceApproval(Long id, PricingApproval pricingApproval) {
	
		PricingApproval priceApproved = getPricepprovedById(id);
		priceApproved.setPricingId(pricingApproval.getPricingId());
		priceApproved.setPricingType(pricingApproval.getPricingType());
		priceApproved.setBasePriceId(pricingApproval.getBasePriceId());
		priceApproved.setStatus(pricingApproval.getStatus());
		priceApproved.setSubmittedAt(pricingApproval.getSubmittedAt());
		priceApproved.setSubmittedBy(pricingApproval.getSubmittedBy());
		priceApproved.setApprovedAt(pricingApproval.getApprovedAt());
		priceApproved.setApproverId(pricingApproval.getApproverId());
		priceApproved.setFeedback(pricingApproval.getFeedback());
		return pricingApprovalRepository.save(priceApproved);
	}

	public  void deletePriceapproval(Long id) {
		// TODO Auto-generated method stub
		pricingApprovalRepository.deleteById(id);
	}

	
}
