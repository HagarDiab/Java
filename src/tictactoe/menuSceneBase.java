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

    PopUpLocalVsNwBase nwPopUp = new PopUpLocalVsNwBase();
    PopUpLevelBase levelPopUp = new PopUpLevelBase();
    historySceneBase hs = new historySceneBase(); 

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane1;
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

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        containerPane = new AnchorPane();
        contentPane1 = new AnchorPane();
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

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.BOTTOM_CENTER);
        containerPane.setId("contentPane");
        containerPane.setMaxWidth(USE_PREF_SIZE);
        containerPane.setMinWidth(USE_PREF_SIZE);
        containerPane.setPrefHeight(600.0);
        containerPane.setPrefWidth(393.0);

        contentPane1.setId("contentPane");
        contentPane1.setLayoutX(19.0);
        contentPane1.setPrefHeight(600.0);
        contentPane1.setPrefWidth(359.0);

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
        onePlayer.setOnAction(this::loadPopUpLevels);
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

        contentPane1.getChildren().add(title);
        contentPane1.getChildren().add(imageView);
        contentPane1.getChildren().add(playerName);
        contentPane1.getChildren().add(onePlayer);
        contentPane1.getChildren().add(multiPlayer);
        contentPane1.getChildren().add(exit);
        contentPane1.getChildren().add(about);
        contentPane1.getChildren().add(history);
        containerPane.getChildren().add(contentPane1);

    }

    protected void loadPopUpLevels(javafx.event.ActionEvent actionEvent) {
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

    protected void loadPopUpLocalVsNw(javafx.event.ActionEvent actionEvent) {
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

    protected void exitProgram(javafx.event.ActionEvent actionEvent) {
    }

    protected void loadAboutScene(javafx.scene.input.MouseEvent mouseEvent) {
    }

    protected void historyScene(javafx.scene.input.MouseEvent mouseEvent) {
        Parent root = hs;
        Scene scene = history.getScene();

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
