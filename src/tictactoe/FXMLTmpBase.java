package tictactoe;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class FXMLTmpBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane contentPane;
    protected final AnchorPane anchorPane1;
    protected final TextField usrNameField;
    protected final Glow glow;
    protected final TextField passwdField;
    protected final Glow glow0;
    protected final Label label;
    protected final Button signInBtn;
    protected final Label createAccountLabel;

    public FXMLTmpBase() {

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        contentPane = new AnchorPane();
        anchorPane1 = new AnchorPane();
        usrNameField = new TextField();
        glow = new Glow();
        passwdField = new TextField();
        glow0 = new Glow();
        label = new Label();
        signInBtn = new Button();
        createAccountLabel = new Label();

        setId("rootPane");
        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(512.0);
        setPrefWidth(600.0);
        getStylesheets().add("/tictactoe/../css/styles.css");

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(512.0);
        anchorPane.setPrefWidth(179.0);
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);
        setRight(anchorPane0);

        BorderPane.setAlignment(contentPane, javafx.geometry.Pos.BOTTOM_CENTER);
        contentPane.setId("contentPane");
        contentPane.setMaxWidth(USE_PREF_SIZE);
        contentPane.setMinWidth(USE_PREF_SIZE);
        contentPane.setPrefHeight(512.0);
        contentPane.setPrefWidth(359.0);

        AnchorPane.setBottomAnchor(anchorPane1, 54.0);
        AnchorPane.setLeftAnchor(anchorPane1, 39.0);
        AnchorPane.setRightAnchor(anchorPane1, 39.0);
        AnchorPane.setTopAnchor(anchorPane1, 74.0);
        anchorPane1.setLayoutX(39.0);
        anchorPane1.setLayoutY(74.0);
        anchorPane1.setPrefHeight(407.0);
        anchorPane1.setPrefWidth(281.0);

        usrNameField.setLayoutX(41.0);
        usrNameField.setLayoutY(138.0);
        usrNameField.setPrefHeight(25.0);
        usrNameField.setPrefWidth(200.0);
        usrNameField.setPromptText("Username");
        usrNameField.getStyleClass().add("txtfield");
        usrNameField.getStylesheets().add("/tictactoe/../css/styles.css");

        usrNameField.setEffect(glow);
        usrNameField.setFont(new Font("System Bold", 13.0));

        passwdField.setLayoutX(41.0);
        passwdField.setLayoutY(194.0);
        passwdField.setPrefHeight(25.0);
        passwdField.setPrefWidth(200.0);
        passwdField.setPromptText("Password");
        passwdField.getStyleClass().add("txtfield");
        passwdField.getStylesheets().add("/tictactoe/../css/styles.css");
        passwdField.setCursor(Cursor.HAND);

        passwdField.setEffect(glow0);
        passwdField.setFont(new Font("System Bold", 13.0));

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setMaxHeight(USE_PREF_SIZE);
        label.setMaxWidth(USE_PREF_SIZE);
        label.setMinHeight(USE_PREF_SIZE);
        label.setMinWidth(USE_PREF_SIZE);
        label.setPrefHeight(35.0);
        label.setPrefWidth(281.0);
        label.getStylesheets().add("/tictactoe/../css/styles.css");
        label.setText("Let's Get Started !");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        label.setFont(new Font("System Bold", 21.0));

        signInBtn.setLayoutX(74.0);
        signInBtn.setLayoutY(284.0);
        signInBtn.setMnemonicParsing(false);
        signInBtn.setOnAction(this::loadHomeScene);
        signInBtn.setPrefHeight(25.0);
        signInBtn.setPrefWidth(133.0);
        signInBtn.getStyleClass().add("options");
        signInBtn.getStylesheets().add("/tictactoe/../css/styles.css");
        signInBtn.setText("Sign in");
        signInBtn.setFont(new Font("System Bold", 12.0));

        createAccountLabel.setLayoutX(82.0);
        createAccountLabel.setLayoutY(327.0);
        createAccountLabel.setOnMouseClicked(this::loadSignUpScene);
        createAccountLabel.setText("Create a new account ");
        createAccountLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        createAccountLabel.setTextFill(javafx.scene.paint.Color.valueOf("#73c2fb"));
        createAccountLabel.setUnderline(true);
        setCenter(contentPane);

        anchorPane1.getChildren().add(usrNameField);
        anchorPane1.getChildren().add(passwdField);
        anchorPane1.getChildren().add(label);
        anchorPane1.getChildren().add(signInBtn);
        anchorPane1.getChildren().add(createAccountLabel);
        contentPane.getChildren().add(anchorPane1);

    }

    protected void loadHomeScene(javafx.event.ActionEvent actionEvent){}

    protected void loadSignUpScene(javafx.scene.input.MouseEvent mouseEvent){}

}
