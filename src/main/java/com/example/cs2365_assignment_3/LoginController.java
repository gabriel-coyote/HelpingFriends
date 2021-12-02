package com.example.cs2365_assignment_3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {


    @FXML
    private Pane pane_createAccount;
    @FXML
    private Pane pane_login;
    @FXML
    private Button button_register;
    @FXML
    private Button button_create;
    @FXML
    private Button button_login_page;






    @FXML
    public void onRegisterButton_click(){
        pane_createAccount.setVisible(true);
        pane_login.setVisible(false);
    }

    @FXML
    public void onLoginPageButton_click(){
        pane_createAccount.setVisible(false);
        pane_login.setVisible(true);
    }

    @FXML
    public void onCreateButton_click(){

    }

    @FXML
    public void onLoginButton_click() throws IOException {

        //Close Login Stage/Window
        Stage window;
        window = (Stage) pane_login.getScene().getWindow();
        window.close();

        //Change to Store Page
        Stage StoreStage = new Stage();
        FXMLLoader FxmlLoader = new FXMLLoader(HelloApplication.class.getResource("store_view.fxml"));
        Scene storeScene = new Scene(FxmlLoader.load(), 720, 720);
        StoreStage.setTitle("Store");
        StoreStage.setScene(storeScene);
        StoreStage.show();
    }

}
