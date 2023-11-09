package org.openapitools.services;

import org.openapitools.entity.SpotEntity;
import org.openapitools.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpotServiceImplementation implements SpotService{

    final SpotRepository spotRepository;

    @Autowired
    public SpotServiceImplementation(SpotRepository spotRepository) {
        this.spotRepository=spotRepository;
    }

    @Override
    public void createSpot(SpotEntity spot) {
        spotRepository.save(spot);
    }

    @Override
    public void deleteSpot(Long spotId) {spotRepository.deleteById(spotId);}

    @Override
    public Optional<SpotEntity> getSpot(Long spotId) {
   Optional<SpotEntity> spotEntity;
        spotEntity=spotRepository.findById(spotId);
        return spotEntity;
    }

    @Override
    public void updateSpot(Long spotId, SpotEntity updatedSpot) {
    spotRepository.updateSpot(spotId, updatedSpot);
    }
}
