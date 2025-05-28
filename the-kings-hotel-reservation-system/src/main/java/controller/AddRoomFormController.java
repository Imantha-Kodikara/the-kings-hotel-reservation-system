package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class AddRoomFormController implements Initializable {

    @FXML
    private JFXComboBox<String> cmbAvailabilityStatus;

    @FXML
    private JFXComboBox<String> cmbRoomType;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cmbRoomType.setItems(FXCollections.observableArrayList("Single", "Double", "Suite"));
        cmbAvailabilityStatus.setItems(FXCollections.observableArrayList("Available", "Occupied"));
    }


    @FXML
    private JFXTextField txtPricePerNight;

    @FXML
    private JFXTextField txtRoomId;

    @FXML
    private JFXTextField txtRoomNumber;

    @FXML
    void btnAddOnClick(ActionEvent event) {

    }

    @FXML
    void btnClearOnClick(ActionEvent event) {

    }

}
