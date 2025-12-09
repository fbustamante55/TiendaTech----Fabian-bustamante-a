# TiendaTech 🛒

Sistema de gestión de tienda online desarrollado con Spring Boot para el curso de desarrollo web y patrones.

## 📋 Descripción

TiendaTech es una aplicación web completa para la gestión de una tienda online que permite administrar productos, categorías, usuarios y consultas. El sistema incluye autenticación y autorización basada en roles, almacenamiento de imágenes en Firebase Storage, y soporte multiidioma.

## 🚀 Características

- **Gestión de Productos**: CRUD completo de productos con imágenes
- **Gestión de Categorías**: Administración de categorías de productos
- **Sistema de Usuarios**: Registro, autenticación y gestión de usuarios con roles
- **Seguridad**: Implementación de Spring Security con control de acceso basado en roles
- **Almacenamiento en la Nube**: Integración con Firebase Storage para imágenes
- **Multiidioma**: Soporte para español, inglés, francés y portugués
- **Interfaz Moderna**: Frontend desarrollado con Bootstrap 5, jQuery y Font Awesome

## 🛠️ Tecnologías Utilizadas

### Backend
- **Java 24**
- **Spring Boot 3.5.6**
- **Spring Security** - Autenticación y autorización
- **Spring Data JPA** - Persistencia de datos
- **MySQL** - Base de datos relacional
- **Firebase Admin SDK** - Gestión de almacenamiento en la nube
- **Lombok** - Reducción de código boilerplate
- **Jakarta Validation** - Validación de datos

### Frontend
- **Thymeleaf** - Motor de plantillas
- **Bootstrap 5.3.1** - Framework CSS
- **jQuery 3.7.1** - Biblioteca JavaScript
- **Font Awesome 6.4.2** - Iconos
- **Popper.js 2.11.7** - Utilidades para Bootstrap

## 📦 Requisitos Previos

- **Java 24** o superior
- **Maven 3.6+**
- **MySQL 8.0+**
- **Cuenta de Firebase** con proyecto configurado
- **IDE** (IntelliJ IDEA, Eclipse, VS Code, etc.)

## ⚙️ Configuración

### 1. Clonar el Repositorio

```bash
git clone <url-del-repositorio>
cd TiendaTech----Fabian-bustamante-a
```

### 2. Configurar la Base de Datos

1. Crear una base de datos MySQL llamada `techshop`:
```sql
CREATE DATABASE techshop CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

2. Crear un usuario con los permisos necesarios:
```sql
CREATE USER 'usuario_prueba'@'localhost' IDENTIFIED BY 'Usuar1o_Clave.';
GRANT ALL PRIVILEGES ON techshop.* TO 'usuario_prueba'@'localhost';
FLUSH PRIVILEGES;
```

3. Ejecutar el script SQL para crear las tablas (si está disponible)

### 3. Configurar Firebase

1. Crear un proyecto en [Firebase Console](https://console.firebase.google.com/)
2. Generar una clave de cuenta de servicio (JSON)
3. Colocar el archivo JSON en la ruta configurada en `application.properties`
4. Actualizar las propiedades de Firebase en `application.properties`:
   - `firebase.bucket.name`
   - `firebase.storage.path`
   - `firebase.json.path`
   - `firebase.json.file`

### 4. Configurar Application Properties

Editar `src/main/resources/application.properties` con tus credenciales:

```properties
# Base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/techshop
spring.datasource.username=usuario_prueba
spring.datasource.password=Usuar1o_Clave.

# Firebase
firebase.bucket.name=tu-bucket-name.firebasestorage.app
firebase.storage.path=techshop
firebase.json.path=firebase
firebase.json.file=tu-archivo-firebase.json
```

## 🏃 Ejecutar la Aplicación

### Opción 1: Desde el IDE
1. Importar el proyecto como proyecto Maven
2. Ejecutar la clase `TiendaApplication.java`

### Opción 2: Desde la Terminal

```bash
cd tienda
mvn spring-boot:run
```

La aplicación estará disponible en: `http://localhost:50`

## 📁 Estructura del Proyecto

```
tienda/
├── src/
│   ├── main/
│   │   ├── java/tienda/
│   │   │   ├── config/          # Configuraciones (Firebase, Mensajes)
│   │   │   ├── controller/       # Controladores REST/MVC
│   │   │   │   ├── CategoriaController.java
│   │   │   │   ├── ConsultaController.java
│   │   │   │   ├── IndexController.java
│   │   │   │   └── ProductoController.java
│   │   │   ├── domain/           # Entidades JPA
│   │   │   │   ├── Categoria.java
│   │   │   │   ├── Producto.java
│   │   │   │   ├── Usuario.java
│   │   │   │   └── Rol.java
│   │   │   ├── repository/       # Repositorios JPA
│   │   │   ├── services/         # Lógica de negocio
│   │   │   │   ├── CategoriaService.java
│   │   │   │   ├── FirebaseStorageService.java
│   │   │   │   ├── ProductoService.java
│   │   │   │   └── UsuarioDetailsService.java
│   │   │   ├── SecurityConfig.java
│   │   │   └── TiendaApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── messages*.properties  # Archivos de internacionalización
│   │       ├── static/              # Recursos estáticos (CSS, JS, imágenes)
│   │       └── templates/            # Plantillas Thymeleaf
│   └── test/                    # Pruebas unitarias
└── pom.xml                      # Configuración Maven
```

## 🔐 Seguridad

El sistema implementa Spring Security con:
- Autenticación basada en formularios
- Autorización basada en roles (ROLE_USER, ROLE_ADMIN, etc.)
- Protección de rutas según roles
- Encriptación de contraseñas

## 🌐 Internacionalización

El sistema soporta múltiples idiomas:
- Español (es)
- Inglés (en)
- Francés (fr)
- Portugués (pt)

Los mensajes se encuentran en `src/main/resources/messages*.properties`

## 📝 Funcionalidades Principales

### Gestión de Productos
- Listar productos
- Crear nuevos productos
- Modificar productos existentes
- Eliminar productos
- Subir imágenes a Firebase Storage

### Gestión de Categorías
- Administración completa de categorías
- Asociación de productos a categorías

### Sistema de Usuarios
- Registro de nuevos usuarios
- Login y autenticación
- Gestión de perfiles
- Control de acceso por roles

### Consultas
- Sistema de consultas ampliadas
- Visualización de productos en consultas

## 🧪 Testing

Ejecutar las pruebas unitarias:

```bash
mvn test
```

## 📄 Licencia

Este proyecto fue desarrollado para fines educativos como parte del curso de desarrollo web y patrones.

## 👤 Autor

**Fabian Bustamante**

## 🤝 Contribuciones

Este es un proyecto académico. Las contribuciones son bienvenidas para mejoras y correcciones.

## 📞 Soporte

Para problemas o preguntas, por favor abre un issue en el repositorio.

---

**Nota**: Asegúrate de tener todas las dependencias instaladas y la base de datos configurada antes de ejecutar la aplicación.
