cmake_minimum_required(VERSION 3.8)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(native Kotlin)

konanc_library(
        NAME kluent
        SOURCES ../common/src/main
        TEST_SOURCES ../common/src/test
)


konanc_executable(
        NAME HelloWorld
        SOURCES src/main/kotlin
        LIBRARIES kluent
)