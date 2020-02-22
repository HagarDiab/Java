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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class signUpSceneBase extends BorderPane {
    menuSceneBase ms= new menuSceneBase();
    signInSceneBase signIn = new signInSceneBase();

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
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
    protected final ImageView homeIcon;

    public signUpSceneBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
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
        homeIcon = new ImageView();

        setId("parentPane");
        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(512.0);
        setPrefWidth(600.0);
        getStylesheets().add("/tictactoe/../css/styles.css");

        BorderPane.setAlignment(leftSideAnchorPane, javafx.geometry.Pos.CENTER);
        leftSideAnchorPane.setPrefHeight(512.0);
        leftSideAnchorPane.setPrefWidth(179.0);
        setLeft(leftSideAnchorPane);

        BorderPane.setAlignment(rightSideAnchorPane, javafx.geometry.Pos.CENTER);
        rightSideAnchorPane.setPrefHeight(587.0);
        rightSideAnchorPane.setPrefWidth(186.0);
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(contentPane, javafx.geometry.Pos.BOTTOM_CENTER);
        contentPane.setId("contentPane");
        contentPane.setMaxWidth(USE_PREF_SIZE);
        contentPane.setMinWidth(USE_PREF_SIZE);
        contentPane.setPrefHeight(600.0);
        contentPane.setPrefWidth(393.0);

        usrNameField.setLayoutX(88.0);
        usrNameField.setLayoutY(195.0);
        usrNameField.setPrefHeight(25.0);
        usrNameField.setPrefWidth(200.0);
        usrNameField.setPromptText("Name");
        usrNameField.getStyleClass().add("txtfield");
        usrNameField.getStylesheets().add("/tictactoe/../css/styles.css");

        usrNameField.setEffect(glow);
        usrNameField.setFont(new Font("System Bold", 13.0));
        usrNameField.setCursor(Cursor.TEXT);

        passwdField.setLayoutX(88.0);
        passwdField.setLayoutY(332.0);
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
        label.setLayoutX(53.0);
        label.setLayoutY(121.0);
        label.setPrefHeight(35.0);
        label.setPrefWidth(287.0);
        label.getStylesheets().add("/tictactoe/../css/styles.css");
        label.setText("CREATE NEW ACCOUNT !");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        label.setFont(new Font("System Bold", 21.0));

        signUpBtn.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        signUpBtn.setLayoutX(121.0);
        signUpBtn.setLayoutY(422.0);
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

        emailField.setLayoutX(88.0);
        emailField.setLayoutY(264.0);
        emailField.setPrefHeight(25.0);
        emailField.setPrefWidth(200.0);
        emailField.setPromptText("Email");
        emailField.getStyleClass().add("txtfield");
        emailField.getStylesheets().add("/tictactoe/../css/styles.css");
        emailField.setCursor(Cursor.TEXT);

        emailField.setEffect(glow1);
        emailField.setFont(new Font("System Bold", 13.0));

        haveAccountLabel.setLayoutX(118.0);
        haveAccountLabel.setLayoutY(502.0);
        haveAccountLabel.setOnMouseClicked(this::loadSingInScene);
        haveAccountLabel.setText("Already have an account ?");
        haveAccountLabel.setTextFill(javafx.scene.paint.Color.valueOf("#73c2fb"));
        haveAccountLabel.setUnderline(true);

        AnchorPane.setBottomAnchor(homeIcon, 473.33333333333337);
        AnchorPane.setLeftAnchor(homeIcon, 167.0);
        AnchorPane.setRightAnchor(homeIcon, 187.14538319905597);
        AnchorPane.setTopAnchor(homeIcon, 75.0);
        homeIcon.setAccessibleRole(javafx.scene.AccessibleRole.BUTTON);
        homeIcon.setAccessibleRoleDescription("toHomePage");
        homeIcon.setFitHeight(39.0);
        homeIcon.setFitWidth(40.0);
        homeIcon.setId("homeIcon");
        homeIcon.setLayoutX(167.0);
        homeIcon.setLayoutY(75.0);
        homeIcon.setPickOnBounds(true);
        homeIcon.setPreserveRatio(true);
        homeIcon.setImage(new Image(getClass().getResource("../img/icon.png").toExternalForm()));
        setCenter(contentPane);

        contentPane.getChildren().add(usrNameField);
        contentPane.getChildren().add(passwdField);
        contentPane.getChildren().add(label);
        contentPane.getChildren().add(signUpBtn);
        contentPane.getChildren().add(emailField);
        contentPane.getChildren().add(haveAccountLabel);
        contentPane.getChildren().add(homeIcon);

    }

    protected void loadHomeScene(javafx.event.ActionEvent actionEvent){
        if (usrNameField.getText().equals("hagar") && passwdField.getText().equals("123456") && emailField.getText().equals("user@example.com")) {

            Parent root = ms;
            Scene scene = signUpBtn.getScene();

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
        else{
            //worning mgs
        }
    }

    protected void loadSingInScene(javafx.scene.input.MouseEvent mouseEvent){
        Parent root = signIn;
        Scene scene = haveAccountLabel.getScene();

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
