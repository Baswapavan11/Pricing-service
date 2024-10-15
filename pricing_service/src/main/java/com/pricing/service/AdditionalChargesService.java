package com.pricing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.repository.AdditionalChargesRepository;

@Service
public class AdditionalChargesService {

	@Autowired
	private AdditionalChargesRepository additionalChargesRepository;
	
}
