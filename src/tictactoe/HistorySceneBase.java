package tictactoe;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class HistorySceneBase extends BorderPane {
    
    menuSceneBase ms= new menuSceneBase();

    protected final AnchorPane containerPane;
    protected final AnchorPane contentPane;
    protected final ImageView logo;
    protected final Label sceneTitle;
    protected final Label userName;
    protected final ScrollPane scrollTablePane;
    protected final TableView historyTable;
    protected final TableColumn gameDate;
    protected final TableColumn player_1;
    protected final TableColumn player_2;
    protected final ImageView soundIcon;

    public HistorySceneBase() {

        containerPane = new AnchorPane();
        contentPane = new AnchorPane();
        logo = new ImageView();
        sceneTitle = new Label();
        userName = new Label();
        scrollTablePane = new ScrollPane();
        historyTable = new TableView();
        gameDate = new TableColumn();
        player_1 = new TableColumn();
        player_2 = new TableColumn();
        soundIcon = new ImageView();

        setId("rootPane");
        setPrefHeight(600.0);
        setPrefWidth(560.0);

        BorderPane.setAlignment(containerPane, javafx.geometry.Pos.CENTER);
        containerPane.setId("containerPane");
        containerPane.setPrefHeight(551.0);
        containerPane.setPrefWidth(630.0);
        containerPane.getStylesheets().add("/tictactoe/../css/styles.css");

        contentPane.setId("contentPane");
        contentPane.setLayoutX(100.0);
        contentPane.setPrefHeight(600.0);
        contentPane.setPrefWidth(360.0);

        logo.setFitHeight(51.0);
        logo.setFitWidth(50.0);
        logo.setId("logo");
        logo.setLayoutX(3.0);
        logo.setLayoutY(3.0);
        logo.setOnMouseClicked(this::loadHomeScene);
        logo.setPickOnBounds(true);
        logo.setPreserveRatio(true);
        logo.setImage(new Image(getClass().getResource("../img/icon.png").toExternalForm()));

        sceneTitle.setId("gameTitle");
        sceneTitle.setLayoutX(54.0);
        sceneTitle.setLayoutY(19.0);
        sceneTitle.setText("Game History");
        sceneTitle.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        sceneTitle.setFont(new Font("System Bold", 12.0));

        userName.setId("gameTitle");
        userName.setLayoutX(23.0);
        userName.setLayoutY(118.0);
        userName.setText("Hi, userName:");
        userName.setTextFill(javafx.scene.paint.Color.valueOf("#fce473"));
        userName.setFont(new Font("System Bold", 12.0));

        scrollTablePane.setLayoutX(26.0);
        scrollTablePane.setLayoutY(169.0);

        historyTable.setPrefHeight(288.0);
        historyTable.setPrefWidth(309.0);

        gameDate.setPrefWidth(99.33341217041016);
        gameDate.setText("Game_Date");

        player_1.setPrefWidth(108.66661071777344);
        player_1.setText("Player 1");

        player_2.setPrefWidth(100.6666259765625);
        player_2.setText("Player 2");
        scrollTablePane.setContent(historyTable);

        soundIcon.setAccessibleRole(javafx.scene.AccessibleRole.BUTTON);
        soundIcon.setFitHeight(30.0);
        soundIcon.setFitWidth(35.0);
        soundIcon.setLayoutX(306.0);
        soundIcon.setLayoutY(114.0);
        soundIcon.setOnMouseClicked(this::muteSound);
        soundIcon.setPickOnBounds(true);
        soundIcon.setPreserveRatio(true);
        soundIcon.setImage(new Image(getClass().getResource("../img/sound_icon.png").toExternalForm()));
        setCenter(containerPane);

        contentPane.getChildren().add(logo);
        contentPane.getChildren().add(sceneTitle);
        contentPane.getChildren().add(userName);
        historyTable.getColumns().add(gameDate);
        historyTable.getColumns().add(player_1);
        historyTable.getColumns().add(player_2);
        contentPane.getChildren().add(scrollTablePane);
        contentPane.getChildren().add(soundIcon);
        containerPane.getChildren().add(contentPane);

    }

    protected void loadHomeScene(javafx.scene.input.MouseEvent mouseEvent){
        Parent root = ms;
            Scene scene = logo.getScene();

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

    protected void muteSound(javafx.scene.input.MouseEvent mouseEvent){}

}
