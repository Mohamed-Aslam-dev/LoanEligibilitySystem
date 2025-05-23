package com.loan_eligibility_system.beans;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class LoanApplyPersonalData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sNO;
	private String customerName;
	private Long customerMobile;
	private String customerEmail;
	private Date dateOfBirth;
	private String aadharNumber;
	private String panNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "addressId")
	private CustomerAddress customerAddress;
	
	
	public LoanApplyPersonalData(Integer sNO, String customerName, Long customerMobile, String customerEmail,
			Date dateOfBirth, String aadharNumber, String panNumber, CustomerAddress customerAddress) {
		this.sNO = sNO;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.dateOfBirth = dateOfBirth;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.customerAddress = customerAddress;
	}

	public LoanApplyPersonalData() {
		
	}

	public Integer getsNO() {
		return sNO;
	}

	public void setsNO(Integer sNO) {
		this.sNO = sNO;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(Long customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "LoanApplyPersonalData [sNO=" + sNO + ", customerName=" + customerName + ", customerMobile="
				+ customerMobile + ", customerEmail=" + customerEmail + ", dateOfBirth=" + dateOfBirth
				+ ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + ", customerAddress=" + customerAddress
				+ "]";
	}
	
	
	

}
