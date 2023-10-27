package com.example.wetest.Entity;

import com.example.wetest.Enum.Category;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Charity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "charity_id")
    Long id;
    String charityName;
    String explanation;
    Category category;
    String imgEndpoint;
}
