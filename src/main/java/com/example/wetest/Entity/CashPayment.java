package com.example.wetest.Entity;

import com.example.wetest.Enum.PaymentMethod;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class CashPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cashPayment_id")
    Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;
    
    int totalPrice;
    int purchasedCandy;
    LocalDateTime paymentDate;
    PaymentMethod paymentMethod;
    String cardNum;
    String approvalNum;
}
