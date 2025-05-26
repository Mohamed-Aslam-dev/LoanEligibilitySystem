package com.loan_eligibility_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan_eligibility_system.beans.LoanApplyPersonalData;

public interface LoanApplyRepository extends JpaRepository<LoanApplyPersonalData, Integer> {
	
	

}
