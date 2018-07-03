# sprint-auth-java
Provides implementation of OAuth 2 and PostgreSQL using Spring Boot. It lets user be created and added to PostgreSQL database. Then OAuth tokens can be generated by calling POST endpoint /oauth/token with credentials in body. The response gives the access token. We get a stateless application where each API call is verified by passing access_token in header. Only /login and /register endpoint don't require authentication.

### Pre-Requisite
PostgreSQL and IDE like IntelliJ

### Run
Run using IntelliJ  or Ecllipse IDE
or use maven command line
```
mvn spring-boot:run
```

### Implement
Use postman to call the POST endpont /oauth/token and save access_token recieved in response to make authenticated API call. 
