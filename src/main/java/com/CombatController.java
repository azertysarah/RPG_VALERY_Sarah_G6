package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class CombatController{
    @FXML
    Button btnHome, btnBattle;

    //Passage de la page combat.fxml (Scene4) à rpg-view.fxml (Scene1) lorsque l'on appuie sur le bouton btnHomeScene
    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rpg-view.fxml")));
        Stage window = (Stage) btnHome.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }

    @FXML
    GridPane grid;

    public void heroesListDisplay(int warrior, int mage, int hunter, int healer){
        List heroesTeam = new ArrayList();
        heroesTeam.add(warrior);
        heroesTeam.add(mage);
        heroesTeam.add(hunter);
        heroesTeam.add(healer);
        System.out.println(heroesTeam);
    }

    //Création d'une grille avec le même nombre de colonne que le nombre de héros dans la partie
    public void battleDisplay() {
        //Création liste avec le nombre de warrior, mage, hunter et healer entré dans la page précédente


        //Importation des images (warrior, mage, hunter, healer)
        //Image warriorImage = new Image("File:Warrior.png");
        //Image mageImage = new Image("File:Mage.png");
        //Image hunterImage = new Image("File:Hunter.png");
        //Image healerImage = new Image("File:Healer.png");

        //On insere les images dans la grille en fonction des quotas rentrés par l'utilisateur
        //for (int i = 0; i < warrior; i++) {
        //    grid.getChildren().add(new ImageView(warriorImage));
        //}
        //for (int i = 0; i < mage; i++) {
        //    grid.getChildren().add(new ImageView(mageImage));
        //}
        //for (int i = 0; i < hunter; i++) {
        //    grid.getChildren().add(new ImageView(hunterImage));
        //}
        //for (int i = 0; i < healer; i++) {
        //    grid.getChildren().add(new ImageView(healerImage));
        //}
    }
}
