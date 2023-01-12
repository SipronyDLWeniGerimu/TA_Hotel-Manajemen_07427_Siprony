/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.MemberEntity;
import java.util.ArrayList;

public class MemberModel implements InterfacesModel{
    public ArrayList<MemberEntity> DataMember;
    
    public MemberModel(){
        DataMember = new ArrayList<>();
    }
    
    public ArrayList<MemberEntity> getDataMember(){
        return DataMember;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataMember.add((MemberEntity) x);
    }
    
    public void update(int index, Object x){
        DataMember.set(index, (MemberEntity) x);
    }
    
    public void delete(int index){
        DataMember.remove(index);
    }
    
    public void get_where(int index){
        DataMember.get(index);
    }
}
