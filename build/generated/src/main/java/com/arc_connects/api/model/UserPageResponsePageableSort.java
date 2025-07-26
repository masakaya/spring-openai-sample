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

@Schema(name = "UserPageResponse_pageable_sort", description = "ソート情報")
@JsonTypeName("UserPageResponse_pageable_sort")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserPageResponsePageableSort {

  private Boolean sorted;

  private Boolean unsorted;

  private Boolean empty;

  public UserPageResponsePageableSort sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

  /**
   * ソートされているかどうか
   * @return sorted
   */
  
  @Schema(name = "sorted", example = "true", description = "ソートされているかどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorted")
  public Boolean getSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public UserPageResponsePageableSort unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

  /**
   * ソートされていないかどうか
   * @return unsorted
   */
  
  @Schema(name = "unsorted", example = "false", description = "ソートされていないかどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unsorted")
  public Boolean getUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }

  public UserPageResponsePageableSort empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * ソート条件が空かどうか
   * @return empty
   */
  
  @Schema(name = "empty", example = "false", description = "ソート条件が空かどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserPageResponsePageableSort userPageResponsePageableSort = (UserPageResponsePageableSort) o;
    return Objects.equals(this.sorted, userPageResponsePageableSort.sorted) &&
        Objects.equals(this.unsorted, userPageResponsePageableSort.unsorted) &&
        Objects.equals(this.empty, userPageResponsePageableSort.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPageResponsePageableSort {\n");
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

