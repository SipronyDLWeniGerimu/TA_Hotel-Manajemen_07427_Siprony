/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementhotel;

import Entity.*;
import Model.*;
import Controller.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ManagementHotel {
    public static Scanner in = new Scanner(System.in);
    public static ArrayList<StaffEntity> staffE = new ArrayList<>();
    public static StaffController staff = new StaffController();
    public static KamarController kamar = new KamarController();
    public static MemberController member = new MemberController();
    
    public static StaffEntity reg = new StaffEntity();
    public static int pil;
    
    public static void main(String[] args) {
        
        do{
            System.out.println(" HOTEL BINTANG LIMA ");
            System.out.println("1. Registrasi ");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pil = in.nextInt();
            switch(pil){
                case 1:
                    authRegis();
                    menuHotel();
                    break;
            }
            
        }while(pil != 0);
        System.out.println("Sampai Jumpa");
    }
    
    public static void authRegis(){
        System.out.println("");
        System.out.println("========= REGISTRASI ========= ");
        System.out.print(" ID Staff           : ");
        String id = in.next();
        reg.setId(id);
        System.out.print(" Nama Staff         : ");
        String nama = in.next();
        reg.setNama(nama);
        System.out.print(" Password Staff     : ");
        String pass = in.next();
        reg.setPassword(pass);
        System.out.print(" Alamat Staff       : ");
        String alamat = in.next();
        reg.setAlamat(alamat);
        System.out.print(" NoTelp Staff       : ");
        String noTelp = in.next();
        reg.setNoTelp(noTelp);
        staffE.add(reg);
        
        authLog();
        
    }
    
    public static void authLog(){
            System.out.println("");
            System.out.println("============ LOGIN =========== ");
            System.out.print(" Nama Staff           : ");
            String nama = in.next();
            System.out.print(" Password Staff       : ");
            String pass = in.next();
            if(nama.equals(reg.getNama()) && pass.equals(reg.getPassword())){
                System.out.println("LOGIN BERHASIL !");
                System.out.println("");
                System.out.println("Selamat Datang, " + reg.getNama());
            }
            else {
                System.out.println("LOGIN GAGAL");
                System.out.println("");
            }
            System.out.println("============================== ");
        }
    
    // =================================== MENU HOTEL ===================================
    
    public static void menuHotel(){
        do{
            System.out.println("");
            System.out.println("========= MENU HOTEL ========= ");
            System.out.println("1. Daftar Staff Hotel ");
            System.out.println("2. Daftar Member Hotel ");
            System.out.println("3. Daftar Kamar Hotel ");
            System.out.println("0. Exit ");
            int pil = in.nextInt();
            switch(pil){
                case 1 :
                    daftarStaff();
                    break;
                case 2 :
                    daftarMember();
                    break;
                case 3 :
                    daftarKamar();
                    break;
            }
        }while(pil != 0);
    }
    
    // =================================== MENU MEMBER ==================================
    public static void daftarMember(){
        do{
            System.out.println("");
            System.out.println("******** MENU MEMBER ********* ");
            System.out.println("1. Tambah Member ");
            System.out.println("2. Lihat Member ");
            System.out.println("3. Hapus Member ");
            System.out.println("0. Keluar ");
            System.out.print("Pilih : ");
            int pil = in.nextInt();
            switch(pil){
                case 1 :
                    addMember();
                    break;
                case 2 :
                    viewMember();
                    break;
                case 3 :
                    deleteMember();
                    break;
            }
        }while(pil != 0);
    }
    
    public static void addMember(){
        System.out.println("");
        System.out.println("**** INSERT MEMBER HERE ****** ");
        System.out.print(" ID Member        : ");
        String id = in.next();
        System.out.print(" Nama Member      : ");
        String nama = in.next();
        System.out.print(" Alamat Member    : ");
        String alamat = in.next();
        System.out.print(" NoTelp Member    : ");
        String noTelp = in.next();
        
        member.insert(new MemberEntity(id, nama, alamat, noTelp));
        System.out.println(" Data Member Berhasil Disimpan ! ");
        
    }
    
    public static void viewMember(){
        System.out.println("");
        System.out.println("******** VIEW MEMBER ********* ");
        if(member.memberM.getDataMember().size() > 0){
            int index = 0;
            for(int i = 0; i < member.memberM.getDataMember().size(); i++){
                index++;
                System.out.println("=====================================");
                System.out.println("[Member " + index +"]");
                System.out.println("ID Member       : " + member.memberM.getDataMember().get(i).getId());
                System.out.println("Nama Member     : " + member.memberM.getDataMember().get(i).getNama());
                System.out.println("Alamat Member   : " + member.memberM.getDataMember().get(i).getAlamat());
                System.out.println("NoTelp Member   : " + member.memberM.getDataMember().get(i).getNoTelpMemb());
            }
        } else {
            System.out.println("Data Member Masih Kosong ! ");
        }
    }
    
    public static void deleteMember(){
        System.out.println("");
        System.out.println("******* DELETE MEMBER ******** ");
        if(member.memberM.getDataMember().size() > 0){
            for (int i = 0; i < member.memberM.getDataMember().size(); i++) {
                System.out.println("[" + i + "] " + member.memberM.getDataMember().get(i).getNama());
            }
            System.out.println("------------------------");
            System.out.print("Pilih Index Nama : ");
            int index = in.nextInt();
            
            member.memberM.getDataMember().remove(index);
            System.out.println("Data Member Berhasil Dihapus ! ");
        }else{
            System.out.println("Data Member Tidak Terdaftar ! ");
        }
    }
    
    // =================================== MENU KAMAR ===================================
    public static void daftarKamar(){
        do{
            System.out.println("");
            System.out.println("********* MENU KAMAR ********* ");
            System.out.println("1. Tambah Kamar ");
            System.out.println("2. Lihat Kamar ");
            System.out.println("3. Ubah Kamar ");
            System.out.println("4. Hapus Kamar ");
            System.out.println("0. Keluar ");
            System.out.println("Pilih : ");
            int pil = in.nextInt();
            switch(pil){
                case 1 :
                    addKamar();
                    break;
                case 2 :
                    viewKamar();
                    break;
                case 3 :
                    updateKamar();
                    break;
                case 4 :
                    deleteKamar();
                    break;
            }
        }while(pil != 0);
    }
    
    public static void addKamar(){
        System.out.println("");
        System.out.println("***** INSERT KAMAR HERE ****** ");
        System.out.print("ID Kamar          : ");
        String id = in.next();
        System.out.print("Jenis Kamar       : ");
        String jenis = in.next();
        
        kamar.insert(new KamarEntity(id, jenis));
        System.out.println("Data Kamar Berhasil Disimpan ! ");
    }
    
    public static void viewKamar(){
        System.out.println("");
        System.out.println("********* VIEW KAMAR ********* ");
        if(kamar.kamarM.getDataKamar().size() > 0){
            int index = 0;
            for(int i = 0; i < kamar.kamarM.getDataKamar().size(); i++){
                index++;
                System.out.println("=====================================");
                System.out.println("[Kamar " + index +"]");
                System.out.println("ID Kamar : " + kamar.kamarM.getDataKamar().get(i).getIdKamar());
                System.out.println("Jenis Kamar : " + kamar.kamarM.getDataKamar().get(i).getJenis());
            }
        } else {
            System.out.println("Data Kamar Masih Kosong ! ");
        }
    }
    
    public static void updateKamar(){
        System.out.println("");
        System.out.println("******** UPDATE KAMAR ******** ");
        if(kamar.kamarM.getDataKamar().size() > 0){
            for(int i = 0; i < kamar.kamarM.getDataKamar().size(); i++){
                System.out.println("");
                System.out.println("[" + i + "]" + kamar.kamarM.getDataKamar().get(i).getJenis());
            }
            System.out.println("------------------------");
            System.out.print(" Pilih Index Kamar : ");
            int index = in.nextInt();
            System.out.print(" Input ID Kamar       : ");
            String id = in.next();
            System.out.print(" Input Jenis Kamar    : ");
            String jenis = in.next();
            kamar.update(index, new KamarEntity(id, jenis));
            System.out.println(" Data Kamar Berhasil Diubah ! ");
        }
        else {
            System.out.println(" Data Kamar Tidak Terdaftar ! ");
        }
    }
    
    public static void deleteKamar(){
        System.out.println("");
        System.out.println("******** DELETE KAMAR ******** ");
        if(kamar.kamarM.getDataKamar().size()>0){
            for (int i = 0; i < kamar.kamarM.getDataKamar().size(); i++) {
                System.out.println("["+ i +"] " + kamar.kamarM.getDataKamar().get(i).getJenis());
            }
            System.out.println("------------------------");
            System.out.print("Pilih Index Kamar : ");
            int index = in.nextInt();
            
            kamar.kamarM.getDataKamar().remove(index);
            System.out.println("Data Kamar Berhasil Dihapus ! ");
        }else{
            System.out.println("Data Kamar Tidak Terdaftar ! ");
        }
    }
    
    // =================================== MENU STAFF ===================================
    public static void daftarStaff(){
        do{
            System.out.println("");
            System.out.println("********* MENU STAFF ********* ");
            System.out.println("1. Tambah Staff ");
            System.out.println("2. Lihat Staff ");
            System.out.println("3. Ubah Staff ");
            System.out.println("4. Hapus Staff ");
            System.out.println("0. Keluar ");
            System.out.println("Pilih : ");
            int pil = in.nextInt();
            switch(pil){
                case 1 :
                    addStaff();
                    break;
                case 2 :
                    viewStaff();
                    break;
                case 3 :
                    updateStaff();
                    break;
                case 4 :
                    deleteStaff();
                    break;
            }
        }while(pil != 0);
    }
    
    public static void addStaff(){
        System.out.println("");
        System.out.println("***** INSERT STAFF HERE ****** ");
        System.out.print("ID Staff          : ");
        String id = in.next();
        System.out.print("Nama Staff        : ");
        String nama = in.next();
        System.out.print("Password Staff    : ");
        String pass = in.next();
        System.out.print("Alamat Staff      : ");
        String alamat = in.next();
        System.out.print("NoTelp Staff      : ");
        String noTelp = in.next();
        
        staff.insert(new StaffEntity(id, nama, pass, alamat, noTelp));
        System.out.println("Data Kamar Berhasil Disimpan ! ");
    }
    
    public static void viewStaff(){
        System.out.println("");
        System.out.println("********* VIEW STAFF ********* ");
        if(staff.staffM.getDataStaff().size() > 0){
            int index = 0;
            for(int i = 0; i < staff.staffM.getDataStaff().size(); i++){
                index++;
                System.out.println("=====================================");
                System.out.println("[Staff " + index +"]");
                System.out.println("ID Staff        : " + staff.staffM.getDataStaff().get(i).getId());
                System.out.println("Nama Staff      : " + staff.staffM.getDataStaff().get(i).getNama());
                System.out.println("Password Staff  : " + staff.staffM.getDataStaff().get(i).getPassword());
                System.out.println("Alamat Staff    : " + staff.staffM.getDataStaff().get(i).getAlamat());
                System.out.println("NoTelp Staff    : " + staff.staffM.getDataStaff().get(i).getNoTelp());
            }
        } else {
            System.out.println("Data Kamar Masih Kosong ! ");
        }
    }
    
    public static void updateStaff(){
        System.out.println("");
        System.out.println("******** UPDATE STAFF ******** ");
        if(staff.staffM.getDataStaff().size() > 0){
            for(int i = 0; i < staff.staffM.getDataStaff().size(); i++){
                System.out.println("");
                System.out.println("[" + i + "]" + staff.staffM.getDataStaff().get(i).getNama());
            }
            System.out.println("------------------------");
            System.out.print(" Pilih Index Staff : ");
            int index = in.nextInt();
            
            System.out.print(" Input ID Staff       : ");
            String id = in.next();
            System.out.print(" Input Nama Staff     : ");
            String nama = in.next();
            System.out.print(" Input Password Staff : ");
            String pass = in.next();
            System.out.print(" Input Alamat Staff   : ");
            String alamat = in.next();
            System.out.print("Input NoTelp Staff    : ");
            String noTelp = in.next();

            staff.update(index, new StaffEntity(id, nama, pass, alamat, noTelp));
            System.out.println(" Data Staff Berhasil Diubah ! ");
        }
        else {
            System.out.println(" Data Staff Tidak Terdaftar ! ");
        }
    }
    
    public static void deleteStaff(){
        System.out.println("");
        System.out.println("******** DELETE STAFF ******** ");
        if(staff.staffM.getDataStaff().size()>0){
            for (int i = 0; i < staff.staffM.getDataStaff().size(); i++) {
                System.out.println("["+ i +"] " + staff.staffM.getDataStaff().get(i).getNama());
            }
            System.out.println("------------------------");
            System.out.print("Pilih Index Staff : ");
            int index = in.nextInt();
            
            staff.staffM.getDataStaff().remove(index);
            System.out.println("Data Staff Berhasil Dihapus ! ");
        }else{
            System.out.println("Data Staff Tidak Terdaftar ! ");
        }
    }
}
