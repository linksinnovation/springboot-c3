/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Jirawong
 */
@ControllerAdvice
public class MethodArgumentNotValidExceptionHandler {
    
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,Object> handler(MethodArgumentNotValidException ex){
        Map<String, Object> map = new HashMap<>();
        List<Object> list = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().stream().map((error) -> {
            Map<String, Object> mapError = new HashMap<>();
            mapError.put("field", error.getField());
            mapError.put("message", error.getDefaultMessage());
            return mapError;
        }).forEach((mapError) -> {
            list.add(mapError);
        });
        map.put("errors", list);
        return map;
    }
}
