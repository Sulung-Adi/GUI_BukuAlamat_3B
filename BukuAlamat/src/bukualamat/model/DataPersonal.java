/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author SulungAdi
 */
public class DataPersonal {

    private  StringProperty namadepan = new SimpleStringProperty();
    private  StringProperty namabelakang = new SimpleStringProperty();
    private  StringProperty alamat = new SimpleStringProperty();
    private  StringProperty kabupaten = new SimpleStringProperty();
    private  StringProperty nohp = new SimpleStringProperty();

    public DataPersonal() {
        
    }
    
    public DataPersonal(String namadepan, String namabelakang) {
        this.namadepan = new SimpleStringProperty(namadepan);
        this.namabelakang = new SimpleStringProperty(namabelakang);
        
        this.alamat = new SimpleStringProperty("Suatu Alamat");
        this.kabupaten = new SimpleStringProperty("Suatu Kabupaten");
        this.nohp = new SimpleStringProperty("001212112");
        
        
    }
    
    
    
    
    

    public String getNohp() {
        return nohp.get();
    }

    public void setNohp(String value) {
        nohp.set(value);
    }

    public StringProperty nohpProperty() {
        return nohp;
    }
    
    
    
    public String getKabupaten() {
        return kabupaten.get();
    }

    public void setKabupaten(String value) {
        kabupaten.set(value);
    }

    public StringProperty kabupatenProperty() {
        return kabupaten;
    }
    

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String value) {
        alamat.set(value);
    }

    public StringProperty alamatProperty() {
        return alamat;
    }
    

    public String getNamabelakang() {
        return namabelakang.get();
    }

    public void setNamabelakang(String value) {
        namabelakang.set(value);
    }

    public StringProperty namabelakangProperty() {
        return namabelakang;
    }
    

    public String getNamadepan() {
        return namadepan.get();
    }

    public void setNamadepan(String value) {
        namadepan.set(value);
    }

    public StringProperty namadepanProperty() {
        return namadepan;
    }
    
    
}
