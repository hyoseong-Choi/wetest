package com.example.wetest.Entity;

import com.example.wetest.Enum.ItemType;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    Long id;
    
    String itemName;
    int price;
    ItemType itemType;
    String createdBy;
    String explanation;
    String imgEndpoint;
}
