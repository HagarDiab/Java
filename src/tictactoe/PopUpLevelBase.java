package tictactoe;

import javafx.animation.FadeTransition;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PopUpLevelBase extends BorderPane {

    protected final AnchorPane leftSideAnchorPane;
    protected final AnchorPane rightSideAnchorPane;
    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final Button hardOption;
    protected final InnerShadow innerShadow;
    protected final Button easyOption;
    protected final InnerShadow innerShadow0;
    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;

    public PopUpLevelBase() {

        leftSideAnchorPane = new AnchorPane();
        rightSideAnchorPane = new AnchorPane();
        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        hardOption = new Button();
        innerShadow = new InnerShadow();
        easyOption = new Button();
        innerShadow0 = new InnerShadow();
        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();

        setMaxWidth(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(578.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(leftSideAnchorPane, javafx.geometry.Pos.CENTER);
        leftSideAnchorPane.setPrefHeight(561.0);
        leftSideAnchorPane.setPrefWidth(200.0);
        setLeft(leftSideAnchorPane);

        BorderPane.setAlignment(rightSideAnchorPane, javafx.geometry.Pos.CENTER);
        rightSideAnchorPane.setPrefHeight(561.0);
        rightSideAnchorPane.setPrefWidth(207.0);
        setRight(rightSideAnchorPane);

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.BOTTOM_CENTER);
        containerPane.setId("contentPane");
        containerPane.setMaxHeight(USE_PREF_SIZE);
        containerPane.setMaxWidth(USE_PREF_SIZE);
        containerPane.setMinHeight(USE_PREF_SIZE);
        containerPane.setMinWidth(USE_PREF_SIZE);
        containerPane.setPrefHeight(264.0);
        containerPane.setPrefWidth(382.0);

        contentPane.setPrefHeight(266.0);
        contentPane.setPrefWidth(381.0);
        contentPane.getStylesheets().add("/tictactoe/../css/styles.css");

        hardOption.setAlignment(javafx.geometry.Pos.CENTER);
        hardOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        hardOption.setId("onePlayer");
        hardOption.setLayoutX(125.0);
        hardOption.setLayoutY(154.0);
        hardOption.setMnemonicParsing(false);
        hardOption.setOnAction(this::loadGameSceneHardLevel);
        hardOption.setPrefHeight(41.0);
        hardOption.setPrefWidth(143.0);
        hardOption.getStyleClass().add("options");
        hardOption.getStylesheets().add("/tictactoe/../../../versions/version%208/TicTacToe/src/css/styles.css");
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

        easyOption.setAlignment(javafx.geometry.Pos.CENTER);
        easyOption.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        easyOption.setId("exit");
        easyOption.setLayoutX(125.0);
        easyOption.setLayoutY(53.0);
        easyOption.setMnemonicParsing(false);
        easyOption.setOnAction(this::loadGameSceneEasyLevel);
        easyOption.setPrefHeight(41.0);
        easyOption.setPrefWidth(143.0);
        easyOption.getStyleClass().add("options");
        easyOption.getStylesheets().add("/tictactoe/../../../versions/version%208/TicTacToe/src/css/styles.css");
        easyOption.setText("Easy");
        easyOption.setTextFill(javafx.scene.paint.Color.valueOf("#0a0801"));
        easyOption.setFont(new Font("System Bold", 12.0));

        innerShadow0.setColor(javafx.scene.paint.Color.WHITE);
        innerShadow0.setOffsetY(2.0);
        innerShadow0.setRadius(11.0);
        innerShadow0.setWidth(25.0);
        easyOption.setEffect(innerShadow0);
        setCenter(containerPane);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(79.0);
        anchorPane.setPrefWidth(600.0);
        setTop(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(144.0);
        anchorPane0.setPrefWidth(600.0);
        setBottom(anchorPane0);

        contentPane.getChildren().add(hardOption);
        contentPane.getChildren().add(easyOption);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadGameSceneEasyLevel(javafx.event.ActionEvent actionEvent){
        GameSceneBase gs = new GameSceneBase();
        Scene scene = easyOption.getScene();
        BorderPane p = (BorderPane) scene.getRoot();
        p.setCenter(gs.containerPane);

        makeFadeOut();
        
    }
    
    
    protected void loadGameSceneHardLevel(javafx.event.ActionEvent actionEvent){
        GameSceneBase gs = new GameSceneBase();
        Scene scene = hardOption.getScene();
        BorderPane p = (BorderPane) scene.getRoot();
        p.setCenter(gs.containerPane);

        makeFadeOut();
        
    }
    
    private void makeFadeOut() {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.seconds(1));
        fadeTransition.setNode(containerPane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        //fadeTransition.setOnFinished((ActionEvent event) -> {
        //    loadHomeScene(event);
        //});
        fadeTransition.play(); //to Initiate the transition
    }



}
