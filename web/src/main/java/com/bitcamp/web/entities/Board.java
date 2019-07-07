package com.bitcamp.web.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * Customer
 */
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@DynamicInsert
@Table(name = "boards")
public class Board implements Serializable {
    

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long bno;
    @Column(name="writer",nullable = false) private String writer;
    @Column(name="title",nullable = false) private String title;
    @Column(name="category",nullable = false) private String category;
    @Column(name="content",nullable = false) private String content;
    @Column(name="recommend") @ColumnDefault("0") String recommend;

    @CreationTimestamp private Timestamp regdate;
    
}