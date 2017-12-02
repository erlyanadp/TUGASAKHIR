/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhir;

import com.mysql.jdbc.Statement;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.swing.JOptionPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
/**
 * FXML Controller class
 *
 * @author Erlyana
 */
public class HomeController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private TextField barang;
    @FXML
    private TextField telp;
     @FXML
    private TableView<data> tabel;
    @FXML
    private TableColumn<data, String> pelangganID;
    @FXML
    private TableColumn<data, String> barangID;
    @FXML
    private TableColumn<data, String> pembayaranID;
    @FXML
    private TableColumn<data, String> telpID;
    @FXML
    private Button btnproses;
    @FXML
    private Button btntampil;
    private ObservableList<data>doto;
    private data dc;
    @FXML
    private Button btnback;
    @FXML
    private RadioButton tunaiID;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton kreditID;

    @FXML
    private RadioButton debitID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        try{
            String sql= "INSERT INTO formulir (nama_pel,nama_brg,telp) VALUES ('"+nama.getText()+"','"+barang.getText()+"','"+telp.getText()+"'";
            java.sql.Connection con=(Connection)config.configDB();
            java.sql.PreparedStatement stm=con.prepareStatement(sql);
            stm.execute();
            JOptionPane.showMessageDialog(null, "Save Success");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Penyimpanan Gagal"+ e.getMessage());
        }

        if(nama.getText().equals("") || barang.getText().equals("") || telp.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data Anda");
        }else{
        String ta11 = "";
        String Nama = nama.getText();
        String Barang = barang.getText();
        int Telp = Integer.parseInt(telp.getText());
        
        if(tunaiID.isSelected()){
             
        }
        else if(kreditID.isSelected()){
            
        }
        else if(debitID.isSelected()){
            
        }
        else{
                JOptionPane.showMessageDialog(null, "Harap Lengkapi Data Anda");
                      
        }
        }
    }

    @FXML
    private void tampilkan(ActionEvent event) {
        Connection con;
        Statement stat;
        
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = (Statement) DB.stm;
        try{
            doto = FXCollections.observableArrayList();
            
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM formulir");
            while (rs.next()){
                doto.add(new data(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        }
        catch(SQLException ex){
            System.err.println("Error"+ex);
        }
        pelangganID.setCellValueFactory(new PropertyValueFactory<>("pelanggan"));
        barangID.setCellValueFactory(new PropertyValueFactory<>("barang"));
        pembayaranID.setCellValueFactory(new PropertyValueFactory<>("pembayaran"));
        telpID.setCellValueFactory(new PropertyValueFactory<>("telp"));
        
        tabel.setItems(null);
        tabel.setItems(doto);
    }

    @FXML
    private void back(ActionEvent event) {
    }
    
}
