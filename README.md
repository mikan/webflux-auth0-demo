# webflux-auth0-demo

Spring Boot (2.1.0.M1) WebFlux + Spring Security (5.1.0.M2) で Auth0 にログインするデモ。
Auth0 とは純粋な OIDC (OpenID Connect) でやりとりし、Auth0 提供の支援ライブラリは一切使用しない。

## 必要なもの

- Auth0 テナント
  - Allowed Callback URLs に次を指定: `http://localhost:8080/login/oauth2/code/auth0`
- `application.yml` 用設定値
  - Domain -> `auth0-domain`
  - Client ID -> `spring.security.oauth2.client.registration.auth0.client-id`
  - Client Secret -> `spring.security.oauth2.client.registration.auth0.client-secret`

