package org.openapitools.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.openapitools.model.Spot;
import org.openapitools.entity.SpotEntity;

import java.util.Optional;

@Mapper
public interface SpotsMapper {
    SpotsMapper INSTANCE = Mappers.getMapper(SpotsMapper.class);
    Spot entitytoDto(Optional<SpotEntity> spotEntity);
    SpotEntity dtoToEntity(Spot spot);

}
