package com.example.SouthernOceanSentinel_API.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String country;
    private String coordinates;
    @OneToMany
    @JoinColumn(name = "location_id")
    private List<PhotoRecord> records;
}
