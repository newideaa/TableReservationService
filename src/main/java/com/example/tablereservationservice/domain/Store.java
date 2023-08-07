package com.example.tablereservationservice.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Store {
    //pk정의
    @Id
    @GeneratedValue
    private Long id;

    //n:1 관계 정의
    @ManyToOne
    private Review review;

    private String name;
    private String address;
    private String details;
    private String storeNumber;
    private Long restaurantScore;
    private String managerId;

    //등록 일자
    @CreatedDate
    private LocalDateTime registeredAt;
}
