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
 * 住所情報
 */

@Schema(name = "UserResponse_address", description = "住所情報")
@JsonTypeName("UserResponse_address")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserResponseAddress {

  private String postalCode;

  private String prefecture;

  private String city;

  private String addressLine;

  public UserResponseAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * 郵便番号
   * @return postalCode
   */
  
  @Schema(name = "postalCode", example = "1234567", description = "郵便番号", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UserResponseAddress prefecture(String prefecture) {
    this.prefecture = prefecture;
    return this;
  }

  /**
   * 都道府県
   * @return prefecture
   */
  
  @Schema(name = "prefecture", example = "東京都", description = "都道府県", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefecture")
  public String getPrefecture() {
    return prefecture;
  }

  public void setPrefecture(String prefecture) {
    this.prefecture = prefecture;
  }

  public UserResponseAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * 市区町村
   * @return city
   */
  
  @Schema(name = "city", example = "新宿区", description = "市区町村", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserResponseAddress addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * 番地・建物名
   * @return addressLine
   */
  
  @Schema(name = "addressLine", example = "新宿1-1-1 新宿ビル101", description = "番地・建物名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressLine")
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponseAddress userResponseAddress = (UserResponseAddress) o;
    return Objects.equals(this.postalCode, userResponseAddress.postalCode) &&
        Objects.equals(this.prefecture, userResponseAddress.prefecture) &&
        Objects.equals(this.city, userResponseAddress.city) &&
        Objects.equals(this.addressLine, userResponseAddress.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, prefecture, city, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseAddress {\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    prefecture: ").append(toIndentedString(prefecture)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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

