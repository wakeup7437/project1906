package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * BoardDTO
 */
@Getter
@Setter
@Component
@Lazy
public class BoardDTO {
    private String writer,title,category,content,recommend;
    
}