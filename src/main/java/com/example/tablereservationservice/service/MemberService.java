package com.example.tablereservationservice.service;

import com.example.tablereservationservice.dto.MemberDto;
import com.example.tablereservationservice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    /**
     * 회원 가입
     *
     */
    public MemberDto signUp(){

    }
}
