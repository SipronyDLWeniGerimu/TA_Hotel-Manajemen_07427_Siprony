/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StaffModel;
import Entity.StaffEntity;
import java.util.ArrayList;

/**
 *
 * @author MTJP Project
 */
public class StaffController {
    public StaffModel staffM = new StaffModel();
    
    public StaffController(){
        
    }
    
    public ArrayList<StaffEntity> view(){
        return staffM.getDataStaff();
    }
    
    public void insert(StaffEntity staff){
        staffM.insert(staff);
    }
    
    public void update(int index, StaffEntity staff){
        staffM.update(index, staff);
    }
    
    public void delete(int index){
        staffM.delete(index);
    }
    
}
