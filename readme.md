### spring-boot-demo

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:9191/swagger-ui.html

> The REST API endpoints are protected and require an `API Key (JWT token)`.
> You can generate a JWT Token in Swagger UI via `JWT Token Generator` API post end point.
> To generate a token, provide any one of below username and password in a JSON POST request and retrieve the generated JWT token in the response body.
> Copy the value from `Bearer.......` and use it as the API Key value to access the Employee API via "Authorize" in Swagger UI.

> The H2 database automatically create default users with respective roles, and passwords are stored as Bcrypt encrypted hash values.

> Username/Password details as below and refer the role details in h2 database or data.sql file in resources directory.
>  - `admin`/`admin` 
>  - `user1`/`user1`
>  - `user2`/`user2`


- H2 UI : http://localhost:9191/h2-console

> Set the `JDBC URL` value as `jdbc:h2:mem:testdb` for H2 UI.