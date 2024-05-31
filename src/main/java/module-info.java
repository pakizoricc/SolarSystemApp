module com.example.solarsystemapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solarsystemapp to javafx.fxml;
    exports com.example.solarsystemapp;
}