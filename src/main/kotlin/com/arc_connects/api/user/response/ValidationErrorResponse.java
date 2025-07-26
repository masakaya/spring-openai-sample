package com.arc_connects.api.user.response;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.user.response.ValidationErrorResponseValidationErrorsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * バリデーションエラーの詳細情報
 */

@Schema(name = "ValidationErrorResponse", description = "バリデーションエラーの詳細情報")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class ValidationErrorResponse {

  private String error;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String path;

  private Integer status;

  @Valid
  private List<@Valid ValidationErrorResponseValidationErrorsInner> validationErrors = new ArrayList<>();

  public ValidationErrorResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * エラーメッセージ
   * @return error
   */
  
  @Schema(name = "error", example = "Validation failed", description = "エラーメッセージ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ValidationErrorResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * エラー発生日時
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", description = "エラー発生日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ValidationErrorResponse path(String path) {
    this.path = path;
    return this;
  }

  /**
   * エラーが発生したリクエストパス
   * @return path
   */
  
  @Schema(name = "path", example = "/api/users", description = "エラーが発生したリクエストパス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ValidationErrorResponse status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTPステータスコード
   * @return status
   */
  
  @Schema(name = "status", example = "400", description = "HTTPステータスコード", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ValidationErrorResponse validationErrors(List<@Valid ValidationErrorResponseValidationErrorsInner> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ValidationErrorResponse addValidationErrorsItem(ValidationErrorResponseValidationErrorsInner validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * フィールド別のバリデーションエラー詳細
   * @return validationErrors
   */
  @Valid 
  @Schema(name = "validationErrors", description = "フィールド別のバリデーションエラー詳細", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationErrors")
  public List<@Valid ValidationErrorResponseValidationErrorsInner> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<@Valid ValidationErrorResponseValidationErrorsInner> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorResponse validationErrorResponse = (ValidationErrorResponse) o;
    return Objects.equals(this.error, validationErrorResponse.error) &&
        Objects.equals(this.timestamp, validationErrorResponse.timestamp) &&
        Objects.equals(this.path, validationErrorResponse.path) &&
        Objects.equals(this.status, validationErrorResponse.status) &&
        Objects.equals(this.validationErrors, validationErrorResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, timestamp, path, status, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

