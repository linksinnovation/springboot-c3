/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.controller;

import com.linksinnovation.springboot.model.Comment;
import com.linksinnovation.springboot.service.CService;
import com.linksinnovation.springboot.service.CommentService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Jirawong
 */
@Controller
public class IndexController {
    
    @Autowired
    private CService commentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        
//        List<Comment> comments = new ArrayList<>();
//        comments.add(new Comment("comment 1", "Mr.x"));
//        comments.add(new Comment("comment 2", "Mr.y"));
        
        model.addAttribute("comments", commentService.getComment());
        model.addAttribute("formComment", new Comment());
        
        return "index";
    }
    
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String save(@ModelAttribute("formComment") Comment comment,Model model){

        model.addAttribute("comments", commentService.saveComments(comment));
        model.addAttribute("formComment", new Comment());
        
        return "index";
    }

}
