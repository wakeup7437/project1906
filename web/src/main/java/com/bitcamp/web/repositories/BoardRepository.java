package com.bitcamp.web.repositories;

import java.util.List;

import com.bitcamp.web.entities.Board;

import org.springframework.data.repository.CrudRepository;

/**
 * BoardRepository
 */
public interface BoardRepository extends CrudRepository<Board,Long>{
    //public List<Board> findAllOrderByBnoDesc();
    public List<Board> findByCategoryOrderByBnoDesc(String category);
}