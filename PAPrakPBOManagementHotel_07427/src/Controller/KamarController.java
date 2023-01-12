/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.KamarEntity;
import Model.KamarModel;
import java.util.ArrayList;

public class KamarController {
    public KamarModel kamarM = new KamarModel();
    
    public KamarController(){
        
    }
    
    public ArrayList<KamarEntity> view(){
        return kamarM.getDataKamar;
    }
    
    public void insert(KamarEntity kamar){
        kamarM.insert(kamar);
    }
    
    public void update(int index, KamarEntity kamar){
        kamarM.update(index, kamar);
    }
    
    public void delete(int index){
        kamarM.delete(index);
    }
    
    public int cekKamar(String idKamar){
        int ket = -1;
        if(kamarM.getDataKamar().size() > 0){
            for(int i = 0; i < kamarM.getDataKamar().size(); i++){
                if(idKamar.equals(kamarM.getDataKamar().get(i).getIdKamar())){
                    ket = i;
                    break;
                }
                else {
                    ket = -1;
                }
            }
        }
        return ket;
    }
    
    public KamarEntity showDaftarKamar(int index){
        return kamarM.getDataKamar.get(index);
    }
}
