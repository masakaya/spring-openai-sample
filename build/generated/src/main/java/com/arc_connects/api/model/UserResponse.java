package com.arc_connects.api.model;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.model.UserResponseAddress;
import com.arc_connects.api.model.UserRole;
import com.arc_connects.api.model.UserStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
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
 * ユーザー情報のレスポンス
 */

@Schema(name = "UserResponse", description = "ユーザー情報のレスポンス")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserResponse {

  private Long id;

  private String name;

  private String email;

  private String phone;

  private UserStatus status;

  private UserRole role;

  private UserResponseAddress address;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  private String department;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastLoginAt;

  public UserResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ユーザーの一意識別子
   * @return id
   */
  
  @Schema(name = "id", example = "1", description = "ユーザーの一意識別子", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ユーザーの氏名
   * @return name
   */
  
  @Schema(name = "name", example = "田中太郎", description = "ユーザーの氏名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * ユーザーのメールアドレス
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "tanaka@example.com", description = "ユーザーのメールアドレス", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * 電話番号
   * @return phone
   */
  
  @Schema(name = "phone", example = "09012345678", description = "電話番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserResponse status(UserStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public UserStatus getStatus() {
    return status;
  }

  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public UserResponse role(UserRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @Valid 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public UserRole getRole() {
    return role;
  }

  public void setRole(UserRole role) {
    this.role = role;
  }

  public UserResponse address(UserResponseAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public UserResponseAddress getAddress() {
    return address;
  }

  public void setAddress(UserResponseAddress address) {
    this.address = address;
  }

  public UserResponse birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * 生年月日
   * @return birthDate
   */
  @Valid 
  @Schema(name = "birthDate", example = "Sun Apr 15 09:00:00 JST 1990", description = "生年月日", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public UserResponse department(String department) {
    this.department = department;
    return this;
  }

  /**
   * 所属部署
   * @return department
   */
  
  @Schema(name = "department", example = "開発部", description = "所属部署", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public UserResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * アカウント作成日時
   * @return createdAt
   */
  @Valid 
  @Schema(name = "createdAt", example = "2024-01-15T10:30Z", description = "アカウント作成日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * 最終更新日時
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updatedAt", example = "2024-01-20T14:45Z", description = "最終更新日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserResponse lastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

  /**
   * 最終ログイン日時
   * @return lastLoginAt
   */
  @Valid 
  @Schema(name = "lastLoginAt", example = "2024-01-25T09:15Z", description = "最終ログイン日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastLoginAt")
  public OffsetDateTime getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.id, userResponse.id) &&
        Objects.equals(this.name, userResponse.name) &&
        Objects.equals(this.email, userResponse.email) &&
        Objects.equals(this.phone, userResponse.phone) &&
        Objects.equals(this.status, userResponse.status) &&
        Objects.equals(this.role, userResponse.role) &&
        Objects.equals(this.address, userResponse.address) &&
        Objects.equals(this.birthDate, userResponse.birthDate) &&
        Objects.equals(this.department, userResponse.department) &&
        Objects.equals(this.createdAt, userResponse.createdAt) &&
        Objects.equals(this.updatedAt, userResponse.updatedAt) &&
        Objects.equals(this.lastLoginAt, userResponse.lastLoginAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, phone, status, role, address, birthDate, department, createdAt, updatedAt, lastLoginAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
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

