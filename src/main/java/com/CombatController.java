package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class CombatController {



    @FXML
    Button btnHome;

    //Passage de la page combat.fxml (Scene4) à rpg-view.fxml (Scene1) lorsque l'on appuie sur le bouton btnHomeScene
    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rpg-view.fxml")));
        Stage window = (Stage) btnHome.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
}
}
