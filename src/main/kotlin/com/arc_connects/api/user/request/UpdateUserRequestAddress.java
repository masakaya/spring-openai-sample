package com.arc_connects.api.user.request;

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

@Schema(name = "UpdateUserRequest_address", description = "住所情報")
@JsonTypeName("UpdateUserRequest_address")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T10:06:49.238047805+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UpdateUserRequestAddress {

  private String postalCode;

  private String prefecture;

  private String city;

  private String addressLine;

  public UpdateUserRequestAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * 郵便番号（ハイフンなし）
   * @return postalCode
   */
  @Pattern(regexp = "^[0-9]{7}$") 
  @Schema(name = "postalCode", example = "1234567", description = "郵便番号（ハイフンなし）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UpdateUserRequestAddress prefecture(String prefecture) {
    this.prefecture = prefecture;
    return this;
  }

  /**
   * 都道府県
   * @return prefecture
   */
  @Size(max = 10) 
  @Schema(name = "prefecture", example = "東京都", description = "都道府県", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefecture")
  public String getPrefecture() {
    return prefecture;
  }

  public void setPrefecture(String prefecture) {
    this.prefecture = prefecture;
  }

  public UpdateUserRequestAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * 市区町村
   * @return city
   */
  @Size(max = 50) 
  @Schema(name = "city", example = "渋谷区", description = "市区町村", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UpdateUserRequestAddress addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * 番地・建物名
   * @return addressLine
   */
  @Size(max = 100) 
  @Schema(name = "addressLine", example = "渋谷2-2-2 渋谷タワー201", description = "番地・建物名", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UpdateUserRequestAddress updateUserRequestAddress = (UpdateUserRequestAddress) o;
    return Objects.equals(this.postalCode, updateUserRequestAddress.postalCode) &&
        Objects.equals(this.prefecture, updateUserRequestAddress.prefecture) &&
        Objects.equals(this.city, updateUserRequestAddress.city) &&
        Objects.equals(this.addressLine, updateUserRequestAddress.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, prefecture, city, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequestAddress {\n");
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

