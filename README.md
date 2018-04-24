# Spring-Boot-Profile-config

### $ mvn clean install 
or
### mvn clean package

### $ java -jar -Dspring.profiles.active=dev target/spring-boot-profile-config-0.0.1-SNAPSHOT.jar 

resourceUrl: http://dev.java.com
resourcePort: [8080]
resourceCount: 2

### $ java -jar -Dspring.profiles.active=prod target/spring-boot-profile-config-0.0.1-SNAPSHOT.jar

resourceUrl: http://prod.java.com
resourcePort: [80, 443]
resourceCount: 2

### $ java -jar -Dspring.profiles.active=qa target/spring-boot-profile-config-0.0.1-SNAPSHOT.jar

resourceUrl: http://qa.java.com
resourcePort: [80, 443, 7]
resourceCount: 3
