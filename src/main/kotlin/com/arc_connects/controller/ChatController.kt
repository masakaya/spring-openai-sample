package com.arc_connects.controller

import com.arc_connects.api.chat.ChatApi
import com.arc_connects.api.chat.request.ChatRequest
import com.arc_connects.api.chat.response.ChatResponse
import com.arc_connects.api.chat.response.Usage
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import jakarta.validation.Valid

@RestController
@RequestMapping("\${spring.application.version}")
class ChatController : ChatApi {

    @Value("\${spring.application.version}")
    private lateinit var apiVersion: String

    override fun sendChatMessage(@Valid chatRequest: ChatRequest): ResponseEntity<ChatResponse> {
        // サンプル実装：実際の実装では OpenAI API を呼び出す
        val usage = Usage()
            .promptTokens(12)
            .completionTokens(15)
            .totalTokens(27)

        val response = ChatResponse()
            .id("chatcmpl-sample-${System.currentTimeMillis()}")
            .model("gpt-3.5-turbo")
            .response("Hello! This is a sample response from ChatController.")
            .usage(usage)

        return ResponseEntity.ok(response)
    }
}