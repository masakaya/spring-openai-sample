package com.arc_connects.api.user.request;

import java.net.URI;
import java.util.Objects;
import com.arc_connects.api.user.request.CreateUserRequestAddress;
import com.arc_connects.api.user.response.UserRole;
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
 * ユーザー作成時のリクエストボディ
 */

@Schema(name = "CreateUserRequest", description = "ユーザー作成時のリクエストボディ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class CreateUserRequest {

  private String name;

  private String email;

  private String phone;

  private UserRole role;

  private CreateUserRequestAddress address;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  private String department;

  public CreateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUserRequest(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public CreateUserRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ユーザーの氏名
   * @return name
   */
  @NotNull @Size(min = 1, max = 100) 
  @Schema(name = "name", example = "田中太郎", description = "ユーザーの氏名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * ユーザーのメールアドレス（一意である必要がある）
   * @return email
   */
  @NotNull @Size(max = 255) @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "tanaka@example.com", description = "ユーザーのメールアドレス（一意である必要がある）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * 電話番号（ハイフンなしの半角数字）
   * @return phone
   */
  @Pattern(regexp = "^[0-9]{10,11}$") 
  @Schema(name = "phone", example = "09012345678", description = "電話番号（ハイフンなしの半角数字）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CreateUserRequest role(UserRole role) {
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

  public CreateUserRequest address(CreateUserRequestAddress address) {
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
  public CreateUserRequestAddress getAddress() {
    return address;
  }

  public void setAddress(CreateUserRequestAddress address) {
    this.address = address;
  }

  public CreateUserRequest birthDate(LocalDate birthDate) {
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

  public CreateUserRequest department(String department) {
    this.department = department;
    return this;
  }

  /**
   * 所属部署
   * @return department
   */
  @Size(max = 50) 
  @Schema(name = "department", example = "開発部", description = "所属部署", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.name, createUserRequest.name) &&
        Objects.equals(this.email, createUserRequest.email) &&
        Objects.equals(this.phone, createUserRequest.phone) &&
        Objects.equals(this.role, createUserRequest.role) &&
        Objects.equals(this.address, createUserRequest.address) &&
        Objects.equals(this.birthDate, createUserRequest.birthDate) &&
        Objects.equals(this.department, createUserRequest.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phone, role, address, birthDate, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

