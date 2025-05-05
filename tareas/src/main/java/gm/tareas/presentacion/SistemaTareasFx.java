package gm.tareas.presentacion;

import gm.tareas.TareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SistemaTareasFx extends Application {
    private ConfigurableApplicationContext applicationContext;

//    public static void main(String[] args) {
//        launch(args);
//    }


    @Override //sobrescribiendo un método del ciclo de vida de JavaFX
    // init: Método que se ejecuta al iniciar la app, antes de mostrar la ventana.
    public void init(){
        // Inicia el contexto de Spring Boot
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    @Override
    // Método principal para cargar y mostrar la ventana
    public void start(Stage stage) throws Exception {
        // FXMLLoader = Carga la interfaz desde el archivo FXML.
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean); // : Usa Spring para inyectar el controlador.
        Scene escena = new Scene(loader.load()); // Crea la escena con el diseño cargado.
        stage.setScene(escena);
        stage.show();
    }
    // Metodo de cierre de aplicacion
    public void stop(){
        applicationContext.close(); //  Cierra el contexto de Spring.
        Platform.exit(); // Cierra la aplicación JavaFX.
    }
}
