package com.arc_connects.api.user.response;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.user.response.UserPageResponsePageableSort;
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
 * ページング情報
 */

@Schema(name = "UserPageResponse_pageable", description = "ページング情報")
@JsonTypeName("UserPageResponse_pageable")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserPageResponsePageable {

  private Integer pageNumber;

  private Integer pageSize;

  private UserPageResponsePageableSort sort;

  private Integer offset;

  private Boolean paged;

  private Boolean unpaged;

  public UserPageResponsePageable pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * 現在のページ番号（0から開始）
   * @return pageNumber
   */
  
  @Schema(name = "pageNumber", example = "0", description = "現在のページ番号（0から開始）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public UserPageResponsePageable pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * 1ページあたりの件数
   * @return pageSize
   */
  
  @Schema(name = "pageSize", example = "20", description = "1ページあたりの件数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public UserPageResponsePageable sort(UserPageResponsePageableSort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @Valid 
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public UserPageResponsePageableSort getSort() {
    return sort;
  }

  public void setSort(UserPageResponsePageableSort sort) {
    this.sort = sort;
  }

  public UserPageResponsePageable offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * オフセット値
   * @return offset
   */
  
  @Schema(name = "offset", example = "0", description = "オフセット値", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public UserPageResponsePageable paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

  /**
   * ページングが有効かどうか
   * @return paged
   */
  
  @Schema(name = "paged", example = "true", description = "ページングが有効かどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paged")
  public Boolean getPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  public UserPageResponsePageable unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

  /**
   * ページングが無効かどうか
   * @return unpaged
   */
  
  @Schema(name = "unpaged", example = "false", description = "ページングが無効かどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unpaged")
  public Boolean getUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPageResponsePageable userPageResponsePageable = (UserPageResponsePageable) o;
    return Objects.equals(this.pageNumber, userPageResponsePageable.pageNumber) &&
        Objects.equals(this.pageSize, userPageResponsePageable.pageSize) &&
        Objects.equals(this.sort, userPageResponsePageable.sort) &&
        Objects.equals(this.offset, userPageResponsePageable.offset) &&
        Objects.equals(this.paged, userPageResponsePageable.paged) &&
        Objects.equals(this.unpaged, userPageResponsePageable.unpaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, sort, offset, paged, unpaged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPageResponsePageable {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
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

