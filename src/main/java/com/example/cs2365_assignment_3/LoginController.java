package com.example.cs2365_assignment_3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {


    @FXML
    private Pane pane_createAccount;
    @FXML
    private Pane pane_login;
    @FXML
    private Button button_login;
    @FXML
    private Button button_register;
    @FXML
    private Button button_create;
    @FXML
    private Button button_login_page;
    @FXML
    private TextField textField_lastName;
    @FXML
    private TextField textField_rewardNum;
    @FXML
    private Label label_invalidLogin;







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


        // If account is VALID
        //Check if login is valid in the LIST of customes in the Data class
        for( Customer customer: Data.customers){
            if(customer.getLastName().contains(textField_lastName.getText()) &&
                    customer.getphoneNum().contains(textField_rewardNum.getText())){

                label_invalidLogin.setText(""); //Rest invalid login text
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
                break;
            }
        }

        // If account is VALID
        label_invalidLogin.setText("INVALID login info...try again");
        label_invalidLogin.setTextFill(Color.RED);




    }

}
