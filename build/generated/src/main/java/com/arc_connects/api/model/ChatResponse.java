package com.arc_connects.api.model;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.model.Usage;
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
 * ChatResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class ChatResponse {

  private String id;

  private String response;

  private String model;

  private Usage usage;

  public ChatResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Response ID
   * @return id
   */
  
  @Schema(name = "id", example = "chatcmpl-123", description = "Response ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChatResponse response(String response) {
    this.response = response;
    return this;
  }

  /**
   * The response from OpenAI
   * @return response
   */
  
  @Schema(name = "response", example = "Hello! I'm doing well, thank you for asking.", description = "The response from OpenAI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public ChatResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Model used
   * @return model
   */
  
  @Schema(name = "model", example = "gpt-3.5-turbo", description = "Model used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ChatResponse usage(Usage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public Usage getUsage() {
    return usage;
  }

  public void setUsage(Usage usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatResponse chatResponse = (ChatResponse) o;
    return Objects.equals(this.id, chatResponse.id) &&
        Objects.equals(this.response, chatResponse.response) &&
        Objects.equals(this.model, chatResponse.model) &&
        Objects.equals(this.usage, chatResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, response, model, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

