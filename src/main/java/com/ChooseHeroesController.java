package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

import static com.ChooseCombatController.heroesNumber;

public class ChooseHeroesController {

    @FXML
    Button btnHomeScene, btnConfirmScene3;

    //Passage de la page chooseHeroes.fxml (Scene3) à rpg-view.fxml (Scene1) lorsque l'on appuie sur le bouton btnHomeScene3
    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rpg-view.fxml")));
        Stage window = (Stage) btnHomeScene.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }

    @FXML
    TextField numberWarrior, numberMage, numberHunter, numberHealer;

    @FXML
    Label errorScene3;

    //Lorsque l'on appuie sur le bouton "Confirmer" (id: btnConfirmScene3)
    public void confirmBtn3to4() {
        try{
            //Associer les champs entrés par l'utilisateur dans des variables
            int warrior = Integer.parseInt(numberWarrior.getText());
            int mage = Integer.parseInt(numberMage.getText());
            int hunter = Integer.parseInt(numberHunter.getText());
            int healer = Integer.parseInt(numberHealer.getText());
            //Si la somme des nombres rentrés par l'utilisateur est bien égale au nombre de héros précédemment selectionné, alors on passe à la page suivante
            if (warrior+mage+hunter+healer == heroesNumber){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("combat.fxml")));
                Stage window = (Stage) btnConfirmScene3.getScene().getWindow();
                window.setScene(new Scene(root, 1500, 1000));
            //Sinon on affiche un message d'erreur
            }else{
                errorScene3.setText("The maths are wrong I guess...");
            }
        //L'utilisateur doit rentrer des entiers dans chaque case, il doit donc mettre un 0 s'il y a un héros qu'il ne veut pas au lieu de laisser le champ vide
        }catch(NumberFormatException e){
            errorScene3.setText("Please enter numbers in each field (intergers)");
        }catch(Exception e){
            errorScene3.setText("Error");
        }
    }
}
