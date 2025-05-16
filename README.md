🚀 MJ-SpringBoot-Demo Project
Java
Spring Boot
Gradle
Lombok

A Spring Boot demo project with Gradle build system and Lombok support.

📁 Project Structure
MJ-SpringBoot-Demo/
├── .gitignore          # Git ignore rules for IDE files and build artifacts
├── build.gradle        # Gradle build configuration with dependencies
├── gradlew.bat         # Gradle wrapper for Windows
└── settings.gradle     # Project name configuration
⚙️ Technologies
Java 21

Spring Boot 3.4.5

Gradle Build Tool

Lombok - For reducing boilerplate code

Spring Web - For building web applications

Spring Actuator - For application monitoring

Spring DevTools - For developer productivity

🛠️ Setup
Clone the repository:

bash
git clone https://github.com/your-repo/MJ-SpringBoot-Demo.git
cd MJ-SpringBoot-Demo
Build the project:

bash
./gradlew build  # On Unix/Linux
gradlew.bat build # On Windows
Run the application:

bash
./gradlew bootRun
🔧 Dependencies
Key dependencies configured in build.gradle:

groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-actuator'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    
    // Lombok
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    
    // Testing
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
🚫 Git Ignore Rules
The .gitignore file excludes:

IDE-specific files (IntelliJ, Eclipse, VS Code)

Build directories (build/, out/, bin/)

Gradle/NB project files

Mac OS .DS_Store files
