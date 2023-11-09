package org.openapitools.controller;


import org.openapitools.api.SpotsApi;
import org.openapitools.model.Spot;
import org.openapitools.entity.SpotEntity;
import org.openapitools.mapper.SpotsMapper;
import org.openapitools.repositories.SpotRepository;
import org.openapitools.services.SpotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.simpleStudyDeckService.base-path:}")
public class SpotController implements SpotsApi {

    @Autowired
    SpotService spotService;
    @Autowired
    private SpotRepository spotRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(SpotController.class);

    public ResponseEntity<Void> createSpot(Spot spot) {
        LOGGER.info("creating Spot");
        SpotEntity spotEntity = new SpotEntity();

        spotEntity = SpotsMapper.INSTANCE.dtoToEntity(spot);
        spotService.createSpot(spotEntity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteSpot(Long spotId) {
        spotService.deleteSpot(spotId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public ResponseEntity<Spot> getSpot(Long spotId) {
        LOGGER.info("getting Spot");


        Spot spot = new Spot();

        spot = SpotsMapper.INSTANCE.entitytoDto(spotService.getSpot(spotId));


        if (spot != null) {

            return new ResponseEntity<>(spot, HttpStatus.OK);
        } else {
            LOGGER.info("culdn't find Spot");

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> updateSpot(Long spotId, Spot spot) {
        SpotEntity spotEntity = new SpotEntity();
        spotEntity = SpotsMapper.INSTANCE.dtoToEntity(spot);
        spotService.updateSpot(spotId, spotEntity);

        LOGGER.info("updated  Spot");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

