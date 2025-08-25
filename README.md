# 🎮 API REST de Videojuegos

Este proyecto es una **API REST** desarrollada en **Spring Boot** con Maven, que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre una colección de videojuegos.  
Los datos se almacenan en una base de datos relacional mediante **Spring Data JPA**.

---

## 🚀 Tecnologías usadas
- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- MySQL / H2 (dependiendo de tu configuración)
- Postman (para pruebas)

---

## 📌 Endpoints disponibles

La API expone los siguientes endpoints bajo la ruta base:

http://localhost:8080/api/v1/videogames

makefile
Copy
Edit

### 1️⃣ Crear un videojuego (POST)
**Endpoint:**  
POST /api/v1/videogames

css
Copy
Edit

**Ejemplo de body JSON:**
```json
{
  "title": "The Legend of Zelda: Tears of the Kingdom",
  "genre": "Action-Adventure",
  "platform": "Nintendo Switch",
  "releaseYear": 2023,
  "developer": "Nintendo"
}
Respuesta:

json
Copy
Edit
{
  "id": 1,
  "title": "The Legend of Zelda: Tears of the Kingdom",
  "genre": "Action-Adventure",
  "platform": "Nintendo Switch",
  "releaseYear": 2023,
  "developer": "Nintendo"
}
2️⃣ Obtener todos los videojuegos (GET)
Endpoint:

bash
Copy
Edit
GET /api/v1/videogames
Respuesta:

json
Copy
Edit
[
  {
    "id": 1,
    "title": "The Legend of Zelda: Tears of the Kingdom",
    "genre": "Action-Adventure",
    "platform": "Nintendo Switch",
    "releaseYear": 2023,
    "developer": "Nintendo"
  },
  {
    "id": 2,
    "title": "God of War: Ragnarok",
    "genre": "Action",
    "platform": "PlayStation 5",
    "releaseYear": 2022,
    "developer": "Santa Monica Studio"
  }
]
3️⃣ Obtener un videojuego por ID (GET)
Endpoint:

bash
Copy
Edit
GET /api/v1/videogames/{id}
Ejemplo:

bash
Copy
Edit
GET /api/v1/videogames/1
Respuesta:

json
Copy
Edit
{
  "id": 1,
  "title": "The Legend of Zelda: Tears of the Kingdom",
  "genre": "Action-Adventure",
  "platform": "Nintendo Switch",
  "releaseYear": 2023,
  "developer": "Nintendo"
}
4️⃣ Actualizar un videojuego (PUT)
Endpoint:

bash
Copy
Edit
PUT /api/v1/videogames/{id}
Ejemplo (actualizando el título):

json
Copy
Edit
{
  "title": "The Legend of Zelda: Breath of the Wild",
  "genre": "Action-Adventure",
  "platform": "Nintendo Switch",
  "releaseYear": 2017,
  "developer": "Nintendo"
}
Respuesta:

json
Copy
Edit
{
  "id": 1,
  "title": "The Legend of Zelda: Breath of the Wild",
  "genre": "Action-Adventure",
  "platform": "Nintendo Switch",
  "releaseYear": 2017,
  "developer": "Nintendo"
}
5️⃣ Eliminar un videojuego (DELETE)
Endpoint:

bash
Copy
Edit
DELETE /api/v1/videogames/{id}
Ejemplo:

bash
Copy
Edit
DELETE /api/v1/videogames/1
Respuesta (204 No Content):

mathematica
Copy
Edit
Sin contenido
📷 Capturas de Postman
Puedes agregar capturas de pantalla de tus pruebas en Postman, por ejemplo:

POST creando un juego

GET mostrando todos

GET mostrando uno por id

PUT actualizando un juego

DELETE eliminando un juego

(Si prefieres, puedes crear una carpeta screenshots/ en el repo y enlazarlas con markdown)

⚙️ Cómo ejecutar el proyecto
Clona el repositorio:

bash
Copy
Edit
git clone https://github.com/tu-usuario/tu-repo.git
Entra al directorio:

bash
Copy
Edit
cd tu-repo
Ejecuta el proyecto con Maven:

bash
Copy
Edit
mvn spring-boot:run
La API estará disponible en:

bash
Copy
Edit
http://localhost:8080/api/v1/videogames
