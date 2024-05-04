# Proyecto de Interfaz Gráfica - Jugadores de Fútbol

Este proyecto es una aplicación JavaFX que muestra una interfaz gráfica con información sobre jugadores de fútbol famosos.

## Estructura del Proyecto

El proyecto está organizado en el paquete `ug.programacion` y utiliza la librería JavaFX para la interfaz gráfica. La estructura principal del proyecto incluye:

- `App.java`: Clase principal que extiende de `Application` y configura la escena principal.
- `VBox getVBox(AnchorPane root)`: Método para configurar y retornar un `VBox` con imágenes y etiquetas de jugadores.
- `HBox getHBox(String nombre, String apellido, String fileUrl)`: Método para crear y retornar un `HBox` con la imagen y nombre de un jugador.
- `ImageView createImageView(String fileUrl)`: Método para crear y configurar un `ImageView`.
- `Label createLabel(String nombre, String apellido)`: Método para crear una etiqueta con el nombre completo del jugador.
- `BorderPane getBorderPane()`: Método para configurar y retornar un `BorderPane` para la lista de elementos.
- `BorderPane getBorderPane2()`: Método para configurar y retornar un segundo `BorderPane` con un campo de texto.

## Instrucciones de Uso

1. Clonar el repositorio.
2. Navegar al directorio del proyecto.
3. Ejecutar `App.java` para iniciar la aplicación.

# Licencia
Este proyecto está bajo la licencia MIT. Ver el archivo `LICENSE` para más detalles.

