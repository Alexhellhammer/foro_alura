![Logo del Proyecto](https://github.com/Alexhellhammer/foro_alura/blob/main/IMG/LOGO.png?raw=true)
# Challenge Foro Alura

Este proyecto es parte del desafío de creación de un sistema de foro utilizando Spring Boot.

## Descripción del Proyecto

El proyecto se centra en crear una API RESTful para gestionar temas de discusión (topics) y respuestas (responses) dentro de cursos.

## Funcionalidades Principales

- **Crear, Leer, Actualizar y Eliminar (CRUD)** operaciones para temas y respuestas.
- Validación de datos utilizando Spring Boot Validation.
- Integración con base de datos MySQL.
- Seguridad con Spring Security y JWT (JSON Web Token).
- Paginación y ordenamiento de resultados.

## Requisitos

- Java 17+
- Maven
- MySQL
- IntelliJ IDEA (u otro IDE)

## Configuración del Proyecto

### Configurar la Base de Datos

Crea una base de datos en MySQL y actualiza las propiedades en `src/main/resources/application.properties` con tus credenciales de base de datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nombre_de_tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration```

## Estructura del Proyecto

La estructura del proyecto sigue un patrón estándar de aplicación Spring Boot:


En esta estructura:

- `src/main/java/com/proyectAlex/Challenge_Foro_Alura/` es el directorio principal donde se encuentra la lógica de la aplicación.
- `controller/`: Contiene los controladores REST que manejan las peticiones HTTP.
- `dto/`: Contiene los DTOs (Data Transfer Objects) utilizados para transferir datos entre capas.
- `models/`: Contiene las entidades JPA que representan las tablas de la base de datos.
- `repository/`: Contiene los repositorios JPA que manejan la capa de persistencia.
- `security/`: Contiene la configuración de seguridad, incluyendo la configuración de Spring Security y JWT.
- `service/`: Contiene los servicios de negocio que implementan la lógica de la aplicación.
- `src/test/java/com/proyectAlex/Challenge_Foro_Alura/`: Contiene las pruebas unitarias y de integración.
- `src/main/resources/`: Contiene los recursos de la aplicación, incluyendo archivos de configuración y plantillas.
- `target/`: Directorio generado por Maven que contiene los archivos compilados y generados.
- `.gitignore`: Archivo que especifica qué archivos y directorios ignorar en Git.
- `mvnw` y `mvnw.cmd`: Scripts de Maven para ejecutar comandos Maven en sistemas Unix y Windows, respectivamente.
- `README.md`: Archivo de Markdown que contiene la documentación principal del proyecto.

Esta estructura está diseñada para organizar de manera eficiente los diferentes componentes de una aplicación Spring Boot. Asegúrate de adaptar esta estructura según las necesidades específicas de tu proyecto.


##Uso de la API
Autenticación
Primero, obtén un token JWT haciendo una solicitud POST a /api/authenticate con tus credenciales.

Endpoints Principales
Crear Tema: POST /api/topics
Listar Temas: GET /api/topics
Obtener Detalles de un Tema: GET /api/topics/{id}
Actualizar Tema: PUT /api/topics/{id}
Eliminar Tema: DELETE /api/topics/{id}
##Estructura del Proyecto
src/main/java/com/proyectAlex/Challenge_Foro_Alura: Contiene el código fuente del proyecto.

controllers: Controladores REST.
models: Entidades JPA.
repositories: Repositorios JPA.
services: Lógica de negocio.
config: Configuraciones de seguridad y aplicación.
src/main/resources: Recursos del proyecto.

application.properties: Configuraciones de la aplicación.
db/migration: Migraciones de base de datos con Flyway.
##Contribución
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

##Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva_caracteristica).
Realiza tus cambios (git commit -am 'Añadir nueva característica').
Haz push a la rama (git push origin feature/nueva_caracteristica).
Abre un Pull Request.
Licencia
Este proyecto está bajo la licencia MIT. Ver el archivo LICENSE para más detalles.

##Contacto
Para cualquier duda o sugerencia, por favor contacta a Alex en [alexP@ejemplo.com].
