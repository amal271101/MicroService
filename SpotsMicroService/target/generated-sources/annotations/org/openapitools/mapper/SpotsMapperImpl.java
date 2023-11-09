package org.openapitools.mapper;

import java.util.Optional;
import javax.annotation.Generated;
import org.openapitools.entity.SpotEntity;
import org.openapitools.model.Spot;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T18:41:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
public class SpotsMapperImpl implements SpotsMapper {

    @Override
    public Spot entitytoDto(Optional<SpotEntity> spotEntity) {
        if ( spotEntity == null ) {
            return null;
        }

        Spot spot = new Spot();

        return spot;
    }

    @Override
    public SpotEntity dtoToEntity(Spot spot) {
        if ( spot == null ) {
            return null;
        }

        SpotEntity spotEntity = new SpotEntity();

        spotEntity.setLatitude( spot.getLatitude() );
        spotEntity.setLongitude( spot.getLongitude() );
        spotEntity.setDescription( spot.getDescription() );
        spotEntity.setName( spot.getName() );

        return spotEntity;
    }
}
