package org.openapitools.services;

import org.openapitools.entity.SpotEntity;
import org.openapitools.repositories.SpotRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class SpotServiceImplementation implements SpotService{

    final SpotRepository spotRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(SpotService.class);

    @Autowired
    public SpotServiceImplementation(SpotRepository spotRepository) {
        this.spotRepository=spotRepository;
    }

    @Override
    public void createSpot(SpotEntity spot) {

        LOGGER.info(" will save spot in Db");

        spotRepository.save(spot);

    }

    @Override
    public void deleteSpot(Long spotId) {
        LOGGER.info(" will delete Spot from  Db");

        spotRepository.deleteById(spotId);
    }

    @Override
    public Optional<SpotEntity> getSpot(Long spotId) {
   Optional<SpotEntity> spotEntity;
        spotEntity=spotRepository.findById(spotId);
        if(spotEntity!=null){
            LOGGER.info(" Spot found in Db");
        }

        return spotEntity;
    }

    @Override
    public void updateSpot(Long spotId, SpotEntity updatedSpot) {
        LOGGER.info(" will update Spot  in Db");

        spotRepository.updateSpot(spotId, updatedSpot);

    }
}
