/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.KamarEntity;
import java.util.ArrayList;

public class KamarModel implements InterfacesModel{
    private ArrayList<KamarEntity> DataKamar;
    public ArrayList<KamarEntity> getDataKamar;
    
    public KamarModel(){
        DataKamar = new ArrayList<>();
    }
    
    public ArrayList<KamarEntity> getDataKamar(){
        return DataKamar;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataKamar.add((KamarEntity) x);
    }
    
    public void update(int index, Object x){
        DataKamar.set(index, (KamarEntity) x);
    }
    
    public void delete(int index){
        DataKamar.remove(index);
    }
    
    public void get_where(int index){
        DataKamar.get(index);
    }
    
}
