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

public class PopUpLevelBase extends BorderPane {
    
    gameSceneBase gs =new gameSceneBase();

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane contentPane;
    protected final Button hardOption;
    protected final InnerShadow innerShadow;
    protected final Button mediumOption;
    protected final InnerShadow innerShadow0;
    protected final Button easyOption;
    protected final InnerShadow innerShadow1;

    public PopUpLevelBase() {
        

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        contentPane = new AnchorPane();
        hardOption = new Button();
        innerShadow = new InnerShadow();
        mediumOption = new Button();
        innerShadow0 = new InnerShadow();
        easyOption = new Button();
        innerShadow1 = new InnerShadow();

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

        hardOption.setAlignment(javafx.geometry.Pos.CENTER);
        hardOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        hardOption.setId("onePlayer");
        hardOption.setLayoutX(60.0);
        hardOption.setLayoutY(50.0);
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
        mediumOption.setLayoutX(62.0);
        mediumOption.setLayoutY(125.0);
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
        easyOption.setLayoutX(60.0);
        easyOption.setLayoutY(197.0);
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
        setCenter(contentPane);

        contentPane.getChildren().add(hardOption);
        contentPane.getChildren().add(mediumOption);
        contentPane.getChildren().add(easyOption);

    }

    protected void loadGameSceneEasyLevel(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = easyOption.getScene();

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
    
    protected void loadGameSceneHardLevel(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = hardOption.getScene();

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
    
    protected void loadGameSceneMediumLevel(javafx.event.ActionEvent actionEvent){
        Parent root = gs;
        Scene scene = mediumOption.getScene();

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
