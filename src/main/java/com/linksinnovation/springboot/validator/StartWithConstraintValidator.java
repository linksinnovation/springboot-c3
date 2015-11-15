/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Jirawong
 */
public class StartWithConstraintValidator implements ConstraintValidator<StartWith, String>{
    
    private String value;

    @Override
    public void initialize(StartWith a) {
        this.value = a.value();
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        return t.startsWith(value);
    }

    
}
