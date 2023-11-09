package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Spot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-09T17:16:33.881946Z[Etc/UTC]")
public class Spot {

  private String name;

  private BigDecimal latitude;

  private BigDecimal longitude;

  private String description;

  /**
   * Default constructor
   * @deprecated Use {@link Spot#Spot(String)}
   */
  @Deprecated
  public Spot() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Spot(String name) {
    this.name = name;
  }

  public Spot name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the spot
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the spot", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Spot latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude of the spot
   * @return latitude
  */
  @Valid 
  @Schema(name = "latitude", description = "Latitude of the spot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public Spot longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude of the spot
   * @return longitude
  */
  @Valid 
  @Schema(name = "longitude", description = "Longitude of the spot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public Spot description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the spot
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the spot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spot spot = (Spot) o;
    return Objects.equals(this.name, spot.name) &&
        Objects.equals(this.latitude, spot.latitude) &&
        Objects.equals(this.longitude, spot.longitude) &&
        Objects.equals(this.description, spot.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, latitude, longitude, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spot {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

