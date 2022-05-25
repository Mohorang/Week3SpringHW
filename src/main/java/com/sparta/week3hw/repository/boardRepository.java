package com.sparta.week3hw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface boardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedAtDesc();
}
