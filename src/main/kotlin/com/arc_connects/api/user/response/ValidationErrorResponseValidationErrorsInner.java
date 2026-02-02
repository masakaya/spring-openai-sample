package com.arc_connects.api.user.response;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidationErrorResponseValidationErrorsInner
 */

@JsonTypeName("ValidationErrorResponse_validationErrors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class ValidationErrorResponseValidationErrorsInner {

  private String field;

  private String rejectedValue;

  private String message;

  public ValidationErrorResponseValidationErrorsInner field(String field) {
    this.field = field;
    return this;
  }

  /**
   * エラーが発生したフィールド名
   * @return field
   */
  
  @Schema(name = "field", example = "email", description = "エラーが発生したフィールド名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ValidationErrorResponseValidationErrorsInner rejectedValue(String rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  /**
   * 拒否された値
   * @return rejectedValue
   */
  
  @Schema(name = "rejectedValue", example = "invalid-email", description = "拒否された値", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectedValue")
  public String getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(String rejectedValue) {
    this.rejectedValue = rejectedValue;
  }

  public ValidationErrorResponseValidationErrorsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * エラーメッセージ
   * @return message
   */
  
  @Schema(name = "message", example = "正しいメールアドレス形式で入力してください", description = "エラーメッセージ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorResponseValidationErrorsInner validationErrorResponseValidationErrorsInner = (ValidationErrorResponseValidationErrorsInner) o;
    return Objects.equals(this.field, validationErrorResponseValidationErrorsInner.field) &&
        Objects.equals(this.rejectedValue, validationErrorResponseValidationErrorsInner.rejectedValue) &&
        Objects.equals(this.message, validationErrorResponseValidationErrorsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, rejectedValue, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponseValidationErrorsInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

