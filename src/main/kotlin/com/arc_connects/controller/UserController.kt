package com.arc_connects.controller

import com.arc_connects.api.user.UserApi
import com.arc_connects.api.user.request.CreateUserRequest
import com.arc_connects.api.user.request.UpdateUserRequest
import com.arc_connects.api.user.response.*
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import jakarta.validation.Valid
import java.time.LocalDate
import java.time.OffsetDateTime

@RestController
@RequestMapping("\${spring.application.version}")
class UserController : UserApi {

    @Value("\${spring.application.version}")
    private lateinit var apiVersion: String

    override fun createUser(@Valid createUserRequest: CreateUserRequest): ResponseEntity<UserResponse> {
        // サンプル実装：実際の実装ではデータベースに保存
        val address = UserResponseAddress()
            .postalCode("1234567")
            .prefecture("東京都")
            .city("新宿区")
            .addressLine("新宿1-1-1 新宿ビル101")

        val response = UserResponse()
            .id(1L)
            .name(createUserRequest.name)
            .email(createUserRequest.email)
            .phone(createUserRequest.phone)
            .birthDate(createUserRequest.birthDate)
            .department(createUserRequest.department)
            .address(address)
            .status(UserStatus.ACTIVE)
            .role(UserRole.USER)
            .createdAt(OffsetDateTime.now())
            .updatedAt(OffsetDateTime.now())
            .lastLoginAt(OffsetDateTime.now())

        return ResponseEntity.status(201).body(response)
    }

    override fun deleteUser(id: Long): ResponseEntity<Void> {
        // サンプル実装：実際の実装では論理削除を行う
        return ResponseEntity.noContent().build()
    }

    override fun getUserById(id: Long): ResponseEntity<UserResponse> {
        // サンプル実装：実際の実装ではデータベースから取得
        val address = UserResponseAddress()
            .postalCode("1234567")
            .prefecture("東京都")
            .city("新宿区")
            .addressLine("新宿1-1-1 新宿ビル101")

        val response = UserResponse()
            .id(id)
            .name("田中太郎")
            .email("tanaka@example.com")
            .phone("09012345678")
            .birthDate(LocalDate.parse("1990-04-15"))
            .department("開発部")
            .address(address)
            .status(UserStatus.ACTIVE)
            .role(UserRole.USER)
            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
            .updatedAt(OffsetDateTime.parse("2024-01-20T14:45:00Z"))
            .lastLoginAt(OffsetDateTime.parse("2024-01-25T09:15:00Z"))

        return ResponseEntity.ok(response)
    }

    override fun getUsers(
        page: Int?, size: Int?, sort: String?,
        name: String?, email: String?, status: UserStatus?
    ): ResponseEntity<UserPageResponse> {
        // サンプル実装：実際の実装ではデータベースから検索・ページング
        val address = UserResponseAddress()
            .postalCode("1234567")
            .prefecture("東京都")
            .city("新宿区")
            .addressLine("新宿1-1-1 新宿ビル101")

        val user1 = UserResponse()
            .id(1L)
            .name("田中太郎")
            .email("tanaka@example.com")
            .phone("09012345678")
            .birthDate(LocalDate.parse("1990-04-15"))
            .department("開発部")
            .address(address)
            .status(UserStatus.ACTIVE)
            .role(UserRole.USER)
            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
            .updatedAt(OffsetDateTime.parse("2024-01-20T14:45:00Z"))
            .lastLoginAt(OffsetDateTime.parse("2024-01-25T09:15:00Z"))

        val user2 = UserResponse()
            .id(2L)
            .name("佐藤花子")
            .email("sato@example.com")
            .phone("09087654321")
            .birthDate(LocalDate.parse("1985-08-20"))
            .department("営業部")
            .address(address)
            .status(UserStatus.ACTIVE)
            .role(UserRole.ADMIN)
            .createdAt(OffsetDateTime.parse("2024-01-10T15:20:00Z"))
            .updatedAt(OffsetDateTime.parse("2024-01-18T11:30:00Z"))
            .lastLoginAt(OffsetDateTime.parse("2024-01-26T08:45:00Z"))

        val content = mutableListOf<UserResponse>()
        content.add(user1)
        content.add(user2)

        val sortInfo = UserPageResponseSort()
            .empty(false)
            .sorted(true)
            .unsorted(false)

        val pageableSort = UserPageResponsePageableSort()
            .empty(false)
            .sorted(true)
            .unsorted(false)

        val pageable = UserPageResponsePageable()
            .pageNumber(page)
            .pageSize(size)
            .offset((page ?: 0) * (size ?: 20))
            .paged(true)
            .unpaged(false)
            .sort(pageableSort)

        val response = UserPageResponse()
            .content(content)
            .pageable(pageable)
            .totalElements(150)
            .totalPages(8)
            .last(false)
            .size(size)
            .number(page)
            .sort(sortInfo)
            .numberOfElements(content.size)
            .first((page ?: 0) == 0)
            .empty(false)

        return ResponseEntity.ok(response)
    }

    override fun updateUser(id: Long, @Valid updateUserRequest: UpdateUserRequest): ResponseEntity<UserResponse> {
        // サンプル実装：実際の実装ではデータベースを更新
        val address = UserResponseAddress()
            .postalCode("1234567")
            .prefecture("東京都")
            .city("新宿区")
            .addressLine("新宿1-1-1 新宿ビル101")

        val response = UserResponse()
            .id(id)
            .name(updateUserRequest.name)
            .email(updateUserRequest.email)
            .phone(updateUserRequest.phone)
            .birthDate(updateUserRequest.birthDate)
            .department(updateUserRequest.department)
            .address(address)
            .status(updateUserRequest.status)
            .role(updateUserRequest.role)
            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
            .updatedAt(OffsetDateTime.now())
            .lastLoginAt(OffsetDateTime.parse("2024-01-25T09:15:00Z"))

        return ResponseEntity.ok(response)
    }
}