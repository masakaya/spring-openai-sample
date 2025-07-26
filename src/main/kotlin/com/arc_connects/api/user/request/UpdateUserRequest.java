package com.arc_connects.api.user.request;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.user.request.UpdateUserRequestAddress;
import com.arc_connects.api.user.response.UserRole;
import com.arc_connects.api.user.response.UserStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ユーザー更新時のリクエストボディ
 */

@Schema(name = "UpdateUserRequest", description = "ユーザー更新時のリクエストボディ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UpdateUserRequest {

  private String name;

  private String email;

  private String phone;

  private UserStatus status;

  private UserRole role;

  private UpdateUserRequestAddress address;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  private String department;

  public UpdateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserRequest(String name, String email, UserStatus status) {
    this.name = name;
    this.email = email;
    this.status = status;
  }

  public UpdateUserRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ユーザーの氏名
   * @return name
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "name", example = "田中次郎", description = "ユーザーの氏名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * ユーザーのメールアドレス
   * @return email
   */
  @NotNull @Size(max = 255) @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "tanaka.jiro@example.com", description = "ユーザーのメールアドレス", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateUserRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * 電話番号（ハイフンなしの半角数字）
   * @return phone
   */
  @Pattern(regexp = "^[0-9]{10,11}$") 
  @Schema(name = "phone", example = "09087654321", description = "電話番号（ハイフンなしの半角数字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UpdateUserRequest status(UserStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public UserStatus getStatus() {
    return status;
  }

  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public UpdateUserRequest role(UserRole role) {
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

  public UpdateUserRequest address(UpdateUserRequestAddress address) {
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
  public UpdateUserRequestAddress getAddress() {
    return address;
  }

  public void setAddress(UpdateUserRequestAddress address) {
    this.address = address;
  }

  public UpdateUserRequest birthDate(LocalDate birthDate) {
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

  public UpdateUserRequest department(String department) {
    this.department = department;
    return this;
  }

  /**
   * 所属部署
   * @return department
   */
  @Size(max = 50) 
  @Schema(name = "department", example = "営業部", description = "所属部署", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.name, updateUserRequest.name) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.phone, updateUserRequest.phone) &&
        Objects.equals(this.status, updateUserRequest.status) &&
        Objects.equals(this.role, updateUserRequest.role) &&
        Objects.equals(this.address, updateUserRequest.address) &&
        Objects.equals(this.birthDate, updateUserRequest.birthDate) &&
        Objects.equals(this.department, updateUserRequest.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phone, status, role, address, birthDate, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

