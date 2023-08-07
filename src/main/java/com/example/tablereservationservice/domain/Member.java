package com.example.tablereservationservice.domain;

import com.example.tablereservationservice.type.JoinPartner;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
//@EntityListeners(AutoCloseable.class)
public class Member {

    @Id
    @GeneratedValue
    private Long id; //회원 아이디(pk)

    private String email; // 로그인 id
    private String password; // 비밀번호
    private String name; // 회원 이름
    private String nickname; // 회원 별명(리뷰용)
    private String phonenumber; // 핸드폰 번호
    private JoinPartner joinPartner; // 파트너 가입 여부
}
