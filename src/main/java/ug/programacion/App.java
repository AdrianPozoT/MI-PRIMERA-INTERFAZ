package ug.programacion;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 600, 600);

        root.getChildren().add(getVBox(root));
        root.getChildren().add(getBorderPane());
        root.getChildren().add(getBorderPane2());
        
      

        primaryStage.setTitle("INTERFAZ GRAFICA - JUGADORES DE FUTBOL");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public VBox getVBox (AnchorPane root){
        VBox vBox = new VBox();
        vBox.setSpacing(10);

        vBox.setPrefSize(300, 580);
        String style = "-fx-border-color: #000000; -fx-border-width: 3px";
        vBox.setStyle(style);

        AnchorPane.setTopAnchor(vBox, 10.0);
        AnchorPane.setLeftAnchor(vBox, 10.0);  

        vBox.getChildren().add(getHBox("Cristiano", "Ronaldo", "C:\\INSTALADORES\\Programacion_3S\\session02\\src\\main\\resources\\ug\\programacion\\Cr7.jpeg"));
        vBox.getChildren().add(getHBox("Lionel", "Messi", "C:\\INSTALADORES\\Programacion_3S\\session02\\src\\main\\resources\\ug\\programacion\\Messi.jpg"));
        vBox.getChildren().add(getHBox("Erling", "Haaland", "C:\\INSTALADORES\\Programacion_3S\\session02\\src\\main\\resources\\ug\\programacion\\Haaland.jpg"));
        vBox.getChildren().add(getHBox("Neymar", "Jr", "C:\\INSTALADORES\\Programacion_3S\\session02\\src\\main\\resources\\ug\\programacion\\Neymar.jpeg"));
        vBox.getChildren().add(getHBox("Kylian", "Mbappe", "C:\\INSTALADORES\\Programacion_3S\\session02\\src\\main\\resources\\ug\\programacion\\Mbappe.jpg"));
        vBox.setPadding(new Insets(15, 12, 15, 12));




        return vBox;
    }

    public HBox getHBox ( String nombre, String apellido, String fileUrl){
        HBox hbox = new HBox();
        hbox.setSpacing(10);

        String style = "-fx-border-color: #000000; -fx-border-width: 3px";
      
        hbox.setStyle(style);

        hbox.setPrefSize(4, 2);

        ImageView imageView = createImageView(fileUrl);
        Label label = createLabel(nombre, apellido);

        hbox.getChildren().addAll(imageView, label);
    

        
        return hbox;
    }

    public ImageView createImageView(String fileUrl){
        File file = new File(fileUrl);
        ImageView imageView = new ImageView(file.toURI().toString());
        
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true); // Para que no se vean los piquitos de pixeles
        imageView.setCache(true); // para el rendimiento al cargar la imagen

        return imageView;
    }
  
    public Label createLabel (String nombre, String apellido){
        Label label = new Label(nombre + " " + apellido);
        return label;
    }

    public BorderPane getBorderPane (){
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(300, 580);

        String style = "-fx-background-color: #000000;";
        String style2 = "-fx-border-color: #000000; -fx-border-width: 3px;";
        borderPane.setStyle(style2);

        AnchorPane.setTopAnchor(borderPane, 10.0);
        AnchorPane.setRightAnchor(borderPane, 10.0);
        AnchorPane.setLeftAnchor(borderPane, 320.0);
        AnchorPane.setBottomAnchor(borderPane, 100.0);


        ListView lstView = new ListView<>();
        
        borderPane.setCenter(lstView);
    

        return borderPane;
    }

    public BorderPane getBorderPane2 (){
        BorderPane bdpPane = new BorderPane();
        bdpPane.setPrefSize(200, 100);

        AnchorPane.setRightAnchor(bdpPane, 10.0);
        AnchorPane.setLeftAnchor(bdpPane, 320.0);
        AnchorPane.setTopAnchor(bdpPane, 510.0);
        AnchorPane.setBottomAnchor(bdpPane, 10.0);

        String style = "-fx-background-color: #000000;";
        String style2 = "-fx-border-color: #000000; -fx-border-width: 3px;";
        

        TextField txtField = new TextField("Escribir algo...");

        bdpPane.setCenter(txtField);

        return bdpPane;
    }


    public static void main(String[] args) {
        launch(args);
    }

}
