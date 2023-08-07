package com.example.tablereservationservice.repository;

import com.example.tablereservationservice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
