package com.arc_connects.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ChatRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class ChatRequest {

  private String message;

  private String model = "gpt-3.5-turbo";

  public ChatRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatRequest(String message) {
    this.message = message;
  }

  public ChatRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message to send to OpenAI
   * @return message
   */
  @NotNull 
  @Schema(name = "message", example = "Hello, how are you?", description = "The message to send to OpenAI", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChatRequest model(String model) {
    this.model = model;
    return this;
  }

  /**
   * OpenAI model to use
   * @return model
   */
  
  @Schema(name = "model", example = "gpt-3.5-turbo", description = "OpenAI model to use", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatRequest chatRequest = (ChatRequest) o;
    return Objects.equals(this.message, chatRequest.message) &&
        Objects.equals(this.model, chatRequest.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

