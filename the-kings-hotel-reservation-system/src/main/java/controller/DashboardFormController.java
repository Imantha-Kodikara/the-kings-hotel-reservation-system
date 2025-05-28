package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DashboardFormController {
    @FXML
    private Label lblTime;

    @FXML
    private Label lblDate;

    @FXML
    private Button btnRoom;

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
    public void btnRoomManagementOnClick(ActionEvent actionEvent) {
      Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/rooms_management_form_view.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnReservationManagementOnClick(ActionEvent actionEvent) {
    }

    public void btnCustomerManagementOnClick(ActionEvent actionEvent) {
    }

    public void btnBillingOnClick(ActionEvent actionEvent) {
    }

    public void btnReportOnClick(ActionEvent actionEvent) {
    }

    public void btnCheckInOnClick(ActionEvent actionEvent) {
    }
}
