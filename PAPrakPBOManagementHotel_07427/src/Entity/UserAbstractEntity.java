/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author MTJP Project
 */
public abstract class UserAbstractEntity {
    protected String id, nama, alamat;
    
    public UserAbstractEntity(String id, String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public UserAbstractEntity(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
