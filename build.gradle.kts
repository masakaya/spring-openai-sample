buildscript {
    dependencies {
        classpath("org.yaml:snakeyaml:2.0")
    }
}

plugins {
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.spring") version "1.9.20"
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.4"
    id("org.openapi.generator") version "7.7.0"
}

group = "com.arcconnects"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

openApiGenerate {
    generatorName.set("spring")
    inputSpec.set("$projectDir/doc/openapi.yml")
    outputDir.set("${layout.buildDirectory.get()}/generated")
    apiPackage.set("com.arc_connects.api")
    modelPackage.set("com.arc_connects.api.model")
    configOptions.set(mapOf(
        "interfaceOnly" to "true",
        "useSpringBoot3" to "true",
        "useTags" to "true"
    ))
}

// Copy and organize generated files by tags
tasks.register("copyGeneratedSources") {
    dependsOn("openApiGenerate")
    doLast {
        val buildGenerated = file("${layout.buildDirectory.get()}/generated/src/main/java/com/arc_connects/api")
        val srcApi = file("$projectDir/src/main/kotlin/com/arc_connects/api")
        
        if (buildGenerated.exists()) {
            // Create tag directories and organize files
            val tagDirs = mapOf(
                "chat" to listOf("ChatApi.java", "ChatRequest.java", "ChatResponse.java", "Usage.java"),
                "health" to listOf("HealthApi.java", "HealthCheck200Response.java"),
                "user" to listOf("UserApi.java", "CreateUserRequest.java", "CreateUserRequestAddress.java", 
                               "UpdateUserRequest.java", "UpdateUserRequestAddress.java", "UserResponse.java", 
                               "UserResponseAddress.java", "UserPageResponse.java", "UserPageResponsePageable.java",
                               "UserPageResponsePageableSort.java", "UserPageResponseSort.java", "UserStatus.java", 
                               "UserRole.java", "ValidationErrorResponse.java", "ValidationErrorResponseValidationErrorsInner.java"),
                "common" to listOf("ErrorResponse.java", "ApiUtil.java")
            )
            
            // Clear and recreate API directory
            if (srcApi.exists()) {
                srcApi.deleteRecursively()
            }
            srcApi.mkdirs()
            
            tagDirs.forEach { (tagName, fileList) ->
                val tagDir = file("$srcApi/$tagName")
                val requestDir = file("$tagDir/request")
                val responseDir = file("$tagDir/response")
                
                tagDir.mkdirs()
                requestDir.mkdirs()
                responseDir.mkdirs()
                
                fileList.forEach { fileName ->
                    val sourceFile = file("${buildGenerated}/${fileName}")
                    val modelSourceFile = file("${buildGenerated}/model/${fileName}")
                    
                    val actualSourceFile = when {
                        sourceFile.exists() -> sourceFile
                        modelSourceFile.exists() -> modelSourceFile
                        else -> null
                    }
                    
                    actualSourceFile?.let { source ->
                        val targetFile = when {
                            fileName.endsWith("Api.java") -> file("$tagDir/$fileName")
                            fileName.contains("Request") -> file("$requestDir/$fileName")
                            fileName.contains("Response") || fileName.contains("Usage") || 
                            fileName.contains("Status") || fileName.contains("Role") -> file("$responseDir/$fileName")
                            else -> file("$tagDir/$fileName")
                        }
                        
                        source.copyTo(targetFile, overwrite = true)
                        
                        // Update package declarations and imports
                        if (targetFile.exists()) {
                            var content = targetFile.readText()
                            
                            // Update package declaration
                            content = when {
                                targetFile.parentFile.name == "request" -> 
                                    content.replace("package com.arc_connects.api.model;", "package com.arc_connects.api.$tagName.request;")
                                           .replace("package com.arc_connects.api;", "package com.arc_connects.api.$tagName.request;")
                                targetFile.parentFile.name == "response" -> 
                                    content.replace("package com.arc_connects.api.model;", "package com.arc_connects.api.$tagName.response;")
                                           .replace("package com.arc_connects.api;", "package com.arc_connects.api.$tagName.response;")
                                else -> 
                                    content.replace("package com.arc_connects.api;", "package com.arc_connects.api.$tagName;")
                                           .replace("package com.arc_connects.api.model;", "package com.arc_connects.api.$tagName;")
                            }
                            
                            // Add ApiUtil import for API files
                            if (targetFile.name.endsWith("Api.java") && !content.contains("import com.arc_connects.api.common.ApiUtil;")) {
                                content = content.replace(
                                    "import io.swagger.v3.oas.annotations.ExternalDocumentation;",
                                    "import com.arc_connects.api.common.ApiUtil;\nimport io.swagger.v3.oas.annotations.ExternalDocumentation;"
                                )
                            }
                            
                            // Update import statements - fix cross-references between tags
                            content = content
                                .replace("import com.arc_connects.api.model.ChatRequest;", "import com.arc_connects.api.chat.request.ChatRequest;")
                                .replace("import com.arc_connects.api.model.ChatResponse;", "import com.arc_connects.api.chat.response.ChatResponse;")
                                .replace("import com.arc_connects.api.model.Usage;", "import com.arc_connects.api.chat.response.Usage;")
                                .replace("import com.arc_connects.api.model.HealthCheck200Response;", "import com.arc_connects.api.health.response.HealthCheck200Response;")
                                .replace("import com.arc_connects.api.model.CreateUserRequest;", "import com.arc_connects.api.user.request.CreateUserRequest;")
                                .replace("import com.arc_connects.api.model.CreateUserRequestAddress;", "import com.arc_connects.api.user.request.CreateUserRequestAddress;")
                                .replace("import com.arc_connects.api.model.UpdateUserRequest;", "import com.arc_connects.api.user.request.UpdateUserRequest;")
                                .replace("import com.arc_connects.api.model.UpdateUserRequestAddress;", "import com.arc_connects.api.user.request.UpdateUserRequestAddress;")
                                .replace("import com.arc_connects.api.model.UserResponse;", "import com.arc_connects.api.user.response.UserResponse;")
                                .replace("import com.arc_connects.api.model.UserResponseAddress;", "import com.arc_connects.api.user.response.UserResponseAddress;")
                                .replace("import com.arc_connects.api.model.UserPageResponse;", "import com.arc_connects.api.user.response.UserPageResponse;")
                                .replace("import com.arc_connects.api.model.UserPageResponsePageable;", "import com.arc_connects.api.user.response.UserPageResponsePageable;")
                                .replace("import com.arc_connects.api.model.UserPageResponsePageableSort;", "import com.arc_connects.api.user.response.UserPageResponsePageableSort;")
                                .replace("import com.arc_connects.api.model.UserPageResponseSort;", "import com.arc_connects.api.user.response.UserPageResponseSort;")
                                .replace("import com.arc_connects.api.model.UserStatus;", "import com.arc_connects.api.user.response.UserStatus;")
                                .replace("import com.arc_connects.api.model.UserRole;", "import com.arc_connects.api.user.response.UserRole;")
                                .replace("import com.arc_connects.api.model.ValidationErrorResponse;", "import com.arc_connects.api.user.response.ValidationErrorResponse;")
                                .replace("import com.arc_connects.api.model.ValidationErrorResponseValidationErrorsInner;", "import com.arc_connects.api.user.response.ValidationErrorResponseValidationErrorsInner;")
                                .replace("import com.arc_connects.api.model.ErrorResponse;", "import com.arc_connects.api.common.response.ErrorResponse;")
                                .replace("import com.arc_connects.api.model.ApiUtil;", "import com.arc_connects.api.common.ApiUtil;")
                                .replace("import com.arc_connects.api.ApiUtil;", "import com.arc_connects.api.common.ApiUtil;")
                            
                            targetFile.writeText(content)
                        }
                    }
                }
            }
            
            println("Generated sources organized by tags in: $srcApi")
        }
    }
}

sourceSets {
    main {
        java {
            srcDir("src/main/kotlin")
        }
        kotlin {
            srcDir("src/main/kotlin")
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// Custom task to organize generated files by tag structure
tasks.register("organizeGeneratedFiles") {
    doLast {
        val generatedDir = file("${layout.buildDirectory.get()}/generated/src/main/java")
        val baseApiDir = file("$generatedDir/com/arc_connects/api")
        val modelPackageDir = file("$generatedDir/com/arc_connects/api/model")
        
        if (baseApiDir.exists()) {
            // Find API files and organize by tag
            baseApiDir.listFiles()?.forEach { file ->
                if (file.name.endsWith("Api.java")) {
                    val tagName = file.name.replace("Api.java", "").lowercase()
                    val tagDir = file("$baseApiDir/$tagName")
                    tagDir.mkdirs()
                    
                    // Move API file to tag directory
                    file.copyTo(File(tagDir, file.name), overwrite = true)
                    file.delete()
                    
                    // Create request/response directories for each tag
                    val requestDir = file("$tagDir/request")
                    val responseDir = file("$tagDir/response")
                    requestDir.mkdirs()
                    responseDir.mkdirs()
                }
            }
            
            // Organize model files into request/response directories by tag
            if (modelPackageDir.exists()) {
                modelPackageDir.listFiles()?.forEach { file ->
                    val fileName = file.name
                    var moved = false
                    
                    when {
                        fileName.startsWith("Chat") -> {
                            val targetDir = if (fileName.contains("Request")) {
                                file("$baseApiDir/chat/request")
                            } else {
                                file("$baseApiDir/chat/response")
                            }
                            targetDir.mkdirs()
                            file.copyTo(File(targetDir, fileName), overwrite = true)
                            moved = true
                        }
                        fileName.startsWith("Health") -> {
                            val targetDir = if (fileName.contains("Request")) {
                                file("$baseApiDir/health/request")
                            } else {
                                file("$baseApiDir/health/response")
                            }
                            targetDir.mkdirs()
                            file.copyTo(File(targetDir, fileName), overwrite = true)
                            moved = true
                        }
                        // Add more tag patterns as needed
                    }
                    
                    // Delete the original file after moving
                    if (moved) {
                        file.delete()
                    }
                }
            }
        }
    }
}

// Disable the organize task for now to avoid compilation issues
// tasks.named("openApiGenerate") {
//     finalizedBy("organizeGeneratedFiles")
// }

tasks.named("compileJava") {
    dependsOn(tasks.named("copyGeneratedSources"))
}