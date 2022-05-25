package com.sparta.week3hw.repository;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class boardRequestDto {
    private final String username;
    private final String contents;
    private final String password;
    private final String title;
}
