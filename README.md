# Create Cms Project

# Dependency
+ `spring-boot-starter-web`
+ `spring-boot-starter-thymeleaf`
+ `spring-boot-starter-data-jpa`
+ `spring-boot-starter-test`
+ `mysql-connector-java`
+  `h2`
# Project Basic Structure
```
.
└── com
    └── wangyang
        └── cms
            ├── CmsApplication.java
            ├── config
            ├── controller
            ├── core
            ├── expection
            ├── filter
            ├── listener
            ├── pojo
            │   ├── dto
            │   ├── entity
            │   ├── params
            │   ├── support
            │   └── vo
            ├── repository
            ├── service
            │   └── impl
            └── utils

```
# Project Configuration

+ spring boot 
# Load External Resource
+ Static resource Loading

> If `file:${user.home}/.cms/` did not go to `classpath:/html/`

```properties
spring.resources.static-locations= file:${user.home}/.cms/, classpath:/static/
```

+ Configuration file loading
```
 --spring.config.location=/home/wy/.cms/application.properties 
```

```java
@SpringBootApplication
public class CmsApplication {

	public static void main(String[] args) {
		// Customize the spring config location
		System.setProperty("spring.config.additional-location", "file:${user.home}/.cms/cms.properties");
		SpringApplication.run(CmsApplication.class, args);
	}
	
}
```