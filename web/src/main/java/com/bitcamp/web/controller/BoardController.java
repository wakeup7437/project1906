package com.bitcamp.web.controller;

import java.util.HashMap;
import java.util.List;

import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.entities.Board;
import com.bitcamp.web.repositories.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * CustomerController
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired BoardRepository repo;
    @Autowired BoardDTO dto;
    



    @GetMapping("/count")   
    public String count() {
        System.out.println("=====count======");
        System.out.println(repo.count());
        return String.valueOf(repo.count());
    }
    //테스트
    @GetMapping("/test")
    public void test(){
        System.out.println("=================테스트=========================");
        Board board=new Board();
        board.setTitle("제목");
        board.setCategory("자유");
        board.setContent("내용");
        board.setWriter("writer");
        repo.save(board);
    }


    //게시글 작성
    @PostMapping("/write")
    public Boolean write(@RequestBody Board content){
        System.out.println("==게시물 작성==");
        System.out.println(content.toString());
        repo.save(content);
        return true;
    }

    //게시글 삭제
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        System.out.println(id);
        repo.deleteById(Long.parseLong(id));
    }

    //게시글 수정
    @PutMapping("/{id}")
    public HashMap<String,String> update(@PathVariable String id,@RequestBody BoardDTO dto){
        System.out.println(id);
        HashMap<String, String> map = new HashMap<>();
        Board bo = repo.findById(Long.parseLong(id)).get();
        bo.setTitle(dto.getTitle());
        bo.setContent(dto.getContent());
        repo.save(bo);
        map.put("result", "success");
        return map;
    }

    //조회
    @GetMapping("/all")
    public List<Board> view() {
        System.out.println("========findall=========");
        return (List<Board>) repo.findAll();
    }
    
    
}