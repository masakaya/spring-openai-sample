package com.arc_connects.api.model;

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
 * ソート情報
 */

@Schema(name = "UserPageResponse_sort", description = "ソート情報")
@JsonTypeName("UserPageResponse_sort")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserPageResponseSort {

  private Boolean sorted;

  private Boolean unsorted;

  private Boolean empty;

  public UserPageResponseSort sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

  /**
   * Get sorted
   * @return sorted
   */
  
  @Schema(name = "sorted", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorted")
  public Boolean getSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public UserPageResponseSort unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

  /**
   * Get unsorted
   * @return unsorted
   */
  
  @Schema(name = "unsorted", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unsorted")
  public Boolean getUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }

  public UserPageResponseSort empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
   */
  
  @Schema(name = "empty", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPageResponseSort userPageResponseSort = (UserPageResponseSort) o;
    return Objects.equals(this.sorted, userPageResponseSort.sorted) &&
        Objects.equals(this.unsorted, userPageResponseSort.unsorted) &&
        Objects.equals(this.empty, userPageResponseSort.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPageResponseSort {\n");
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

