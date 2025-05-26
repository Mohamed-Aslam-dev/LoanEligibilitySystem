package com.loan_eligibility_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan_eligibility_system.beans.LoanApplyPersonalData;

@Repository
public interface LoanApplyRepository extends JpaRepository<LoanApplyPersonalData, Integer> {
	
	

}
