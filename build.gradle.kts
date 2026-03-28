plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.projectlombok:lombok:0.11.0")
    implementation("io.rest-assured:rest-assured:5.5.0")
    // Source: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.41.0")
    // Source: https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.10.2")

}

tasks.test {
    //useJUnitPlatform()
    useTestNG()
}