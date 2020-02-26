package tictactoe;

import javafx.animation.FadeTransition;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PopUpLocalVsNwBase extends BorderPane {

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final Button localOption;
    protected final InnerShadow innerShadow;
    protected final Button nwOption;
    protected final InnerShadow innerShadow0;

    public PopUpLocalVsNwBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        localOption = new Button();
        innerShadow = new InnerShadow();
        nwOption = new Button();
        innerShadow0 = new InnerShadow();

        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(578.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(leftSideAnchorPane, javafx.geometry.Pos.CENTER);
        leftSideAnchorPane.setPrefHeight(561.0);
        leftSideAnchorPane.setPrefWidth(200.0);
        setLeft(leftSideAnchorPane);

        BorderPane.setAlignment(rightSideAnchorPane, javafx.geometry.Pos.CENTER);
        rightSideAnchorPane.setPrefHeight(561.0);
        rightSideAnchorPane.setPrefWidth(207.0);
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(144.0);
        anchorPane.setPrefWidth(600.0);
        setBottom(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(79.0);
        anchorPane0.setPrefWidth(600.0);
        setTop(anchorPane0);

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.BOTTOM_CENTER);
        containerPane.setId("contentPane");
        containerPane.setMaxHeight(USE_PREF_SIZE);
        containerPane.setMaxWidth(USE_PREF_SIZE);
        containerPane.setMinHeight(USE_PREF_SIZE);
        containerPane.setMinWidth(USE_PREF_SIZE);
        containerPane.setPrefHeight(264.0);
        containerPane.setPrefWidth(382.0);

        contentPane.setPrefHeight(266.0);
        contentPane.setPrefWidth(381.0);
        contentPane.getStylesheets().add("/tictactoe/../css/styles.css");

        localOption.setAlignment(javafx.geometry.Pos.CENTER);
        localOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        localOption.setId("onePlayer");
        localOption.setLayoutX(119.0);
        localOption.setLayoutY(65.0);
        localOption.setMnemonicParsing(false);
        localOption.setOnAction(this::loadGameSceneWithLocal);
        localOption.setPrefHeight(41.0);
        localOption.setPrefWidth(143.0);
        localOption.getStyleClass().add("options");
        localOption.getStylesheets().add("/tictactoe/../../../versions/version%208/TicTacToe/src/css/styles.css");
        localOption.setText("Local");
        localOption.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        localOption.setFont(new Font("System Bold", 12.0));
        localOption.setCursor(Cursor.HAND);

        innerShadow.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow.setHeight(24.0);
        innerShadow.setOffsetY(2.0);
        innerShadow.setRadius(11.75);
        innerShadow.setWidth(25.0);
        localOption.setEffect(innerShadow);

        nwOption.setAlignment(javafx.geometry.Pos.CENTER);
        nwOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        nwOption.setId("multiPlayer");
        nwOption.setLayoutX(119.0);
        nwOption.setLayoutY(149.0);
        nwOption.setMnemonicParsing(false);
        nwOption.setOnAction(this::loadGameSceneWithNw);
        nwOption.setPrefHeight(41.0);
        nwOption.setPrefWidth(143.0);
        nwOption.getStyleClass().add("options");
        nwOption.getStylesheets().add("/tictactoe/../../../versions/version%208/TicTacToe/src/css/styles.css");
        nwOption.setText("Network");
        nwOption.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        nwOption.setFont(new Font("System Bold", 12.0));
        nwOption.setCursor(Cursor.HAND);

        innerShadow0.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow0.setHeight(23.0);
        innerShadow0.setOffsetY(2.0);
        innerShadow0.setRadius(11.5);
        innerShadow0.setWidth(25.0);
        nwOption.setEffect(innerShadow0);
        setCenter(containerPane);

        contentPane.getChildren().add(localOption);
        contentPane.getChildren().add(nwOption);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadGameSceneWithLocal(javafx.event.ActionEvent actionEvent) {
        GameSceneBase gs = new GameSceneBase();
        Scene scene = localOption.getScene();
        BorderPane p = (BorderPane) scene.getRoot();
        p.setCenter(gs.containerPane);

        makeFadeOut();

    }

    protected void loadGameSceneWithNw(javafx.event.ActionEvent actionEvent) {
        GameSceneBase gs = new GameSceneBase();
        Scene scene = nwOption.getScene();
        BorderPane p = (BorderPane) scene.getRoot();
        p.setCenter(gs.containerPane);

        makeFadeOut();

    }

    private void makeFadeOut() {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.seconds(1));
        fadeTransition.setNode(containerPane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        //fadeTransition.setOnFinished((ActionEvent event) -> {
        //    loadHomeScene(event);
        //});
        fadeTransition.play(); //to Initiate the transition
    }

}
