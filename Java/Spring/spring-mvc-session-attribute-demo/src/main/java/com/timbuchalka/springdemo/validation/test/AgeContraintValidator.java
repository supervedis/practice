package com.timbuchalka.springdemo.validation.test;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeContraintValidator implements ConstraintValidator<AgeConstraint, Integer>{

	private int lower;
	private int upper;
	
	@Override
	public void initialize(AgeConstraint constraintAnnotation) {
		this.lower = constraintAnnotation.lower();
		this.upper = constraintAnnotation.upper();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		if(age == null) {
			return false;
		}
		
		if(age < lower || age > upper) {
			return false;
		}
		
		return true;
	}

}
