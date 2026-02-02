package com.arc_connects.api.user.response;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.user.response.UserPageResponsePageable;
import com.arc_connects.api.user.response.UserPageResponseSort;
import com.arc_connects.api.user.response.UserResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ページネーション対応のユーザー一覧レスポンス
 */

@Schema(name = "UserPageResponse", description = "ページネーション対応のユーザー一覧レスポンス")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserPageResponse {

  @Valid
  private List<@Valid UserResponse> content = new ArrayList<>();

  private UserPageResponsePageable pageable;

  private Integer totalElements;

  private Integer totalPages;

  private Boolean last;

  private Boolean first;

  private Integer numberOfElements;

  private Integer size;

  private Integer number;

  private UserPageResponseSort sort;

  private Boolean empty;

  public UserPageResponse content(List<@Valid UserResponse> content) {
    this.content = content;
    return this;
  }

  public UserPageResponse addContentItem(UserResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * ユーザーデータの配列
   * @return content
   */
  @Valid 
  @Schema(name = "content", description = "ユーザーデータの配列", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid UserResponse> getContent() {
    return content;
  }

  public void setContent(List<@Valid UserResponse> content) {
    this.content = content;
  }

  public UserPageResponse pageable(UserPageResponsePageable pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
   */
  @Valid 
  @Schema(name = "pageable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageable")
  public UserPageResponsePageable getPageable() {
    return pageable;
  }

  public void setPageable(UserPageResponsePageable pageable) {
    this.pageable = pageable;
  }

  public UserPageResponse totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * 全体の要素数
   * @return totalElements
   */
  
  @Schema(name = "totalElements", example = "150", description = "全体の要素数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public UserPageResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * 全体のページ数
   * @return totalPages
   */
  
  @Schema(name = "totalPages", example = "8", description = "全体のページ数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public UserPageResponse last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * 最後のページかどうか
   * @return last
   */
  
  @Schema(name = "last", example = "false", description = "最後のページかどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public UserPageResponse first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * 最初のページかどうか
   * @return first
   */
  
  @Schema(name = "first", example = "true", description = "最初のページかどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public UserPageResponse numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * 現在のページの要素数
   * @return numberOfElements
   */
  
  @Schema(name = "numberOfElements", example = "20", description = "現在のページの要素数", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfElements")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public UserPageResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * ページサイズ
   * @return size
   */
  
  @Schema(name = "size", example = "20", description = "ページサイズ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public UserPageResponse number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * 現在のページ番号
   * @return number
   */
  
  @Schema(name = "number", example = "0", description = "現在のページ番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public UserPageResponse sort(UserPageResponseSort sort) {
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
  public UserPageResponseSort getSort() {
    return sort;
  }

  public void setSort(UserPageResponseSort sort) {
    this.sort = sort;
  }

  public UserPageResponse empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * ページが空かどうか
   * @return empty
   */
  
  @Schema(name = "empty", example = "false", description = "ページが空かどうか", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserPageResponse userPageResponse = (UserPageResponse) o;
    return Objects.equals(this.content, userPageResponse.content) &&
        Objects.equals(this.pageable, userPageResponse.pageable) &&
        Objects.equals(this.totalElements, userPageResponse.totalElements) &&
        Objects.equals(this.totalPages, userPageResponse.totalPages) &&
        Objects.equals(this.last, userPageResponse.last) &&
        Objects.equals(this.first, userPageResponse.first) &&
        Objects.equals(this.numberOfElements, userPageResponse.numberOfElements) &&
        Objects.equals(this.size, userPageResponse.size) &&
        Objects.equals(this.number, userPageResponse.number) &&
        Objects.equals(this.sort, userPageResponse.sort) &&
        Objects.equals(this.empty, userPageResponse.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pageable, totalElements, totalPages, last, first, numberOfElements, size, number, sort, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPageResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

