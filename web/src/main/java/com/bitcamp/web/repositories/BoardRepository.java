package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Board;

import org.springframework.data.repository.CrudRepository;

/**
 * BoardRepository
 */
public interface BoardRepository extends CrudRepository<Board,Long>{

    
}