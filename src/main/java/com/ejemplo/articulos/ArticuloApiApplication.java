
// Paquete principal del proyecto
package com.ejemplo.articulos;

// Importa la clase SpringApplication que se usa para lanzar la app
import org.springframework.boot.SpringApplication;
// Importa la anotación @SpringBootApplication que indica una app Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotación que marca esta clase como punto de entrada de una aplicación Spring Boot
@SpringBootApplication
public class ArticuloApiApplication {
    // Método principal que lanza la aplicación
    public static void main(String[] args) {
        SpringApplication.run(ArticuloApiApplication.class, args); // Inicia la aplicación
    }
}

// flujo simplificado de la aplicación:
// 1. El cliente hace una petición HTTP a un endpoint definido en ArticuloController.
// 2. El controlador recibe la petición y llama al servicio correspondiente (ArticuloService).
// 3. El servicio realiza la lógica de negocio y llama al repositorio (ArticuloRepository) para acceder a los datos.
// 4. El repositorio maneja la persistencia de los datos (en este caso, una lista en memoria) y devuelve los resultados al servicio.
// 5. El servicio procesa los datos y los devuelve al controlador.
// 6. El controlador construye la respuesta HTTP y la envía de vuelta al cliente.

//Arranca la aplicacion de springboot
//inicializa el contexto de spring, 
//escanea los componentes, que son los paquetes que busca para encontrar las clases anotadas con @Component, @Service, @Repository, @Controller, @RestController   etc.
//crea instancias de esas clases y las inyecta donde se necesiten (por ejemplo, el servicio en el controlador).
//esto es lo que se llama inyección de dependencias, que es un principio de diseño que permite que las clases dependan de otras clases sin tener que crearlas directamente, lo que facilita el mantenimiento y la escalabilidad de la aplicación.
// levanta el servidor web integrado (como Tomcat) para escuchar las peticiones HTTP en el puerto configurado (por defecto, el 8080).
//una vez que el contexto de spring está listo, la aplicación está lista para recibir peticiones HTTP y manejar la lógica de negocio definida en los controladores, servicios y repositorios.




