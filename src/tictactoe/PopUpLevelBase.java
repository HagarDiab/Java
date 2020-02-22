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

public class PopUpLevelBase extends BorderPane {
    
    GameSceneBase gs =new GameSceneBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final Label title;
    protected final ImageView imageView;
    protected final Label playerName;
    protected final Button hardOption;
    protected final InnerShadow innerShadow;
    protected final Button mediumOption;
    protected final InnerShadow innerShadow0;
    protected final Button easyOption;
    protected final InnerShadow innerShadow1;

    public PopUpLevelBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        title = new Label();
        imageView = new ImageView();
        playerName = new Label();
        hardOption = new Button();
        innerShadow = new InnerShadow();
        mediumOption = new Button();
        innerShadow0 = new InnerShadow();
        easyOption = new Button();
        innerShadow1 = new InnerShadow();

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

        hardOption.setAlignment(javafx.geometry.Pos.CENTER);
        hardOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        hardOption.setId("onePlayer");
        hardOption.setLayoutX(108.0);
        hardOption.setLayoutY(187.0);
        hardOption.setMnemonicParsing(false);
        hardOption.setOnAction(this::loadGameSceneHardLevel);
        hardOption.setPrefHeight(41.0);
        hardOption.setPrefWidth(143.0);
        hardOption.getStyleClass().add("options");
        hardOption.getStylesheets().add("/tictactoe/../css/styles.css");
        hardOption.setText("Hard");
        hardOption.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        hardOption.setFont(new Font("System Bold", 12.0));
        hardOption.setCursor(Cursor.HAND);

        innerShadow.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow.setHeight(24.0);
        innerShadow.setOffsetY(2.0);
        innerShadow.setRadius(11.75);
        innerShadow.setWidth(25.0);
        hardOption.setEffect(innerShadow);

        mediumOption.setAlignment(javafx.geometry.Pos.CENTER);
        mediumOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        mediumOption.setId("multiPlayer");
        mediumOption.setLayoutX(108.0);
        mediumOption.setLayoutY(270.0);
        mediumOption.setMnemonicParsing(false);
        mediumOption.setOnAction(this::loadGameSceneMediumLevel);
        mediumOption.setPrefHeight(41.0);
        mediumOption.setPrefWidth(143.0);
        mediumOption.getStyleClass().add("options");
        mediumOption.getStylesheets().add("/tictactoe/../css/styles.css");
        mediumOption.setText("Medium");
        mediumOption.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        mediumOption.setFont(new Font("System Bold", 12.0));
        mediumOption.setCursor(Cursor.HAND);

        innerShadow0.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow0.setHeight(23.0);
        innerShadow0.setOffsetY(2.0);
        innerShadow0.setRadius(11.5);
        innerShadow0.setWidth(25.0);
        mediumOption.setEffect(innerShadow0);

        easyOption.setAlignment(javafx.geometry.Pos.CENTER);
        easyOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        easyOption.setId("exit");
        easyOption.setLayoutX(108.0);
        easyOption.setLayoutY(357.0);
        easyOption.setMnemonicParsing(false);
        easyOption.setOnAction(this::loadGameSceneEasyLevel);
        easyOption.setPrefHeight(41.0);
        easyOption.setPrefWidth(143.0);
        easyOption.getStyleClass().add("options");
        easyOption.getStylesheets().add("/tictactoe/../css/styles.css");
        easyOption.setText("Easy");
        easyOption.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        easyOption.setFont(new Font("System Bold", 12.0));

        innerShadow1.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow1.setOffsetY(2.0);
        innerShadow1.setRadius(11.0);
        innerShadow1.setWidth(25.0);
        easyOption.setEffect(innerShadow1);
        setCenter(containerPane);

        contentPane.getChildren().add(title);
        contentPane.getChildren().add(imageView);
        contentPane.getChildren().add(playerName);
        contentPane.getChildren().add(hardOption);
        contentPane.getChildren().add(mediumOption);
        contentPane.getChildren().add(easyOption);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadGameSceneEasyLevel(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = easyOption.getScene();

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
    
    protected void loadGameSceneHardLevel(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = hardOption.getScene();

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
    
    protected void loadGameSceneMediumLevel(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = mediumOption.getScene();

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
