/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.controller;

import com.linksinnovation.springboot.dto.Comment;
import com.linksinnovation.springboot.service.CService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jirawong
 */
@RestController
@RequestMapping("/api")
public class IndexRestController {
    
    @Autowired
    private CService cService;
    
    
    @RequestMapping(value="/",method = RequestMethod.GET)
    public List<Comment> get(){
        return cService.getComment();
    }
    
    @RequestMapping(value="/",method = {RequestMethod.POST,RequestMethod.DELETE})
    public List<Comment> post(@Validated @RequestBody Comment comment){
        return cService.saveComments(comment);
    }
    
}
