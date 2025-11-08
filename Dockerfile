FROM openjdk:21
# 设置构建参数
ARG JARNAME
# 设置构建参数
ARG JARPORT
# 映射jar包
COPY ${JARNAME}.jar app.jar
# 端口
EXPOSE ${JARPORT}
# 运行命令
ENTRYPOINT ["java", "-jar", "-Duser.timezone=Asia/Shanghai","-Dfile.encoding=UTF-8", "app.jar", "--spring.profiles.active=pro"]
