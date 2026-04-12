package com.rt.samples.domain.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HelloResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T01:09:55.665993100-03:00[America/Sao_Paulo]")
public class HelloResponse {

  private String message;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String architecture;

  public HelloResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", example = "SIAAP System Ready!", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HelloResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HelloResponse architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
  */
  
  @Schema(name = "architecture", example = "Hexagonal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("architecture")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelloResponse helloResponse = (HelloResponse) o;
    return Objects.equals(this.message, helloResponse.message) &&
        Objects.equals(this.timestamp, helloResponse.timestamp) &&
        Objects.equals(this.architecture, helloResponse.architecture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, timestamp, architecture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelloResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
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

