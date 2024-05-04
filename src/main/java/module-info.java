module ug.programacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens ug.programacion to javafx.fxml;
    exports ug.programacion;
}
