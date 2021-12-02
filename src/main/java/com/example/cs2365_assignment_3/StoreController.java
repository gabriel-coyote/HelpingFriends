package com.example.cs2365_assignment_3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.controlsfx.control.ListSelectionView;

import java.io.IOException;
import java.util.ListIterator;

public class StoreController {


    @FXML
    private Pane pane_addToCart;
    @FXML
    private Pane pane_viewCart;

    @FXML
    private Button button_search_item;
    @FXML
    private TextField textField_itemSearch;


    @FXML
    private ListView<Product> productListView;
    //Key Component: ObservableList with variety of string item types for list.
    final ObservableList<Product> listProduct = FXCollections.observableArrayList();

    @FXML
    private Button button_logOff;
    @FXML
    private Button button_viewCart;


    @FXML
    public void onSearchItemButton_click() throws IOException{

        for(Product product: Data.products){
            if(product.getproductName().contains(textField_itemSearch.getText())){
                listProduct.add(product);
            }
        }
    }


    @FXML
    public void onLogOffButton_click() throws IOException {

        //Close Manage Account Stage/Window
        Stage window;
        window = (Stage) pane_viewCart.getScene().getWindow();
        window.close();

        //Change to Store Page
        Stage Stage = new Stage();
        FXMLLoader FxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login_view.fxml"));
        Scene storeScene = new Scene(FxmlLoader.load(), 500, 400);
        Stage.setTitle("Login");
        Stage.setScene(storeScene);
        Stage.show();
    }

    @FXML
    public void onViewCartButton_click() throws IOException {
        pane_addToCart.setVisible(false);
        pane_viewCart.setVisible(true);
    }


}
