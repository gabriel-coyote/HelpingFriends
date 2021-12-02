package com.example.cs2365_assignment_3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

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

}
