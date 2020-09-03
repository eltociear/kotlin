import org.jetbrains.kotlin.pill.PillExtension

description = "Kotlinx Serialization IDEA Plugin"

plugins {
    kotlin("jvm")
    id("jps-compatible")
}

pill {
    variant = PillExtension.Variant.IDE
}

dependencies {
    compileOnly(project(":js:js.translator"))

    compile(project(":kotlinx-serialization-compiler-plugin"))
    compile(project(":idea"))
    compile(project(":idea:idea-gradle"))
    compile(project(":idea:idea-maven"))
    compile(project(":plugins:annotation-based-compiler-plugins-ide-support"))
    compileOnly(intellijDep())
    Platform[192].orHigher {
        compileOnly(intellijPluginDep("java"))
    }
    excludeInAndroidStudio(rootProject) { compileOnly(intellijPluginDep("maven")) }
    compileOnly(intellijPluginDep("gradle"))

    testCompileOnly(intellijDep())
    testRuntimeOnly(intellijDep())
}

sourceSets {
    "main" { projectDefault() }
    "test" { projectDefault() }
}

runtimeJar()

projectTest(parallel = true) {

}