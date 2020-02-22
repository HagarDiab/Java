package tictactoe;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PopUpLocalVsNwBase extends BorderPane {
    
    GameSceneBase gs =new GameSceneBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final Label title;
    protected final ImageView imageView;
    protected final Label playerName;
    protected final Button localOption;
    protected final InnerShadow innerShadow;
    protected final Button nwOption;
    protected final InnerShadow innerShadow0;

    public PopUpLocalVsNwBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        title = new Label();
        imageView = new ImageView();
        playerName = new Label();
        localOption = new Button();
        innerShadow = new InnerShadow();
        nwOption = new Button();
        innerShadow0 = new InnerShadow();

        setId("rootPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(560.0);

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.CENTER);
        containerPane.setId("containerPane");
        containerPane.setPrefHeight(551.0);
        containerPane.setPrefWidth(630.0);
        containerPane.getStylesheets().add("/tictactoe/../css/styles.css");

        AnchorPane.setBottomAnchor(contentPane, 0.0);
        AnchorPane.setLeftAnchor(contentPane, 95.0);
        AnchorPane.setRightAnchor(contentPane, 105.66666666666669);
        AnchorPane.setTopAnchor(contentPane, 0.0);
        contentPane.setId("contentPane");
        contentPane.setLayoutX(95.0);
        contentPane.setPrefHeight(600.0);
        contentPane.setPrefWidth(359.0);

        title.setId("title");
        title.setLayoutX(56.0);
        title.setLayoutY(6.0);
        title.setText("TICTOCTOE GAME");
        title.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));

        imageView.setFitHeight(51.0);
        imageView.setFitWidth(50.0);
        imageView.setLayoutX(2.0);
        imageView.setLayoutY(2.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../img/icon.png").toExternalForm()));

        playerName.setId("playerName");
        playerName.setLayoutX(65.0);
        playerName.setLayoutY(19.0);
        playerName.setText("playerName");
        playerName.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        playerName.setFont(new Font("System Bold", 13.0));

        localOption.setAlignment(javafx.geometry.Pos.CENTER);
        localOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        localOption.setId("onePlayer");
        localOption.setLayoutX(108.0);
        localOption.setLayoutY(187.0);
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
        nwOption.setLayoutX(108.0);
        nwOption.setLayoutY(270.0);
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
        setCenter(containerPane);

        contentPane.getChildren().add(title);
        contentPane.getChildren().add(imageView);
        contentPane.getChildren().add(playerName);
        contentPane.getChildren().add(localOption);
        contentPane.getChildren().add(nwOption);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadGameSceneWithLocal(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = localOption.getScene();

        root.translateYProperty().set(scene.getHeight());
        //containerPane.getChildren().add(contentPane);
        //BorderPane.setAlignment(root, javafx.geometry.Pos.CENTER);
        containerPane.getChildren().add(root);

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
        containerPane.getChildren().add(root);

        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
    
    
    }


}
