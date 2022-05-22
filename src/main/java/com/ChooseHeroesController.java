package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class ChooseHeroesController {

    @FXML
    Button btnHomeScene;

    //Passage de la page chooseHeroes.fxml (Scene3) à rpg-view.fxml (Scene1) lorsque l'on appuie sur le bouton btnHomeScene3
    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rpg-view.fxml")));
        Stage window = (Stage) btnHomeScene.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }
}
