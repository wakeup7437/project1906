package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * BoardRepositoryTests
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {
    @Autowired
    private BoardRepository boardRepo;

    @Test
    public void inspect(){
        
    }

    @Test
    public void testInsert(){
        Board board=new Board();
        board.setTitle("제목");
        board.setCategory("자유");
        board.setContent("내용");
        board.setWriter("writer");
        boardRepo.save(board);
        
    }
    
}