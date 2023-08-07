package com.example.tablereservationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    //회원가입
    @PostMapping("/signup")
    public String signup(){
        return "";
    }
    //로그인
    @PostMapping("/signin")
    public String signin(){
        return "";
    }

    //매장 검색 기능
    //매장 상세 보기 기능
    //매장 예약 기능
    //리뷰 작성 기능
}
