package org.openapitools.services;

import org.openapitools.entity.SpotEntity;

import java.util.Optional;

public interface SpotService {
    void createSpot(SpotEntity spot);

    void deleteSpot(Long spotId);

    Optional<SpotEntity> getSpot(Long spotId);

    void updateSpot(Long spotId, SpotEntity updatedSpot);
}
