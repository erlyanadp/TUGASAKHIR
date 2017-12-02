/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhir;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Erlyana
 */
public class data {
    static void add(data data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final StringProperty Nama_Pel;
    private final StringProperty Nama_Barang;
    private final StringProperty Pembayaran;
    private final StringProperty Telp;
    
  
    public data(String nama, String barang, String telp, String pembayaran){
        this.Nama_Pel = new SimpleStringProperty(nama);
        this.Nama_Barang = new SimpleStringProperty(barang);
        this.Pembayaran = new SimpleStringProperty(pembayaran);
        this.Telp = new SimpleStringProperty(telp);
    }

    data(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNama(){
        return Nama_Pel.get();
    }
    
    public String getBarang(){
        return Nama_Barang.get();
    }
    
    public String getTelp(){
        return Telp.get();
    }
    
    public String getPembayaran(){
        return Pembayaran.get();
    }
    
    
    public void setNama(String value){
        Nama_Pel.set(value);
    }
    
    public void setBarang(String value){
        Nama_Barang.set(value);
    }
    
    public void setTelp(String value){
        Telp.set(value);
    }
    
    public void setPembayaran(String value){
        Pembayaran.set(value);
    }
    
    public StringProperty namaProperty(){
        return Nama_Pel;
    }
    
    public StringProperty barangProperty(){
        return Nama_Barang;
    }
    
    public StringProperty telpProperty(){
        return Telp;
    }
    
    public StringProperty pembayaranProperty(){
        return Pembayaran;
    }

}
