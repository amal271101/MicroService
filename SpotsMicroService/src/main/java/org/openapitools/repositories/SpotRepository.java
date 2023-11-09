package org.openapitools.repositories;

import org.openapitools.entity.SpotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface SpotRepository extends JpaRepository<SpotEntity,Long> {
    Optional<SpotEntity> findById(Long Id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE spot SET name = :#{#spotEntity.name}, description = :#{#spotEntity.description}, " +
            "longitude = :#{#spotEntity.coordinates.longitude}, latitude = :#{#spotEntity.coordinates.latitude} " +
            "WHERE id = :spotId", nativeQuery = true)
    void updateSpot(@Param("spotId") Long spotId, @Param("spotEntity") SpotEntity spotEntity);
}
