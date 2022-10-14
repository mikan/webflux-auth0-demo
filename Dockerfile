FROM eclipse-temurin:11
COPY ./build/libs/webflux-auth0-demo.jar .
ENTRYPOINT ["java","-jar","/webflux-auth0-demo.jar","--server.port=80"]
