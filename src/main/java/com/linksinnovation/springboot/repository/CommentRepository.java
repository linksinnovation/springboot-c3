/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.repository;

import com.linksinnovation.springboot.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jirawong
 */
public interface CommentRepository extends JpaRepository<Comment, Integer>{
    
}
