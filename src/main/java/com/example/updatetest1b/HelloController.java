package com.example.updatetest1b;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField Username;
    public PasswordField Passwd;
    public Label print;

    int y=0;
    @FXML
    protected void onHelloButtonClick() {
        String username =Username.getText();
        String passd = Passwd.getText();
        print.setText("");



        if (username.equals("") && passd.equals("")) {
          print.setText("Please Provide Username or Password.");
        } else {
            if (username.equals("bipana") && passd.equals("456")) {
                print.setText("Success!!!");
                y=5;
            } else if(username.equals("bipana")) {
                y = y - 1;
                if (y <= 0) {
                    print.setText("Your account Locked");
                } else {
                    print.setText("You have "+ y +" attempt left!!!.");
                }
            }else {
                print.setText("Invalid Username or Password");

                    }
                }


            }


        }









