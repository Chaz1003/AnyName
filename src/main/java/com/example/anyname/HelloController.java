package com.example.anyname;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloController {
    public Label welcomeText;
    public TextField tfUserName;
    public PasswordField psSignIn;
    public Button btnLogOut;
    public Label tfPassword;
    public VBox pnLogin;
    public VBox pnLogOut;
    public ColorPicker cpPicker;
    String user1 = "Ant";
    String user2 = "Chaz";
    String user3 = "Vicky";
    String password1 = "Dan123";
    String password2 = "Chazcutie";
    String password3 = "tweet";
    @FXML
    private Label lbDisplay;

    @FXML
    protected void onSignInClick() throws IOException {

        AnchorPane p = (AnchorPane) pnLogin.getParent();
        Parent scene;
//        p.getScene().getStylesheets().clear();
        if(tfUserName.getText().equals(user1) && psSignIn.getText().equals(password1)){
            p.getStylesheets().add(getClass().getResource("user1.css").toExternalForm());
             scene = FXMLLoader.load(getClass().getResource("home-view.fxml"));

            p.getScene().getStylesheets().clear();
            p.getChildren().clear();
            p.getChildren().add(scene);

        }
        else if(tfUserName.getText().equals(user2) && psSignIn.getText().equals(password2)){
            p.getStylesheets().add(getClass().getResource("user2.css").toExternalForm());
             scene = FXMLLoader.load(getClass().getResource("home-view.fxml"));

            p.getScene().getStylesheets().clear();
            p.getChildren().clear();
            p.getChildren().add(scene);
        }
        else if(tfUserName.getText().equals(user3) && psSignIn.getText().equals(password3)){
            p.getStylesheets().add(getClass().getResource("user3.css").toExternalForm());
             scene = FXMLLoader.load(getClass().getResource("home-view.fxml"));

            p.getScene().getStylesheets().clear();
            p.getChildren().clear();
            p.getChildren().add(scene);
        }else{
            lbDisplay.setText("Wrong Username or Password");
        }


    }

    @FXML
    protected void onLogOutClick() throws IOException {
        AnchorPane p = (AnchorPane) pnLogOut.getParent();
        Parent scene = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        scene.getStylesheets().clear();
        p.getChildren().clear();
        p.getChildren().add(scene);

        String color = cpPicker.getValue().toString();
        System.out.println(cpPicker.getValue());
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("user1.css").getPath(),true));
            bw.write("hello");
            bw.close();
        }catch (IOException e){
        }
       }

}