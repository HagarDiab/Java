/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Hagar Diab
 */
public class tmp {
    /* package tictactoe;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class signInSceneBase extends BorderPane {
    
    menuSceneBase ms= new menuSceneBase();
    signUpSceneBase signUp = new signUpSceneBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final TextField usrNameField;
    protected final Glow glow;
    protected final TextField passwdField;
    protected final Glow glow0;
    protected final Label fixedMsg;
    protected final Button signInBtn;
    protected final Label createAccountLabel;

    public signInSceneBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        usrNameField = new TextField();
        glow = new Glow();
        passwdField = new TextField();
        glow0 = new Glow();
        fixedMsg = new Label();
        signInBtn = new Button();
        createAccountLabel = new Label();

        setId("rootPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(560.0);

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

        usrNameField.setLayoutX(80.0);
        usrNameField.setLayoutY(244.0);
        usrNameField.setPrefHeight(25.0);
        usrNameField.setPrefWidth(200.0);
        usrNameField.setPromptText("Username");
        usrNameField.getStyleClass().add("txtfield");
        usrNameField.getStylesheets().add("/tictactoe/../css/styles.css");

        usrNameField.setEffect(glow);
        usrNameField.setFont(new Font("System Bold", 13.0));

        passwdField.setLayoutX(80.0);
        passwdField.setLayoutY(300.0);
        passwdField.setPrefHeight(25.0);
        passwdField.setPrefWidth(200.0);
        passwdField.setPromptText("Password");
        passwdField.getStyleClass().add("txtfield");
        passwdField.getStylesheets().add("/tictactoe/../css/styles.css");
        passwdField.setCursor(Cursor.HAND);

        passwdField.setEffect(glow0);
        passwdField.setFont(new Font("System Bold", 13.0));

        fixedMsg.setAlignment(javafx.geometry.Pos.CENTER);
        fixedMsg.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        fixedMsg.setLayoutX(39.0);
        fixedMsg.setLayoutY(106.0);
        fixedMsg.setPrefHeight(35.0);
        fixedMsg.setPrefWidth(281.0);
        fixedMsg.getStylesheets().add("/tictactoe/../css/styles.css");
        fixedMsg.setText("Let's Get Started !");
        fixedMsg.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        fixedMsg.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        fixedMsg.setFont(new Font("System Bold", 21.0));

        signInBtn.setLayoutX(113.0);
        signInBtn.setLayoutY(390.0);
        signInBtn.setMnemonicParsing(false);
        signInBtn.setOnAction(this::loadHomeScene);
        signInBtn.setPrefHeight(25.0);
        signInBtn.setPrefWidth(133.0);
        signInBtn.getStyleClass().add("options");
        signInBtn.getStylesheets().add("/tictactoe/../css/styles.css");
        signInBtn.setText("Sign in");
        signInBtn.setFont(new Font("System Bold", 12.0));

        createAccountLabel.setLayoutX(121.0);
        createAccountLabel.setLayoutY(503.0);
        createAccountLabel.setOnMouseClicked(this::loadSignUpScene);
        createAccountLabel.setText("Create a new account ");
        createAccountLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        createAccountLabel.setTextFill(javafx.scene.paint.Color.valueOf("#73c2fb"));
        createAccountLabel.setUnderline(true);
        setCenter(containerPane);

        contentPane.getChildren().add(usrNameField);
        contentPane.getChildren().add(passwdField);
        contentPane.getChildren().add(fixedMsg);
        contentPane.getChildren().add(signInBtn);
        contentPane.getChildren().add(createAccountLabel);
        containerPane.getChildren().add(contentPane);

    }

     protected void loadHomeScene(javafx.event.ActionEvent actionEvent) {
        if (usrNameField.getText().equals("hagar") && passwdField.getText().equals("123456")) {

            Parent root = ms;
            Scene scene = signInBtn.getScene();

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
        else{
            //worning mgs
        }

    }

    protected void loadSignUpScene(javafx.scene.input.MouseEvent mouseEvent) {
        Parent root = signUp;
        Scene scene = createAccountLabel.getScene();

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

    */
    
    
    
    
    /*
    
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
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class signUpSceneBase extends BorderPane {
    
    menuSceneBase ms= new menuSceneBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final TextField usrNameField;
    protected final Glow glow;
    protected final TextField passwdField;
    protected final Glow glow0;
    protected final Label label;
    protected final Button signUpBtn;
    protected final TextField emailField;
    protected final Glow glow1;
    protected final Label haveAccountLabel;

    public signUpSceneBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        usrNameField = new TextField();
        glow = new Glow();
        passwdField = new TextField();
        glow0 = new Glow();
        label = new Label();
        signUpBtn = new Button();
        emailField = new TextField();
        glow1 = new Glow();
        haveAccountLabel = new Label();

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

        usrNameField.setLayoutX(80.0);
        usrNameField.setLayoutY(244.0);
        usrNameField.setPrefHeight(25.0);
        usrNameField.setPrefWidth(200.0);
        usrNameField.setPromptText("Name");
        usrNameField.getStyleClass().add("txtfield");
        usrNameField.getStylesheets().add("/tictactoe/../css/styles.css");

        usrNameField.setEffect(glow);
        usrNameField.setFont(new Font("System Bold", 13.0));
        usrNameField.setCursor(Cursor.TEXT);

        passwdField.setLayoutX(83.0);
        passwdField.setLayoutY(358.0);
        passwdField.setPrefHeight(25.0);
        passwdField.setPrefWidth(200.0);
        passwdField.setPromptText("Password");
        passwdField.getStyleClass().add("txtfield");
        passwdField.getStylesheets().add("/tictactoe/../css/styles.css");
        passwdField.setCursor(Cursor.TEXT);

        passwdField.setEffect(glow0);
        passwdField.setFont(new Font("System Bold", 13.0));

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(39.0);
        label.setLayoutY(106.0);
        label.setPrefHeight(35.0);
        label.setPrefWidth(287.0);
        label.getStylesheets().add("/tictactoe/../css/styles.css");
        label.setText("CREATE NEW ACCOUNT !");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        label.setFont(new Font("System Bold", 21.0));

        signUpBtn.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        signUpBtn.setLayoutX(116.0);
        signUpBtn.setLayoutY(438.0);
        signUpBtn.setMnemonicParsing(false);
        signUpBtn.setOnAction(this::loadHomeScene);
        signUpBtn.setPrefHeight(25.0);
        signUpBtn.setPrefWidth(133.0);
        signUpBtn.setStyle("-fx-background-color: transperent; -fx-border-color: #8bc0ec;");
        signUpBtn.getStyleClass().add("options");
        signUpBtn.getStylesheets().add("/tictactoe/../css/styles.css");
        signUpBtn.setText("Sign Up");
        signUpBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        signUpBtn.setTextFill(javafx.scene.paint.Color.valueOf("#8bc0ec"));
        signUpBtn.setFont(new Font("System Bold", 12.0));
        signUpBtn.setCursor(Cursor.HAND);

        emailField.setLayoutX(80.0);
        emailField.setLayoutY(300.0);
        emailField.setPrefHeight(25.0);
        emailField.setPrefWidth(200.0);
        emailField.setPromptText("Email");
        emailField.getStyleClass().add("txtfield");
        emailField.getStylesheets().add("/tictactoe/../css/styles.css");
        emailField.setCursor(Cursor.TEXT);

        emailField.setEffect(glow1);
        emailField.setFont(new Font("System Bold", 13.0));

        haveAccountLabel.setLayoutX(114.0);
        haveAccountLabel.setLayoutY(520.0);
        haveAccountLabel.setOnMouseClicked(this::loadSingInScene);
        haveAccountLabel.setText("Already have an account ?");
        haveAccountLabel.setTextFill(javafx.scene.paint.Color.valueOf("#73c2fb"));
        haveAccountLabel.setUnderline(true);
        setCenter(containerPane);

        contentPane.getChildren().add(usrNameField);
        contentPane.getChildren().add(passwdField);
        contentPane.getChildren().add(label);
        contentPane.getChildren().add(signUpBtn);
        contentPane.getChildren().add(emailField);
        contentPane.getChildren().add(haveAccountLabel);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadHomeScene(javafx.event.ActionEvent actionEvent){
        if (usrNameField.getText().equals("hagar") && passwdField.getText().equals("123456") && emailField.getText().equals("user@example.com")) {

            Parent root = ms;
            Scene scene = signUpBtn.getScene();

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
        else{
            //worning mgs
        }
    
    }

    protected void loadSingInScene(javafx.scene.input.MouseEvent mouseEvent){
        
        
    
    }

}
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
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class signUpSceneBase extends BorderPane {
    
    menuSceneBase ms= new menuSceneBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final TextField usrNameField;
    protected final Glow glow;
    protected final TextField passwdField;
    protected final Glow glow0;
    protected final Label label;
    protected final Button signUpBtn;
    protected final TextField emailField;
    protected final Glow glow1;
    protected final Label haveAccountLabel;

    public signUpSceneBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        usrNameField = new TextField();
        glow = new Glow();
        passwdField = new TextField();
        glow0 = new Glow();
        label = new Label();
        signUpBtn = new Button();
        emailField = new TextField();
        glow1 = new Glow();
        haveAccountLabel = new Label();

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

        usrNameField.setLayoutX(80.0);
        usrNameField.setLayoutY(244.0);
        usrNameField.setPrefHeight(25.0);
        usrNameField.setPrefWidth(200.0);
        usrNameField.setPromptText("Name");
        usrNameField.getStyleClass().add("txtfield");
        usrNameField.getStylesheets().add("/tictactoe/../css/styles.css");

        usrNameField.setEffect(glow);
        usrNameField.setFont(new Font("System Bold", 13.0));
        usrNameField.setCursor(Cursor.TEXT);

        passwdField.setLayoutX(83.0);
        passwdField.setLayoutY(358.0);
        passwdField.setPrefHeight(25.0);
        passwdField.setPrefWidth(200.0);
        passwdField.setPromptText("Password");
        passwdField.getStyleClass().add("txtfield");
        passwdField.getStylesheets().add("/tictactoe/../css/styles.css");
        passwdField.setCursor(Cursor.TEXT);

        passwdField.setEffect(glow0);
        passwdField.setFont(new Font("System Bold", 13.0));

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutX(39.0);
        label.setLayoutY(106.0);
        label.setPrefHeight(35.0);
        label.setPrefWidth(287.0);
        label.getStylesheets().add("/tictactoe/../css/styles.css");
        label.setText("CREATE NEW ACCOUNT !");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        label.setFont(new Font("System Bold", 21.0));

        signUpBtn.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        signUpBtn.setLayoutX(116.0);
        signUpBtn.setLayoutY(438.0);
        signUpBtn.setMnemonicParsing(false);
        signUpBtn.setOnAction(this::loadHomeScene);
        signUpBtn.setPrefHeight(25.0);
        signUpBtn.setPrefWidth(133.0);
        signUpBtn.setStyle("-fx-background-color: transperent; -fx-border-color: #8bc0ec;");
        signUpBtn.getStyleClass().add("options");
        signUpBtn.getStylesheets().add("/tictactoe/../css/styles.css");
        signUpBtn.setText("Sign Up");
        signUpBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        signUpBtn.setTextFill(javafx.scene.paint.Color.valueOf("#8bc0ec"));
        signUpBtn.setFont(new Font("System Bold", 12.0));
        signUpBtn.setCursor(Cursor.HAND);

        emailField.setLayoutX(80.0);
        emailField.setLayoutY(300.0);
        emailField.setPrefHeight(25.0);
        emailField.setPrefWidth(200.0);
        emailField.setPromptText("Email");
        emailField.getStyleClass().add("txtfield");
        emailField.getStylesheets().add("/tictactoe/../css/styles.css");
        emailField.setCursor(Cursor.TEXT);

        emailField.setEffect(glow1);
        emailField.setFont(new Font("System Bold", 13.0));

        haveAccountLabel.setLayoutX(114.0);
        haveAccountLabel.setLayoutY(520.0);
        haveAccountLabel.setOnMouseClicked(this::loadSingInScene);
        haveAccountLabel.setText("Already have an account ?");
        haveAccountLabel.setTextFill(javafx.scene.paint.Color.valueOf("#73c2fb"));
        haveAccountLabel.setUnderline(true);
        setCenter(containerPane);

        contentPane.getChildren().add(usrNameField);
        contentPane.getChildren().add(passwdField);
        contentPane.getChildren().add(label);
        contentPane.getChildren().add(signUpBtn);
        contentPane.getChildren().add(emailField);
        contentPane.getChildren().add(haveAccountLabel);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadHomeScene(javafx.event.ActionEvent actionEvent){
        if (usrNameField.getText().equals("hagar") && passwdField.getText().equals("123456") && emailField.getText().equals("user@example.com")) {

            Parent root = ms;
            Scene scene = signUpBtn.getScene();

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
        else{
            //worning mgs
        }
    
    }

    protected void loadSingInScene(javafx.scene.input.MouseEvent mouseEvent){
        
        
    
    }

}

    */
    
    
    /*
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
    
    gameSceneBase gs =new gameSceneBase();

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

    
    */
    
    
    /*
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
    
    gameSceneBase gs =new gameSceneBase();

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

    */
    
    
    /*
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

public class menuSceneBase extends BorderPane {
    
    PopUpLocalVsNwBase nwPopUp =new PopUpLocalVsNwBase();
    PopUpLevelBase levelPopUp =new PopUpLevelBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final Label title;
    protected final ImageView imageView;
    protected final Label playerName;
    protected final Button onePlayer;
    protected final InnerShadow innerShadow;
    protected final Button multiPlayer;
    protected final InnerShadow innerShadow0;
    protected final Button exit;
    protected final InnerShadow innerShadow1;
    protected final Label about;
    protected final Label history;

    public menuSceneBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        title = new Label();
        imageView = new ImageView();
        playerName = new Label();
        onePlayer = new Button();
        innerShadow = new InnerShadow();
        multiPlayer = new Button();
        innerShadow0 = new InnerShadow();
        exit = new Button();
        innerShadow1 = new InnerShadow();
        about = new Label();
        history = new Label();

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

        onePlayer.setAlignment(javafx.geometry.Pos.CENTER);
        onePlayer.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        onePlayer.setId("onePlayer");
        onePlayer.setLayoutX(108.0);
        onePlayer.setLayoutY(187.0);
        onePlayer.setMnemonicParsing(false);
        onePlayer.setOnAction(this::loadPopUpLevelsWithOnePlayer);
        onePlayer.setPrefHeight(41.0);
        onePlayer.setPrefWidth(143.0);
        onePlayer.getStyleClass().add("options");
        onePlayer.getStylesheets().add("/tictactoe/../css/styles.css");
        onePlayer.setText("Playing: One Player");
        onePlayer.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        onePlayer.setFont(new Font("System Bold", 12.0));
        onePlayer.setCursor(Cursor.HAND);

        innerShadow.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow.setHeight(24.0);
        innerShadow.setOffsetY(2.0);
        innerShadow.setRadius(11.75);
        innerShadow.setWidth(25.0);
        onePlayer.setEffect(innerShadow);

        multiPlayer.setAlignment(javafx.geometry.Pos.CENTER);
        multiPlayer.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        multiPlayer.setId("multiPlayer");
        multiPlayer.setLayoutX(108.0);
        multiPlayer.setLayoutY(270.0);
        multiPlayer.setMnemonicParsing(false);
        multiPlayer.setOnAction(this::loadPopUpLocalVsNw);
        multiPlayer.setPrefHeight(41.0);
        multiPlayer.setPrefWidth(143.0);
        multiPlayer.getStyleClass().add("options");
        multiPlayer.getStylesheets().add("/tictactoe/../css/styles.css");
        multiPlayer.setText("Playing: Multi-Player");
        multiPlayer.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        multiPlayer.setFont(new Font("System Bold", 12.0));
        multiPlayer.setCursor(Cursor.HAND);

        innerShadow0.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow0.setHeight(23.0);
        innerShadow0.setOffsetY(2.0);
        innerShadow0.setRadius(11.5);
        innerShadow0.setWidth(25.0);
        multiPlayer.setEffect(innerShadow0);

        exit.setAlignment(javafx.geometry.Pos.CENTER);
        exit.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        exit.setId("exit");
        exit.setLayoutX(108.0);
        exit.setLayoutY(357.0);
        exit.setMnemonicParsing(false);
        exit.setOnAction(this::exitProgram);
        exit.setPrefHeight(41.0);
        exit.setPrefWidth(143.0);
        exit.getStyleClass().add("options");
        exit.getStylesheets().add("/tictactoe/../css/styles.css");
        exit.setText("Exit");
        exit.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        exit.setFont(new Font("System Bold", 12.0));

        innerShadow1.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow1.setOffsetY(2.0);
        innerShadow1.setRadius(11.0);
        innerShadow1.setWidth(25.0);
        exit.setEffect(innerShadow1);

        about.setAlignment(javafx.geometry.Pos.CENTER);
        about.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        about.setId("about");
        about.setLayoutX(19.0);
        about.setLayoutY(471.0);
        about.setOnMouseClicked(this::loadAboutScene);
        about.setPrefHeight(17.0);
        about.setPrefWidth(59.0);
        about.setText("About");
        about.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        about.setUnderline(true);
        about.setFont(new Font("System Bold", 15.0));

        history.setAlignment(javafx.geometry.Pos.CENTER);
        history.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        history.setId("history");
        history.setLayoutX(22.0);
        history.setLayoutY(513.0);
        history.setOnMouseClicked(this::historyScene);
        history.setPrefHeight(17.0);
        history.setPrefWidth(59.0);
        history.setText("History");
        history.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        history.setUnderline(true);
        history.setFont(new Font("System Bold", 15.0));
        setCenter(containerPane);

        contentPane.getChildren().add(title);
        contentPane.getChildren().add(imageView);
        contentPane.getChildren().add(playerName);
        contentPane.getChildren().add(onePlayer);
        contentPane.getChildren().add(multiPlayer);
        contentPane.getChildren().add(exit);
        contentPane.getChildren().add(about);
        contentPane.getChildren().add(history);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadPopUpLevelsWithOnePlayer(javafx.event.ActionEvent actionEvent){
        Parent root = levelPopUp;
        Scene scene = onePlayer.getScene();

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

    protected void loadPopUpLocalVsNw(javafx.event.ActionEvent actionEvent){
        Parent root = nwPopUp;
        Scene scene = multiPlayer.getScene();

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

    protected void exitProgram(javafx.event.ActionEvent actionEvent){}

    protected void loadAboutScene(javafx.scene.input.MouseEvent mouseEvent){}

    protected void historyScene(javafx.scene.input.MouseEvent mouseEvent){}

}

    */
}
