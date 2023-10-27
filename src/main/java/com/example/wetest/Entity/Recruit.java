package com.example.wetest.Entity;

import com.example.wetest.Enum.ChallengeType;
import com.example.wetest.Enum.CheckDay;
import com.example.wetest.Enum.PaymentType;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Recruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruit_id")
    Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer_id")
    User writer;
    
    ChallengeType type;
    LocalDateTime startDate;
    LocalDateTime endDate;
    int minPeople;
    CheckDay checkDay;
    PaymentType paymentType;
    String content;
    String coverImageEndpoint;
    String contentImgEndpoint;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "charity_id")
    Charity charity;
}
