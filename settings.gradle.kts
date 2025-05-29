plugins {
    id("com.gradle.develocity") version("4.0.1")
}

rootProject.name = "advent-of-code-2017"

include("aoc2017")
include("aoc2017:aoc2017-java")
include("aoc2017:aoc2017-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
