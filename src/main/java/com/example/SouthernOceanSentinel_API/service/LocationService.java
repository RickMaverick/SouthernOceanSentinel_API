package com.example.SouthernOceanSentinel_API.service;

import com.example.SouthernOceanSentinel_API.controller.dto.LocationDTO;
import com.example.SouthernOceanSentinel_API.model.Location;
import com.example.SouthernOceanSentinel_API.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;


    public Optional<Location> listLocationById(Long id) {
        try {
            Optional<Location> location = locationRepository.findById(id);
            if (location.isPresent()) {
                return location;
            } else {
                return Optional.empty();
            }
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public Location saveNewLocation(LocationDTO newLocation) {
        Location location = new Location();
        location.setName(newLocation.getName());
        location.setCountry(newLocation.getCountry());
        location.setCoordinates(newLocation.getCoordinates());
        return locationRepository.save(location);
    }
}
