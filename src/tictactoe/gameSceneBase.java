package tictactoe;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class gameSceneBase extends BorderPane {

    menuSceneBase ms = new menuSceneBase();

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane contentPane;
    protected final Label gameTitle;
    protected final ImageView homeIcon;
    protected final AnchorPane actionPane;
    protected final Line lineV2;
    protected final Line lineV1;
    protected final Line lineH2;
    protected final Line lineH1;
    protected final Button btn3;
    protected final Button btn6;
    protected final Button btn7;
    protected final Button btn9;
    protected final Button btn1;
    protected final Button btn2;
    protected final Button btn4;
    protected final Button btn5;
    protected final Button btn8;
    protected final Line sperateLine;
    protected final AnchorPane infoPane;
    protected final Label player_2;
    protected final Label pLayer_1;
    protected final Label tieLabel;
    protected final Label scoreLabel_1;
    protected final Label scoreLabel_2;
    protected final Label tieScoreLabel;
    protected final Label statusLable;
    protected final ImageView scoreIcon;
    protected final ImageView soundIcon;

    public gameSceneBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        contentPane = new AnchorPane();
        gameTitle = new Label();
        homeIcon = new ImageView();
        actionPane = new AnchorPane();
        lineV2 = new Line();
        lineV1 = new Line();
        lineH2 = new Line();
        lineH1 = new Line();
        btn3 = new Button();
        btn6 = new Button();
        btn7 = new Button();
        btn9 = new Button();
        btn1 = new Button();
        btn2 = new Button();
        btn4 = new Button();
        btn5 = new Button();
        btn8 = new Button();
        sperateLine = new Line();
        infoPane = new AnchorPane();
        player_2 = new Label();
        pLayer_1 = new Label();
        tieLabel = new Label();
        scoreLabel_1 = new Label();
        scoreLabel_2 = new Label();
        tieScoreLabel = new Label();
        statusLable = new Label();
        scoreIcon = new ImageView();
        soundIcon = new ImageView();

        setId("rootPane");
        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(560.0);
        getStylesheets().add("/tictactoe/../css/styles.css");

        BorderPane.setAlignment(leftSideAnchorPane, javafx.geometry.Pos.CENTER);
        leftSideAnchorPane.setPrefHeight(512.0);
        leftSideAnchorPane.setPrefWidth(179.0);
        setLeft(leftSideAnchorPane);

        BorderPane.setAlignment(rightSideAnchorPane, javafx.geometry.Pos.CENTER);
        rightSideAnchorPane.setPrefHeight(200.0);
        rightSideAnchorPane.setPrefWidth(200.0);
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(contentPane, javafx.geometry.Pos.BOTTOM_CENTER);
        contentPane.setId("contentPane");
        contentPane.setMaxWidth(USE_PREF_SIZE);
        contentPane.setMinWidth(USE_PREF_SIZE);
        contentPane.setPrefHeight(600.0);
        contentPane.setPrefWidth(393.0);

        AnchorPane.setBottomAnchor(gameTitle, 569.6666666666666);
        AnchorPane.setLeftAnchor(gameTitle, 50.0);
        AnchorPane.setRightAnchor(gameTitle, 226.66666666666663);
        AnchorPane.setTopAnchor(gameTitle, 13.0);
        gameTitle.setAlignment(javafx.geometry.Pos.CENTER);
        gameTitle.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        gameTitle.setId("gameTitle");
        gameTitle.setLayoutX(50.0);
        gameTitle.setLayoutY(13.0);
        gameTitle.setText("TICTOCTOE-GAME");
        gameTitle.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameTitle.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        gameTitle.setFont(new Font("System Bold", 12.0));

        AnchorPane.setBottomAnchor(homeIcon, 558.1918449401855);
        AnchorPane.setLeftAnchor(homeIcon, 4.0);
        AnchorPane.setRightAnchor(homeIcon, 337.3333333333333);
        AnchorPane.setTopAnchor(homeIcon, 2.0);
        homeIcon.setAccessibleRole(javafx.scene.AccessibleRole.BUTTON);
        homeIcon.setAccessibleRoleDescription("toHomePage");
        homeIcon.setFitHeight(46.0);
        homeIcon.setFitWidth(40.0);
        homeIcon.setId("homeIcon");
        homeIcon.setLayoutX(4.0);
        homeIcon.setLayoutY(2.0);
        homeIcon.setOnMouseClicked(this::loadHomeScene);
        homeIcon.setPickOnBounds(true);
        homeIcon.setPreserveRatio(true);
        homeIcon.setImage(new Image(getClass().getResource("../img/icon.png").toExternalForm()));

        AnchorPane.setBottomAnchor(actionPane, 226.66666666666669);
        AnchorPane.setLeftAnchor(actionPane, 42.0);
        AnchorPane.setRightAnchor(actionPane, 42.0);
        AnchorPane.setTopAnchor(actionPane, 68.0);
        actionPane.setId("actionPane");
        actionPane.setLayoutX(42.0);
        actionPane.setLayoutY(68.0);
        actionPane.setPrefHeight(305.0);
        actionPane.setPrefWidth(297.0);
        actionPane.getStyleClass().add("action");
        actionPane.getStylesheets().add("/tictactoe/../css/styles.css");

        lineV2.setEndX(-105.99996948242188);
        lineV2.setEndY(267.0);
        lineV2.setId("lineV2");
        lineV2.setLayoutX(304.0);
        lineV2.setLayoutY(20.0);
        lineV2.setStartX(-105.99998474121094);
        lineV2.setStartY(8.666664123535156);
        lineV2.setStroke(javafx.scene.paint.Color.WHITE);
        lineV2.setStrokeWidth(4.0);

        lineV1.setEndX(-105.99995422363281);
        lineV1.setEndY(266.3333435058594);
        lineV1.setId("lineV1");
        lineV1.setLayoutX(201.0);
        lineV1.setLayoutY(21.0);
        lineV1.setStartX(-105.99998474121094);
        lineV1.setStartY(8.666664123535156);
        lineV1.setStroke(javafx.scene.paint.Color.WHITE);
        lineV1.setStrokeWidth(4.0);

        lineH2.setEndX(-127.99998474121094);
        lineH2.setEndY(290.0);
        lineH2.setId("lineH2");
        lineH2.setLayoutX(130.0);
        lineH2.setLayoutY(-88.0);
        lineH2.setStartX(159.33334350585938);
        lineH2.setStartY(290.0);
        lineH2.setStroke(javafx.scene.paint.Color.WHITE);
        lineH2.setStrokeWidth(4.0);

        lineH1.setEndX(-142.99998474121094);
        lineH1.setEndY(290.0);
        lineH1.setId("lineH1");
        lineH1.setLayoutX(145.0);
        lineH1.setLayoutY(-176.0);
        lineH1.setStartX(143.33334350585938);
        lineH1.setStartY(290.0);
        lineH1.setStroke(javafx.scene.paint.Color.WHITE);
        lineH1.setStrokeWidth(4.0);

        btn3.setAlignment(javafx.geometry.Pos.CENTER);
        btn3.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn3.setId("btn3");
        btn3.setLayoutX(201.0);
        btn3.setLayoutY(29.0);
        btn3.setMnemonicParsing(false);
        btn3.setPrefHeight(81.0);
        btn3.setPrefWidth(89.0);
        btn3.getStyleClass().add("btn");
        btn3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn3.setTextFill(javafx.scene.paint.Color.WHITE);

        btn6.setAlignment(javafx.geometry.Pos.CENTER);
        btn6.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn6.setId("btn6");
        btn6.setLayoutX(201.0);
        btn6.setLayoutY(117.0);
        btn6.setMnemonicParsing(false);
        btn6.setPrefHeight(81.0);
        btn6.setPrefWidth(89.0);
        btn6.getStyleClass().add("btn");
        btn6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn6.setTextFill(javafx.scene.paint.Color.WHITE);

        btn7.setAlignment(javafx.geometry.Pos.CENTER);
        btn7.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn7.setId("btn7");
        btn7.setLayoutX(3.0);
        btn7.setLayoutY(205.0);
        btn7.setMnemonicParsing(false);
        btn7.setPrefHeight(81.0);
        btn7.setPrefWidth(89.0);
        btn7.getStyleClass().add("btn");
        btn7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn7.setTextFill(javafx.scene.paint.Color.WHITE);

        btn9.setAlignment(javafx.geometry.Pos.CENTER);
        btn9.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn9.setId("btn9");
        btn9.setLayoutX(201.0);
        btn9.setLayoutY(205.0);
        btn9.setMnemonicParsing(false);
        btn9.setPrefHeight(81.0);
        btn9.setPrefWidth(89.0);
        btn9.getStyleClass().add("btn");
        btn9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn9.setTextFill(javafx.scene.paint.Color.WHITE);

        btn1.setAlignment(javafx.geometry.Pos.CENTER);
        btn1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn1.setId("btn1");
        btn1.setLayoutX(3.0);
        btn1.setLayoutY(29.0);
        btn1.setMnemonicParsing(false);
        btn1.setPrefHeight(81.0);
        btn1.setPrefWidth(89.0);
        btn1.getStyleClass().add("btn");
        btn1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn1.setTextFill(javafx.scene.paint.Color.WHITE);

        btn2.setAlignment(javafx.geometry.Pos.CENTER);
        btn2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn2.setId("btn2");
        btn2.setLayoutX(98.0);
        btn2.setLayoutY(29.0);
        btn2.setMnemonicParsing(false);
        btn2.setPrefHeight(81.0);
        btn2.setPrefWidth(97.0);
        btn2.getStyleClass().add("btn");
        btn2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn2.setTextFill(javafx.scene.paint.Color.WHITE);

        btn4.setAlignment(javafx.geometry.Pos.CENTER);
        btn4.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn4.setId("btn4");
        btn4.setLayoutX(3.0);
        btn4.setLayoutY(117.0);
        btn4.setMnemonicParsing(false);
        btn4.setPrefHeight(81.0);
        btn4.setPrefWidth(89.0);
        btn4.getStyleClass().add("btn");
        btn4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn4.setTextFill(javafx.scene.paint.Color.WHITE);

        btn5.setAlignment(javafx.geometry.Pos.CENTER);
        btn5.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn5.setId("btn5");
        btn5.setLayoutX(98.0);
        btn5.setLayoutY(117.0);
        btn5.setMnemonicParsing(false);
        btn5.setPrefHeight(81.0);
        btn5.setPrefWidth(97.0);
        btn5.getStyleClass().add("btn");
        btn5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn5.setTextFill(javafx.scene.paint.Color.WHITE);

        btn8.setAlignment(javafx.geometry.Pos.CENTER);
        btn8.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn8.setId("btn8");
        btn8.setLayoutX(98.0);
        btn8.setLayoutY(205.0);
        btn8.setMnemonicParsing(false);
        btn8.setPrefHeight(81.0);
        btn8.setPrefWidth(97.0);
        btn8.getStyleClass().add("btn");
        btn8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btn8.setTextFill(javafx.scene.paint.Color.WHITE);

        AnchorPane.setBottomAnchor(sperateLine, 208.0);
        AnchorPane.setLeftAnchor(sperateLine, 13.0);
        AnchorPane.setRightAnchor(sperateLine, 12.99998982747394);
        AnchorPane.setTopAnchor(sperateLine, 390.0);
        sperateLine.setEndX(-171.0);
        sperateLine.setEndY(290.0);
        sperateLine.setId("lineH2");
        sperateLine.setLayoutX(185.0);
        sperateLine.setLayoutY(101.0);
        sperateLine.setStartX(182.33334350585938);
        sperateLine.setStartY(290.0);
        sperateLine.setStroke(javafx.scene.paint.Color.valueOf("#7e7c7c"));
        sperateLine.setStrokeWidth(2.0);

        AnchorPane.setBottomAnchor(infoPane, 39.0);
        AnchorPane.setLeftAnchor(infoPane, 8.0);
        AnchorPane.setRightAnchor(infoPane, 12.0);
        AnchorPane.setTopAnchor(infoPane, 420.0);
        infoPane.setId("scorePane");
        infoPane.setLayoutX(8.0);
        infoPane.setLayoutY(420.0);
        infoPane.setPrefHeight(141.0);
        infoPane.setPrefWidth(373.0);

        player_2.setAlignment(javafx.geometry.Pos.CENTER);
        player_2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        player_2.setLayoutX(233.0);
        player_2.setLayoutY(34.0);
        player_2.getStyleClass().add("xText");
        player_2.setText("Mohammed");
        player_2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player_2.setTextFill(javafx.scene.paint.Color.valueOf("#e6e6e6"));
        player_2.setFont(new Font("System Bold", 16.0));

        pLayer_1.setAlignment(javafx.geometry.Pos.CENTER);
        pLayer_1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        pLayer_1.setLayoutX(44.0);
        pLayer_1.setLayoutY(34.0);
        pLayer_1.setText("Ahmed");
        pLayer_1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        pLayer_1.setTextFill(javafx.scene.paint.Color.valueOf("#8bc0ec"));
        pLayer_1.setFont(new Font("System Bold", 16.0));

        tieLabel.setAlignment(javafx.geometry.Pos.CENTER);
        tieLabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        tieLabel.setLayoutX(175.0);
        tieLabel.setLayoutY(83.0);
        tieLabel.getStyleClass().add("scoreText");
        tieLabel.setText("Tie");
        tieLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        tieLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        tieLabel.setFont(new Font("System Bold", 18.0));

        scoreLabel_1.setAlignment(javafx.geometry.Pos.CENTER);
        scoreLabel_1.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        scoreLabel_1.setLayoutX(47.0);
        scoreLabel_1.setLayoutY(56.0);
        scoreLabel_1.setText("score");
        scoreLabel_1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        scoreLabel_1.setTextFill(javafx.scene.paint.Color.valueOf("#8bc0ec"));
        scoreLabel_1.setFont(new Font("System Bold", 18.0));

        scoreLabel_2.setAlignment(javafx.geometry.Pos.CENTER);
        scoreLabel_2.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        scoreLabel_2.setLayoutX(256.0);
        scoreLabel_2.setLayoutY(57.0);
        scoreLabel_2.getStyleClass().add("xText");
        scoreLabel_2.setText("score");
        scoreLabel_2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        scoreLabel_2.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        scoreLabel_2.setFont(new Font("System Bold", 18.0));

        tieScoreLabel.setAlignment(javafx.geometry.Pos.CENTER);
        tieScoreLabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        tieScoreLabel.setLayoutX(158.0);
        tieScoreLabel.setLayoutY(106.0);
        tieScoreLabel.getStyleClass().add("scoreText");
        tieScoreLabel.setText("tieScore");
        tieScoreLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        tieScoreLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        tieScoreLabel.setFont(new Font("System Bold", 18.0));

        statusLable.setAlignment(javafx.geometry.Pos.CENTER);
        statusLable.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        statusLable.setLayoutX(9.0);
        statusLable.setLayoutY(-14.0);
        statusLable.setPrefHeight(29.0);
        statusLable.setPrefWidth(349.0);
        statusLable.getStyleClass().add("scoreText");
        statusLable.setText("waiting for player 2");
        statusLable.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        statusLable.setTextFill(javafx.scene.paint.Color.valueOf("#0ecf18"));
        statusLable.setFont(new Font(20.0));

        scoreIcon.setFitHeight(58.0);
        scoreIcon.setFitWidth(151.0);
        scoreIcon.setLayoutX(159.0);
        scoreIcon.setLayoutY(18.0);
        scoreIcon.setPickOnBounds(true);
        scoreIcon.setPreserveRatio(true);
        scoreIcon.setImage(new Image(getClass().getResource("../img/score-icon-2.png").toExternalForm()));

        AnchorPane.setBottomAnchor(soundIcon, 542.0);
        AnchorPane.setLeftAnchor(soundIcon, 317.0);
        AnchorPane.setRightAnchor(soundIcon, 31.968186696370424);
        AnchorPane.setTopAnchor(soundIcon, 28.0);
        soundIcon.setAccessibleRole(javafx.scene.AccessibleRole.BUTTON);
        soundIcon.setFitHeight(30.0);
        soundIcon.setFitWidth(35.0);
        soundIcon.setLayoutX(317.0);
        soundIcon.setLayoutY(28.0);
        soundIcon.setOnMouseClicked(this::muteSound);
        soundIcon.setPickOnBounds(true);
        soundIcon.setPreserveRatio(true);
        soundIcon.setImage(new Image(getClass().getResource("../img/sound_icon.png").toExternalForm()));
        setCenter(contentPane);

        contentPane.getChildren().add(gameTitle);
        contentPane.getChildren().add(homeIcon);
        actionPane.getChildren().add(lineV2);
        actionPane.getChildren().add(lineV1);
        actionPane.getChildren().add(lineH2);
        actionPane.getChildren().add(lineH1);
        actionPane.getChildren().add(btn3);
        actionPane.getChildren().add(btn6);
        actionPane.getChildren().add(btn7);
        actionPane.getChildren().add(btn9);
        actionPane.getChildren().add(btn1);
        actionPane.getChildren().add(btn2);
        actionPane.getChildren().add(btn4);
        actionPane.getChildren().add(btn5);
        actionPane.getChildren().add(btn8);
        contentPane.getChildren().add(actionPane);
        contentPane.getChildren().add(sperateLine);
        infoPane.getChildren().add(player_2);
        infoPane.getChildren().add(pLayer_1);
        infoPane.getChildren().add(tieLabel);
        infoPane.getChildren().add(scoreLabel_1);
        infoPane.getChildren().add(scoreLabel_2);
        infoPane.getChildren().add(tieScoreLabel);
        infoPane.getChildren().add(statusLable);
        infoPane.getChildren().add(scoreIcon);
        contentPane.getChildren().add(infoPane);
        contentPane.getChildren().add(soundIcon);

    }

    protected void loadHomeScene(javafx.scene.input.MouseEvent mouseEvent) {
        Parent root = ms;
        Scene scene = homeIcon.getScene();

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

    protected void muteSound(javafx.scene.input.MouseEvent mouseEvent) {
    }

}
