package com.example.tablereservationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class StoreController {

    // 매장 예약
    @PostMapping("/reserve")
    public CreateReservation.Response createReservation(
            @RequestBody @Valid
    ){

    }
    // 파트너 가입 기능
    // 매장 등록
    // 방문 확인 기능
}
