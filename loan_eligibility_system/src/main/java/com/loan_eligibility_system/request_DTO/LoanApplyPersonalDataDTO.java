package com.loan_eligibility_system.request_DTO;

import java.util.Date;

import com.loan_eligibility_system.beans.CustomerAddress;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoanApplyPersonalDataDTO {

	@NotBlank(message = "Enter Your Correct Name")
	@NotNull(message = "Enter Your Correct Name")
	private String customerName;
	@Digits(integer = 10, fraction = 0, message = "Your MobileNumber Should be less then 10")
	@NotNull(message = "Enter Your Correct Mobile Number")
	private Long customerMobile;
	@Email(message = "Please Enter Your Mail should be Correctly")
	private String customerEmail;
	@Temporal(TemporalType.DATE)
	@NotNull(message = "Please Enter Your Date Of Birth")
	private Date dateOfBirth;
	@Size(min = 16, max = 16, message = "Aadhar must be exactly 16 digits")
	private String aadharNumber;
	@Size(min = 10, max = 10, message = "Your PAN Number must be exactly 10 characters")
	private String panNumber;
	@NotNull(message = "Please Enter Your Correct StreetName")
	@NotBlank(message = "Please Enter Your Correct StreetName")
	private String streetName;
	@NotNull(message = "Please Enter Your Correct Area")
	@NotBlank(message = "Please Enter Your Correct Area")
	private String area;
	@NotNull(message = "Please Enter Your Correct City")
	@NotBlank(message = "Please Enter Your Correct City")
	private String city;

	public LoanApplyPersonalDataDTO(
			@NotBlank(message = "Enter Your Correct Name") @NotNull(message = "Enter Your Correct Name") String customerName,
			@Digits(integer = 10, fraction = 0, message = "Your MobileNumber Should be less then 10") @NotNull(message = "Enter Your Correct Mobile Number") Long customerMobile,
			@Email(message = "Please Enter Your Mail should be Correctly") String customerEmail,
			@NotNull(message = "Please Enter Your Date Of Birth") Date dateOfBirth,
			@Size(min = 16, max = 16, message = "Aadhar must be exactly 16 digits") String aadharNumber,
			@Size(min = 10, max = 10, message = "Your PAN Number must be exactly 10 characters") String panNumber,
			@NotNull(message = "Please Enter Your Correct StreetName") @NotBlank(message = "Please Enter Your Correct StreetName") String streetName,
			@NotNull(message = "Please Enter Your Correct Area") @NotBlank(message = "Please Enter Your Correct Area") String area,
			@NotNull(message = "Please Enter Your Correct City") @NotBlank(message = "Please Enter Your Correct City") String city) {
		super();
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.dateOfBirth = dateOfBirth;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.streetName = streetName;
		this.area = area;
		this.city = city;
	}

	public LoanApplyPersonalDataDTO() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "LoanApplyPersonalDataDTO [customerName=" + customerName + ", customerMobile=" + customerMobile
				+ ", customerEmail=" + customerEmail + ", dateOfBirth=" + dateOfBirth + ", aadharNumber=" + aadharNumber
				+ ", panNumber=" + panNumber + ", streetName=" + streetName + ", area=" + area + ", city=" + city + "]";
	}

}
