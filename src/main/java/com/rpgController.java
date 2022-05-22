package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class rpgController {

    @FXML
    Button btnPlayScene1;

    //Passage de la page rpg-view.fxml (Scene1) à chooseCombat.fxml (Scene2) lorsque l'on appuie sur le bouton btnPlayScene1
    public void handleBtn1() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("chooseCombat.fxml")));
        Stage window = (Stage) btnPlayScene1.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }

}