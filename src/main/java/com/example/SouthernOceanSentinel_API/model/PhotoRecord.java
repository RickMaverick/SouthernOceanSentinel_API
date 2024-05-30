package com.example.SouthernOceanSentinel_API.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class PhotoRecord {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;
    @Lob
    private byte[] imageData;
    @ManyToOne
    @JoinColumn(name = "location_id")
    @JsonIgnore
    private Location location;
    private String description;
    private String waterTemp;
    @Nullable
    private String analisisResult;
}
