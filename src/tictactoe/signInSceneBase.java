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
