package tictactoe;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class splachScreen extends BorderPane {

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final Label gameTitle;
    protected final ImageView logo;

    public splachScreen() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        gameTitle = new Label();
        logo = new ImageView();

        setId("rootPane");
        setMaxHeight(USE_COMPUTED_SIZE);
        setMaxWidth(USE_COMPUTED_SIZE);
        setMinHeight(USE_COMPUTED_SIZE);
        setMinWidth(USE_COMPUTED_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(560.0);

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.CENTER);
        containerPane.setId("containerPane");
        containerPane.setPrefHeight(551.0);
        containerPane.setPrefWidth(630.0);
        containerPane.getStylesheets().add("/tictactoe/../css/styles.css");

        contentPane.setId("contentPane");
        contentPane.setLayoutX(100.0);
        contentPane.setPrefHeight(600.0);
        contentPane.setPrefWidth(360.0);

        gameTitle.setId("gameTitle");
        gameTitle.setLayoutX(123.0);
        gameTitle.setLayoutY(329.0);
        gameTitle.setText("TICTOCTOE-GAME");
        gameTitle.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        gameTitle.setFont(new Font("System Bold", 12.0));

        logo.setFitHeight(51.0);
        logo.setFitWidth(50.0);
        logo.setId("logo");
        logo.setLayoutX(145.0);
        logo.setLayoutY(203.0);
        logo.setPickOnBounds(true);
        logo.setPreserveRatio(true);
        logo.setImage(new Image(getClass().getResource("../img/icon.png").toExternalForm()));
        setCenter(containerPane);

        contentPane.getChildren().add(gameTitle);
        contentPane.getChildren().add(logo);
        containerPane.getChildren().add(contentPane);

    }
}
