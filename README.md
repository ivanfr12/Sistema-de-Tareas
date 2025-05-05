# 📝 Sistema de Gestión de Tareas

![Java](https://img.shields.io/badge/Java-17+-orange?logo=java)
![JavaFX](https://img.shields.io/badge/JavaFX-UI-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F?logo=spring)
![License](https://img.shields.io/badge/License-MIT-green)

Sistema de escritorio hecho en Java que permite **gestionar tareas** mediante una interfaz gráfica JavaFX y una arquitectura sólida con **Spring Boot + Spring Data JPA**. Ideal para organizar actividades de forma local.

---

## 📌 Características

✅ Listado dinámico de tareas  
➕ Agregar nuevas tareas  
✏️ Editar tareas existentes  
❌ Eliminar tareas seleccionadas  
🧹 Limpieza automática del formulario  

---

## 🛠️ Tecnologías Usadas

| Herramienta      | Uso                             |
|------------------|----------------------------------|
| Java 17+         | Lenguaje principal               |
| JavaFX           | Interfaz gráfica (FXML + Scene) |
| Spring Boot      | Backend / configuración          |
| Spring Data JPA  | Acceso a base de datos           |
| H2 Database      | Base de datos en memoria (dev)   |
| Maven            | Gestión de dependencias          |

---

## 🗂️ Estructura del Proyecto

📁 src
├─ 📦 gm.tareas
│ ├─ TareasApplication.java
│ ├─ modelo/
│ ├─ presentacion/
│ ├─ controlador/
│ └─ servicio/
├─ 📄 index.fxml
└─ 📄 application.properties


- `IndexControlador.java`: Controlador de eventos para la interfaz.
- `TareaServicio.java`: Lógica de negocio (guardar, eliminar, listar).
- `TareasApplication.java`: Punto de entrada principal.
- `index.fxml`: Diseño visual de la aplicación.

---

## 🚀 Cómo Ejecutar

1. Clona el repositorio:

```bash
git clone https://github.com/ivanfr12/Sistema-de-Tareas.git
cd sistema-tareas

Compila y ejecuta con Maven:
mvn clean javafx:run
💡 Asegúrate de tener Java 17 y un entorno gráfico disponible.

🧪 Base de Datos
Base de datos: H2 (en memoria)

Se inicializa automáticamente al ejecutar la app.

Puede configurarse para usar MySQL, PostgreSQL o cualquier otro proveedor JPA.

🛤️ Futuras Mejoras
 Conexión con base de datos externa

 Validaciones avanzadas en formularios

 Filtro y búsqueda en el listado

 Sistema de autenticación por usuario

👨‍💻 Autor
Desarrollado por Ivan Rodriguez
GitHub: @ivanfr12

📄 Licencia
Este proyecto está bajo la licencia MIT.


