cmake_minimum_required(VERSION 3.8)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(native Kotlin)

konanc_executable(
        NAME HelloWorld
        SOURCES src/main/kotlin/hello.kt ../common/src/main/kotlin/org/amshove/kluent/Basic.kt
)