plugins {
    java
    id("org.springframework.boot") version "2.3.5.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.10.RELEASE" apply false
    kotlin("jvm") version "1.3.72" apply false
    kotlin("plugin.spring") version "1.3.72" apply false
    kotlin("plugin.jpa") version "1.3.72" apply false
}


allprojects {
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/nexus/content/groups/public/")
        }
        maven {
            url = uri("https://maven.aliyun.com/nexus/content/groups/spring/")
        }
        mavenCentral()

        jcenter()
    }


}

