package tictactoe;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PopUpLocalVsNwBase extends BorderPane {
    
    gameSceneBase gs =new gameSceneBase();

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane contentPane;
    protected final Button localOption;
    protected final InnerShadow innerShadow;
    protected final Button nwOption;
    protected final InnerShadow innerShadow0;

    public PopUpLocalVsNwBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        contentPane = new AnchorPane();
        localOption = new Button();
        innerShadow = new InnerShadow();
        nwOption = new Button();
        innerShadow0 = new InnerShadow();

        setId("parentPane");
        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(300.0);
        setPrefWidth(300.0);
        getStylesheets().add("/tictactoe/../css/styles.css");

        BorderPane.setAlignment(leftSideAnchorPane, javafx.geometry.Pos.CENTER);
        leftSideAnchorPane.setPrefHeight(300.0);
        leftSideAnchorPane.setPrefWidth(37.0);
        leftSideAnchorPane.setStyle("-fx-background-color: black;");
        setLeft(leftSideAnchorPane);

        BorderPane.setAlignment(rightSideAnchorPane, javafx.geometry.Pos.CENTER);
        rightSideAnchorPane.setPrefHeight(300.0);
        rightSideAnchorPane.setPrefWidth(75.0);
        rightSideAnchorPane.setStyle("-fx-background-color: black;");
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(contentPane, javafx.geometry.Pos.BOTTOM_CENTER);
        contentPane.setId("contentPane");
        contentPane.setMaxWidth(USE_PREF_SIZE);
        contentPane.setMinWidth(USE_PREF_SIZE);
        contentPane.setPrefHeight(300.0);
        contentPane.setPrefWidth(226.0);

        localOption.setAlignment(javafx.geometry.Pos.CENTER);
        localOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        localOption.setId("onePlayer");
        localOption.setLayoutX(62.0);
        localOption.setLayoutY(62.0);
        localOption.setMnemonicParsing(false);
        localOption.setOnAction(this::loadGameSceneWithLocal);
        localOption.setPrefHeight(41.0);
        localOption.setPrefWidth(143.0);
        localOption.getStyleClass().add("options");
        localOption.getStylesheets().add("/tictactoe/../css/styles.css");
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
        nwOption.setLayoutX(62.0);
        nwOption.setLayoutY(169.0);
        nwOption.setMnemonicParsing(false);
        nwOption.setOnAction(this::loadGameSceneWithNw);
        nwOption.setPrefHeight(41.0);
        nwOption.setPrefWidth(143.0);
        nwOption.getStyleClass().add("options");
        nwOption.getStylesheets().add("/tictactoe/../css/styles.css");
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
        setCenter(contentPane);

        contentPane.getChildren().add(localOption);
        contentPane.getChildren().add(nwOption);

    }

    protected void loadGameSceneWithLocal(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = localOption.getScene();

        root.translateYProperty().set(scene.getHeight());
        //containerPane.getChildren().add(contentPane);
        //BorderPane.setAlignment(root, javafx.geometry.Pos.CENTER);
        contentPane.getChildren().add(root);

        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
    
    
    }
    
    protected void loadGameSceneWithNw(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = nwOption.getScene();

        root.translateYProperty().set(scene.getHeight());
        //containerPane.getChildren().add(contentPane);
        //BorderPane.setAlignment(root, javafx.geometry.Pos.CENTER);
        contentPane.getChildren().add(root);

        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();

    }


}
