package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RoomsManagementFormController {

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    @FXML
    public void initialize(){
        LocalDate today = LocalDate.now();
        lblDate.setText(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e ->{
            LocalTime currentTime = LocalTime.now();
            lblTime.setText(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Timeline.INDEFINITE);
        clock.play();
    }

    @FXML
    void btnAddRoomOnClick(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/add_room_form_view.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnDeleteRoomOnClick(ActionEvent event) {

    }

    @FXML
    void btnUpdateRoomOnClick(ActionEvent event) {

    }

    @FXML
    void btnViewRoomOnClick(ActionEvent event) {

    }

}
