package com.sparta.week3hw.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Board extends Timestamped{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    //패스워드드
    @Column(nullable = false)
    private String title;
    //유저이름
    @Column(nullable = false)
    private String username;
    //작성 내용
    @Column(nullable = false)
    private String contents;

    //패스워드드
    @Column(nullable = false)
    private String password;

    public Board(String username, String contents){
        this.username = username;
        this.contents = contents;
    }
    public Board(boardRequestDto boardRepositoryDto){
        this.username = boardRepositoryDto.getUsername();
        this.contents = boardRepositoryDto.getContents();
        this.password = boardRepositoryDto.getPassword();
        this.title = boardRepositoryDto.getTitle();
    }
    public void update(boardRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
}
