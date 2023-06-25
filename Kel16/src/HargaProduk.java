/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class HargaProduk {
    
    //pemanggilan object
    RotiManis rm = new RotiManis();
    RotiTawar rt = new RotiTawar();
    RotiManis1 rm1 = new RotiManis1();
    RotiManis2 rm2 = new RotiManis2();
    RotiManis3 rm3 = new RotiManis3();
    RotiTawar1 rt1 = new RotiTawar1();
    RotiTawar2 rt2 = new RotiTawar2();
    Pizza p = new Pizza();
    HargaBahan hb = new HargaBahan();
    BeratKemasan bk = new BeratKemasan();
    
    void hargaRM(){
        int tepungTerigu = (rm.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        float gula = (rm.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (rm.butter()  /bk.butter() * hb.butter());
        double ragi = (rm.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (rm.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (rm.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (rm.telur()  /bk.telur() * hb.telur());
        double esBatu = (rm.esBatu()  /bk.esBatu() * hb.esBatu());
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        double harga = (hargaAdonan /(rm.totalBerat() / rm.beratPerPcs())) * 140/100; 
        System.out.println(tepungTerigu);
        System.out.println(gula);
        System.out.println(rm.gulaPasir());
        System.out.println(bk.gulaPasir());
        System.out.println(hb.gulaPasir());
        System.out.println(butter);
        System.out.println(ragi);
        System.out.println(susuBubuk);
        System.out.println(susuCair);
        System.out.println(telur);
        System.out.println(esBatu);
        System.out.println(hargaAdonan);
        System.out.println(harga);
    }
    
    
}
