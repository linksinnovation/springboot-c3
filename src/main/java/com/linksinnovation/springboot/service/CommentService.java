/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.service;

import com.linksinnovation.springboot.model.Comment;
import com.linksinnovation.springboot.repository.CommentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jirawong
 */
@Service
public class CommentService implements CService{
    
    @Autowired
    private CommentRepository commentRepository;
    
    @Override
    public List<Comment> getComment(){
        return commentRepository.findAll();
    }
    
    @Override
    public List<Comment> saveComments(Comment comment){
        commentRepository.save(comment);
        return commentRepository.findAll();
    }
    
}
