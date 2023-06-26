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
    
    private double hargaRM(){
        double tepungTerigu = (rm.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        double gula = (rm.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (rm.butter()  /bk.butter() * hb.butter());
        double ragi = (rm.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (rm.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (rm.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (rm.telur()  /bk.telur() * hb.telur());
        double esBatu = (rm.esBatu()  /bk.esBatu() * hb.esBatu());
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        double harga = (hargaAdonan /(rm.totalBerat() / rm.beratPerPcs())); 
        return harga;
    }
    private double hargaRT(){
        double tepungTerigu = (rt.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        double gula = (rt.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (rt.butter()  /bk.butter() * hb.butter());
        double ragi = (rt.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (rt.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (rt.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (rt.telur()  /bk.telur() * hb.telur());
        double esBatu = (rt.esBatu()  /bk.esBatu() * hb.esBatu());
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        double harga = (hargaAdonan /(rt.totalBerat() / rt.beratPerPcs())); 
        return harga;
    }
    private double hargaP(){
        double tepungTerigu = (p.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        double gula = (p.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (p.butter()  /bk.butter() * hb.butter());
        double ragi = (p.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (p.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (p.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (p.telur()  /bk.telur() * hb.telur());
        double esBatu = (p.esBatu()  /bk.esBatu() * hb.esBatu());
        double keju = (p.keju()  /bk.keju() * hb.keju());
        double sosis = (p.sosis()  /bk.sosis() * hb.sosis());
        double smokeBeef = (p.smokeBeef()  /bk.smokeBeef() * hb.smokeBeef());
        double bawangBombay = (p.bawangBombay()  /bk.bawangBombay() * hb.bawangBombay());
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        double hargaAdonanPerPcs = (hargaAdonan /(rt.totalBerat() / rt.beratPerPcs())); 
        double hargaTopping = keju + sosis + smokeBeef + bawangBombay;
        double harga = ((hargaAdonan + hargaTopping)) * 140/100; 
        return Math.ceil (harga);
    }
    private double hargaRM1(){
       double keju = (rm1.keju()  /bk.keju() * hb.keju());
       double coklat = (rm1.coklat()  /bk.coklat() * hb.coklat());
       double hargaTopping = keju + coklat;
       double harga = hargaRM() + hargaTopping;
       return Math.ceil(harga);
       
    }
    private double hargaRM2(){
       double redBean = (rm2.redBean()  /bk.redBean() * hb.redBean());
       double krimVanila = (rm2.krimVanilla()  /bk.krimVanila() * hb.krimVanila());
       double hargaTopping = redBean + krimVanila;
       double harga = (hargaRM() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    private double hargaRM3(){
       double keju = (rm3.keju()  /bk.keju() * hb.keju());
       double sosis = (rm3.sosis()  /bk.sosis() * hb.sosis());
       double hargaTopping = keju + sosis;
       double harga = (hargaRM() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    
    private double hargaRT1(){
       double coklat = (rt1.coklat()  /bk.coklat() * hb.coklat());
       double hargaTopping = coklat;
       double harga = (hargaRT() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    private double hargaRT2(){
       double keju = (rt2.keju()  /bk.keju() * hb.keju());
       double hargaTopping = keju;
       double harga = (hargaRT() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    
    void showHarga(){
        System.out.println("Harga Roti Manis Varian 1: " + hargaRM1() );
        System.out.println("Harga Roti Manis Varian 2: " + hargaRM2() );
        System.out.println("Harga Roti Manis Varian 3: " + hargaRM3() );
        System.out.println("Harga Roti Tawar Varian 1: " + hargaRT1() );
        System.out.println("Harga Roti Tawar Varian 2: " + hargaRT2() );
        System.out.println("Harga Pizza: " + hargaP() );
    }
    
    
}
