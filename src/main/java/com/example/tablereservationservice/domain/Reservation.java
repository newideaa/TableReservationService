package com.example.tablereservationservice.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Reservation {

    //pk 정의
    @Id
    @GeneratedValue
    private Long id;
}
