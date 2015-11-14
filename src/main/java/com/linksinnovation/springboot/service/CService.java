/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.service;

import com.linksinnovation.springboot.dto.Comment;
import java.util.List;

/**
 *
 * @author Jirawong
 */
public interface CService {
    public List<Comment> getComment();
    public List<Comment> saveComments(Comment comment);
}
