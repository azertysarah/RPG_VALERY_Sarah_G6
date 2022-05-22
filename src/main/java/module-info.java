module com.example.rpg_valery_sarah_g6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com to javafx.fxml;
    exports com;
}