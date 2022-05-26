package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class ChooseCombatController {
    //On choisis de rendre la variable public et static pour pouvoir l'utiliser dans d'autres classes (notamment la classe ChooseHeroesController)
    public static int heroesNumber = 0;

    @FXML
    Button btnHome, btnConfirmScene2, vs2, vs3, vs4, vs5;

    //Passage de la page chooseCombat.fxml (Scene2) à rpg-view.fxml (Scene1) lorsque l'on appuie sur le bouton "retour à la page d'accueil" (id: btnHome)
    public void handleBtn() throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rpg-view.fxml")));
        Stage window = (Stage) btnHome.getScene().getWindow();
        window.setScene(new Scene(root, 1500, 1000));
    }

    //Passage de la page chooseCombat.fxml (Scene2) à chooseHeroes.fxml (Scene3) lorsque l'on appuie sur le bouton "Confirmer" (id: btnConfirmScene2)
    public void confirmBtn2to3() throws Exception{
        if (heroesNumber == 0){
            System.out.println("Veuillez choisir un combat");
        }else{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("chooseHeroes.fxml")));
            Stage window = (Stage) btnConfirmScene2.getScene().getWindow();
            window.setScene(new Scene(root, 1500, 1000));
        }
    }

    //Associer les boutons vs2, vs3, vs4, vs5 (respectivement, les boutons correspondant au type de combat 2vs2, 3vs3, 4vs4, 5vs5)
    //à la variable heroesNumber pour pouvoir ensuite savoir combien de personnages faire apparaître
    public void heroesNumber2vs2(){
        heroesNumber = 2;
        //System.out.println("heroesNumber = "+heroesNumber);
    }
    public void heroesNumber3vs3(){
        heroesNumber = 3;
        //System.out.println("heroesNumber = "+heroesNumber);
    }
    public void heroesNumber4vs4(){
        heroesNumber = 4;
        //System.out.println("heroesNumber = "+heroesNumber);
    }
    public void heroesNumber5vs5(){
        heroesNumber = 5;
        //System.out.println("heroesNumber = "+heroesNumber);
    }
    //Les commandes System.out.println("") ne servent que de vérification dans la console

}
