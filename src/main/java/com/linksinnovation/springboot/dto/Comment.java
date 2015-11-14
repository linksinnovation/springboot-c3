/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springboot.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Jirawong
 */
public class Comment {
    @NotEmpty(message = "Commnet ต้องไม่เป็นค่าว่างนะจ๊ะ")
    private String comment;
    private String author;

    public Comment(String comment, String author) {
        this.comment = comment;
        this.author = author;
    }

    public Comment() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
