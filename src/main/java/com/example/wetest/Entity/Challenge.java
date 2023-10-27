package com.example.wetest.Entity;

import com.example.wetest.Enum.ChallengeType;
import com.example.wetest.Enum.CheckDay;
import com.example.wetest.Enum.PaymentType;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "challenge_id")
    Long id;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "chattingRoom_id")
    ChattingRoom chattingRoom;
    
    @Enumerated(EnumType.STRING)
    ChallengeType challengeType;
    
    LocalDate startDate;
    LocalDate endDate;
    int peopleNum;
    
    @Enumerated(EnumType.STRING)
    CheckDay checkDay;
    
    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "charity_id")
    Charity charity;
    
    boolean finished;
    
}
