/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class KamarEntity {
    private String idKamar;
    private String jenis;
    
    public KamarEntity(String idKamar, String jenis){
        this.idKamar = idKamar;
        this.jenis = jenis;
    }
    
    public KamarEntity(){
        
    }

    public String getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(String idKamar) {
        this.idKamar = idKamar;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
}
