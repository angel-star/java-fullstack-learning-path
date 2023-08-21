# Spring Profiles 演示

这是一个简单的演示，展示了如何在Spring Boot应用程序中使用Spring Profiles。

## 运行应用程序

1. 默认情况下，应用程序将在`dev` profile中运行。
   使用以下命令启动应用程序：
   `./mvnw spring-boot:run`

你应该会看到这条消息：“来自开发环境的问候！”。

2. 要在`prod` profile中运行，请使用：
   `./mvnw spring-boot:run -Dspring-boot.run.profiles=prod`

你应该会看到这条消息：“来自生产环境的问候！”。