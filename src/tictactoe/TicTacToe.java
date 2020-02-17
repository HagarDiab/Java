/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Hagar Diab
 */
public class TicTacToe extends Application {

    splachScreen sc = new splachScreen();

    signInSceneBase signIn = new signInSceneBase();
    FXMLTmpBase tmp = new FXMLTmpBase();

    @Override
    public void start(Stage stage) throws Exception {

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(sc.logo);
        scaleTransition.setNode(sc.gameTitle);
        scaleTransition.setByY(1.5);
        scaleTransition.setByX(1.5);
        scaleTransition.setCycleCount(30);
        scaleTransition.setAutoReverse(false);
        scaleTransition.play();

        stage.setMinWidth(361.0);
        stage.setMinHeight(601.0);

        /*Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("this is called every 5 seconds on UI thread");
            }
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();

        //
        new Timer().schedule(
                new TimerTask() {

            @Override
            public void run() {
                System.out.println("ping");
            }
        }, 0, 5000);*/
        
        
        /*PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished(event -> stage.close());
        delay.play();*/
        
        /*  

    }*/

        Parent root = signIn;
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
