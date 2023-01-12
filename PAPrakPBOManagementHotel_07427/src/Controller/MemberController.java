/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.MemberEntity;
import Model.MemberModel;
import java.util.ArrayList;

public class MemberController {
    public MemberModel memberM = new MemberModel();
    
    public MemberController(){
        
    }
    
    public ArrayList<MemberEntity> view(){
        return memberM.getDataMember();
    }
    
    public void insert(MemberEntity member){
        memberM.insert(member);
    }
    
    public void delete(int index){
        memberM.delete(index);
    }
    
    public int cekMember(String idMember){
        int ket = -1;
        if(memberM.getDataMember().size() > 0){
            for(int i = 0; i < memberM.getDataMember().size(); i++){
                if(idMember.equals(memberM.getDataMember().get(i).getId())){
                    ket = i;
                    break;
                } else {
                    ket = -1;
                }
            }
        }
        return ket;
    }
    
    public MemberEntity showDaftarMember(int index){
        return memberM.getDataMember().get(index);
    }
    
}
