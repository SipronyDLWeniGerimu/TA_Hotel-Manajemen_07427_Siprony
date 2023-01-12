/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.StaffEntity;
import java.util.ArrayList;

public class StaffModel implements InterfacesModel{
    public ArrayList<StaffEntity> DataStaff;
    
    public StaffModel(){
        
    }
    
    public ArrayList<StaffEntity> getDataStaff(){
        return DataStaff;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataStaff.add((StaffEntity) x);
    }
    
    public void update(int index, Object x){
        DataStaff.set(index, (StaffEntity) x);
    }
    
    public void delete(int index){
        DataStaff.remove(index);
    }
    
}
