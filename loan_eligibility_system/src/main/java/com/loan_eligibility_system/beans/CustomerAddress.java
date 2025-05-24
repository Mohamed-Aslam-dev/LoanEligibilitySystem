package com.loan_eligibility_system.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String streetName;
	private String area;
	private String city;
	
	@OneToOne(mappedBy = "customerAddress")
	private LoanApplyPersonalData loanApplyPersonalData;

	public CustomerAddress(Integer addressId, String streetName, String area, String city,
			LoanApplyPersonalData loanApplyPersonalData) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.area = area;
		this.city = city;
		this.loanApplyPersonalData = loanApplyPersonalData;
	}
	
	public CustomerAddress() {

	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LoanApplyPersonalData getLoanApplyPersonalData() {
		return loanApplyPersonalData;
	}

	public void setLoanApplyPersonalData(LoanApplyPersonalData loanApplyPersonalData) {
		this.loanApplyPersonalData = loanApplyPersonalData;
	}

	@Override
	public String toString() {
		return "CustomerAddress [addressId=" + addressId + ", streetName=" + streetName + ", area=" + area + ", city="
				+ city + ", loanApplyPersonalData=" + loanApplyPersonalData + "]";
	}

}
