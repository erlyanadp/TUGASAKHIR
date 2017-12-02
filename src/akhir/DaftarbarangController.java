/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhir;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Erlyana
 */
public class DaftarbarangController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    
    @FXML
    private Button btnback;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void iphone(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }    
    }
    @FXML
    private void mac(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }    

    }

    

    @FXML
    private void iph(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }    

    }

    @FXML
    private void ipad(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }    

    }


    @FXML
    private void ipod(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }    

    }



    @FXML
    private void imac(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }    

    }

    @FXML
    void back(ActionEvent event) {
        try{
        // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("EDP Gadget");
            stage.show();
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
        
        }  
    }
    }
    
