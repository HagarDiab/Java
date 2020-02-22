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

public class signInSceneBase extends BorderPane {
    
    menuSceneBase ms= new menuSceneBase();
    SignUpSceneBase signUp = new SignUpSceneBase();

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane contentPane;
    protected final AnchorPane childPane;
    protected final ImageView homeIcon;
    protected final TextField usrNameField;
    protected final Glow glow;
    protected final TextField passwdField;
    protected final Glow glow0;
    protected final Label label;
    protected final Button signInBtn;
    protected final Label createAccountLabel;

    public signInSceneBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        contentPane = new AnchorPane();
        childPane = new AnchorPane();
        homeIcon = new ImageView();
        usrNameField = new TextField();
        glow = new Glow();
        passwdField = new TextField();
        glow0 = new Glow();
        label = new Label();
        signInBtn = new Button();
        createAccountLabel = new Label();

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
        rightSideAnchorPane.setPrefHeight(600.0);
        rightSideAnchorPane.setPrefWidth(182.0);
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(contentPane, javafx.geometry.Pos.BOTTOM_CENTER);
        contentPane.setId("contentPane");
        contentPane.setMaxWidth(USE_PREF_SIZE);
        contentPane.setMinWidth(USE_PREF_SIZE);
        contentPane.setPrefHeight(600.0);
        contentPane.setPrefWidth(393.0);

        AnchorPane.setBottomAnchor(childPane, 0.33333333333325754);
        AnchorPane.setLeftAnchor(childPane, 0.0);
        AnchorPane.setRightAnchor(childPane, 0.0);
        AnchorPane.setTopAnchor(childPane, 41.0);
        childPane.setLayoutY(41.0);
        childPane.setPrefHeight(647.0);
        childPane.setPrefWidth(393.0);

        AnchorPane.setBottomAnchor(homeIcon, 601.5251782735189);
        AnchorPane.setLeftAnchor(homeIcon, 179.0);
        AnchorPane.setRightAnchor(homeIcon, 174.33333333333331);
        AnchorPane.setTopAnchor(homeIcon, 6.0);
        homeIcon.setAccessibleRole(javafx.scene.AccessibleRole.BUTTON);
        homeIcon.setAccessibleRoleDescription("toHomePage");
        homeIcon.setFitHeight(46.0);
        homeIcon.setFitWidth(40.0);
        homeIcon.setId("homeIcon");
        homeIcon.setLayoutX(179.0);
        homeIcon.setLayoutY(6.0);
        homeIcon.setPickOnBounds(true);
        homeIcon.setPreserveRatio(true);
        homeIcon.setImage(new Image(getClass().getResource("../img/icon.png").toExternalForm()));

        usrNameField.setLayoutX(101.0);
        usrNameField.setLayoutY(190.0);
        usrNameField.setPrefHeight(25.0);
        usrNameField.setPrefWidth(200.0);
        usrNameField.setPromptText("Username");
        usrNameField.getStyleClass().add("txtfield");
        usrNameField.getStylesheets().add("/tictactoe/../css/styles.css");

        usrNameField.setEffect(glow);
        usrNameField.setFont(new Font("System Bold", 13.0));

        passwdField.setLayoutX(99.0);
        passwdField.setLayoutY(249.0);
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
        label.setLayoutX(65.0);
        label.setLayoutY(95.0);
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

        signInBtn.setLayoutX(132.0);
        signInBtn.setLayoutY(357.0);
        signInBtn.setMnemonicParsing(false);
        signInBtn.setOnAction(this::loadHomeScene);
        signInBtn.setPrefHeight(25.0);
        signInBtn.setPrefWidth(133.0);
        signInBtn.getStyleClass().add("options");
        signInBtn.getStylesheets().add("/tictactoe/../css/styles.css");
        signInBtn.setText("Sign in");
        signInBtn.setFont(new Font("System Bold", 12.0));

        createAccountLabel.setLayoutX(140.0);
        createAccountLabel.setLayoutY(469.0);
        createAccountLabel.setOnMouseClicked(this::loadSignUpScene);
        createAccountLabel.setText("Create a new account ");
        createAccountLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        createAccountLabel.setTextFill(javafx.scene.paint.Color.valueOf("#73c2fb"));
        createAccountLabel.setUnderline(true);
        setCenter(contentPane);

        childPane.getChildren().add(homeIcon);
        childPane.getChildren().add(usrNameField);
        childPane.getChildren().add(passwdField);
        childPane.getChildren().add(label);
        childPane.getChildren().add(signInBtn);
        childPane.getChildren().add(createAccountLabel);
        contentPane.getChildren().add(childPane);

    }

    protected void loadHomeScene(javafx.event.ActionEvent actionEvent){
        if (usrNameField.getText().equals("hagar") && passwdField.getText().equals("123456")) {

            Parent root = ms;
            Scene scene = signInBtn.getScene();

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

    protected void loadSignUpScene(javafx.scene.input.MouseEvent mouseEvent){
        Parent root = signUp;
        Scene scene = createAccountLabel.getScene();

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
