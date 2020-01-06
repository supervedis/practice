package com.timbuchalka.springdemo.service.test;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.timbuchalka.springdemo.validation.test.AgeConstraint;
import com.timbuchalka.springdemo.validation.test.EmailVerification;
import com.timbuchalka.springdemo.validation.test.FieldVerification;

@FieldVerification.List({
	@FieldVerification(
			field = "email", 
			fieldMatch = "verifyEmail",
			message = "* Emails do not match."
			),
	@FieldVerification(
			field = "password", 
			fieldMatch = "verifyPassword",
			message = "* Passwords do not match."
			)
})
public class OrganizationRepresentative {

	@NotBlank(message=" * First Name: cannot be blank.")
	private String firstName;
	
	@NotEmpty(message="* Last Name: cannot be empty.")
	@Size(min=3, max=10, message="* a minimum of 3 and a maximum of 10 characters required.")
	private String lastName;

	@AgeConstraint
	private int age;
	
	@NotBlank(message="* Zip Code: cannot be blank.")
	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message="* Zip Code: 6 characters or digits only.")
	private String zipCode;
	
	@EmailVerification(message="* Email is invalid.")
	private String email;
	
	
	private String verifyEmail;
	private String password;
	private String verifyPassword;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	
}
