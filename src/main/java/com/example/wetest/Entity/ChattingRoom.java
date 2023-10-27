package com.example.wetest.Entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class ChattingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chattingRoom_id")
    Long id;
    
    @OneToOne(mappedBy = "chattingRoom", fetch = FetchType.LAZY)
    private Challenge challenge;
}
