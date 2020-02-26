package tictactoe;

import javafx.animation.PauseTransition;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class SplachScreenBase extends BorderPane {

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final ImageView logo;
    protected final Label label;

    public SplachScreenBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        logo = new ImageView();
        label = new Label();

        setId("parentPane");
        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(578.0);
        setPrefWidth(600.0);
        getStylesheets().add("/tictactoe/../css/styles.css");

        BorderPane.setAlignment(leftSideAnchorPane, javafx.geometry.Pos.CENTER);
        leftSideAnchorPane.setPrefHeight(561.0);
        leftSideAnchorPane.setPrefWidth(200.0);
        setLeft(leftSideAnchorPane);

        BorderPane.setAlignment(rightSideAnchorPane, javafx.geometry.Pos.CENTER);
        rightSideAnchorPane.setPrefHeight(561.0);
        rightSideAnchorPane.setPrefWidth(207.0);
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.BOTTOM_CENTER);
        containerPane.setId("contentPane");
        containerPane.setMaxWidth(USE_PREF_SIZE);
        containerPane.setMinWidth(USE_PREF_SIZE);
        containerPane.setPrefHeight(561.0);
        containerPane.setPrefWidth(382.0);

        contentPane.setPrefHeight(647.0);
        contentPane.setPrefWidth(393.0);
        contentPane.getStylesheets().add("/tictactoe/../css/styles.css");

        logo.setFitHeight(60.0);
        logo.setFitWidth(60.0);
        logo.setId("logo");
        logo.setLayoutX(167.0);
        logo.setLayoutY(176.0);
        logo.setPickOnBounds(true);
        logo.setPreserveRatio(true);
        logo.setImage(new Image(getClass().getResource("../img/logo/icon.png").toExternalForm()));

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(78.0);
        label.setLayoutY(297.0);
        label.setPrefHeight(19.0);
        label.setPrefWidth(238.0);
        label.setText("Tic Tac Toe Game");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        label.setFont(new Font("System Bold", 13.0));
        setCenter(containerPane);

        contentPane.getChildren().add(logo);
        contentPane.getChildren().add(label);
        containerPane.getChildren().add(contentPane);

    }

    PauseTransition delay = new PauseTransition(Duration.seconds(1.5));

    /*delay.setOnFinished (event -> {
            MenuSceneBase ms = new MenuSceneBase();

        Scene scene = this.getScene();
        BorderPane p = (BorderPane) scene.getRoot();
        //p.getChildren().add(ms.containerPane);
        p.setCenter(ms.containerPane);
    }

    );
    delay.play ();*/

    private void loadNextScene() {
        /*MenuSceneBase ms = new MenuSceneBase();

        Scene scene = signInBtn.getScene();
        BorderPane p = (BorderPane) scene.getRoot();
        //p.getChildren().add(ms.containerPane);
        p.setCenter(ms.containerPane);

        ms.containerPane.translateYProperty().set(scene.getHeight());
        //containerPane.getChildren().add(contentPane);
        //BorderPane.setAlignment(root, javafx.geometry.Pos.CENTER);
        //setCenter(ms.containerPane);
//            containerPane.getChildren().add(ms.containerPane);

        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(ms.containerPane.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.setOnFinished(ev -> {
            p.getChildren().remove(containerPane);
        });
        timeLine.play();*/
    }
}
