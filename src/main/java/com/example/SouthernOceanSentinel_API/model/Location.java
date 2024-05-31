package com.example.SouthernOceanSentinel_API.model;

import com.example.SouthernOceanSentinel_API.controller.dto.LocationDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Location extends RepresentationModel<Location>{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String country;
    private String coordinates;
    @OneToMany
    @JoinColumn(name = "location_id")
    private List<PhotoRecord> records;

    public void addPhotoRecord(PhotoRecord newPhotoRecord) {
        records.add(newPhotoRecord);
    }

    //DTO constructor
    public Location (LocationDTO locationDTO){
        this.name = locationDTO.getName();
        this.country = locationDTO.getCountry();
        this.coordinates = locationDTO.getCoordinates();
    }
}
