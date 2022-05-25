package com.sparta.week3hw.repository;

import lombok.Getter;
import org.apache.tomcat.jni.Local;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter //접근 자동생성
@MappedSuperclass //Entity가 자동으로 Column으로 인식한다.
@EntityListeners(AuditingEntityListener.class) // 생성,변경 시간을 자동으로 업데이트
public abstract class Timestamped {

    @CreatedDate //생성일자를 알려준다
    private LocalDateTime createdAt;

    @LastModifiedDate//최종 수정일자
    private LocalDateTime modifiedAt;
}
