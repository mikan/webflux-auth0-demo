# webflux-auth0-demo

Spring Boot (2.1.0.M1) WebFlux + Spring Security (5.1.0.M2) で Auth0 にログインするデモ。
Auth0 とは純粋な OIDC (OpenID Connect) でやりとりし、Auth0 提供の支援ライブラリは一切使用しない。

## オンラインデモ

https://webflux-auth0-demo.herokuapp.com/

## 必要なもの

- Auth0 テナント
  - Allowed Callback URLs に次を指定: `http://localhost:8080/login/oauth2/code/auth0`
- `application.yml` 用設定値
  - Domain
  - Client ID
  - Client Secret

## ローカルでの動かし方

```bash
export AUTH0_DOMAIN=xxx.auth0.com
export AUTH0_CLIENT_ID=xxx
export AUTH0_CLIENT_SECRET=xxx
./gradlew build
java -jar build/libs/webflux-auth0-demo.jar
```

## 参考

- [Spring Security Reference](https://docs.spring.io/spring-security/site/docs/5.1.0.M2/reference/htmlsingle/) (5.1.0.M2)
