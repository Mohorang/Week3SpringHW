package com.sparta.week3hw.service;


import com.sparta.week3hw.repository.Board;
import com.sparta.week3hw.repository.boardRepository;
import com.sparta.week3hw.repository.boardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class boardService {

    private final boardRepository boardrepository;

    @Transactional
    public Long update(Long id, boardRequestDto requestDto){
        Board board = boardrepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return board.getId();
    }
}
