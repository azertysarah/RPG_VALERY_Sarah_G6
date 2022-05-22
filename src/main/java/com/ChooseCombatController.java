package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class ChooseCombatController {
    @FXML
    Button btnHome, btnConfirmScene2;

    //Passage de la page chooseCombat.fxml (Scene2) à rpg-view.fxml (Scene1) lorsque l'on appuie sur le bouton btnHomeScene
    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rpg-view.fxml")));
        Stage window = (Stage) btnHome.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }

    //Passage de la page chooseCombat.fxml (Scene2) à chooseHeroes.fxml (Scene3) lorsque l'on appuie sur le bouton btnConfirmScene2
    public void confirmBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("chooseHeroes.fxml")));
        Stage window = (Stage) btnConfirmScene2.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }
}
