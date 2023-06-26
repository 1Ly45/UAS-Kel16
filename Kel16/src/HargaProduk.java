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
    
    
    //menghitung harga dari adonan roti manis 
    protected double hargaRM(){
        
        //mengitung harga bahan per adoanan
        double tepungTerigu = (rm.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        double gula = (rm.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (rm.butter()  /bk.butter() * hb.butter());
        double ragi = (rm.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (rm.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (rm.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (rm.telur()  /bk.telur() * hb.telur());
        double esBatu = (rm.esBatu()  /bk.esBatu() * hb.esBatu());
        
        //menghitung total harga bahan
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        
        //menghitung harga adonan perpcs
        double harga = (hargaAdonan /(rm.totalBerat() / rm.beratPerPcs())); 
        return harga;
    }
    //menghitung harga dari adonan roti tawar
    protected double hargaRT(){
        
        //mengitung harga bahan per adoanan
        double tepungTerigu = (rt.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        double gula = (rt.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (rt.butter()  /bk.butter() * hb.butter());
        double ragi = (rt.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (rt.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (rt.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (rt.telur()  /bk.telur() * hb.telur());
        double esBatu = (rt.esBatu()  /bk.esBatu() * hb.esBatu());
        
        //menghitung total harga bahan
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        
        //menghitung harga adonan perpcs
        double harga = (hargaAdonan /(rt.totalBerat() / rt.beratPerPcs())); 
        return harga;
    }
    
    //menghitung harga dari pizza
    protected double hargaP(){
        
        //mengitung harga bahan per adoanan
        double tepungTerigu = (p.tepungTerigu()  /bk.tepungTerigu() * hb.tepungTerigu());
        double gula = (p.gulaPasir()  / bk.gulaPasir() * hb.gulaPasir());
        double butter = (p.butter()  /bk.butter() * hb.butter());
        double ragi = (p.ragi()  /bk.ragi() * hb.ragi());
        double susuBubuk = (p.susuBubuk()  /bk.susuBubuk() * hb.susuBubuk());
        double susuCair = (p.susuCair()  /bk.susuCair() * hb.susuCair());
        double telur = (p.telur()  /bk.telur() * hb.telur());
        double esBatu = (p.esBatu()  /bk.esBatu() * hb.esBatu());
        
        //menghitung harga filling  dan topping per roti
        double keju = (p.keju()  /bk.keju() * hb.keju());
        double sosis = (p.sosis()  /bk.sosis() * hb.sosis());
        double smokeBeef = (p.smokeBeef()  /bk.smokeBeef() * hb.smokeBeef());
        double bawangBombay = (p.bawangBombay()  /bk.bawangBombay() * hb.bawangBombay());
        
        //menghitung total harga bahan
        double hargaAdonan = tepungTerigu + gula + butter + ragi + susuBubuk + susuCair + telur + esBatu;
        double hargaAdonanPerPcs = (hargaAdonan /(rt.totalBerat() / rt.beratPerPcs())); 
        
        //menghitung  total harga filling dan topping
        double hargaTopping = keju + sosis + smokeBeef + bawangBombay;
        
        //menghitung harga roti per pcs
        double harga = ((hargaAdonan + hargaTopping)) * 140/100; 
        return Math.ceil (harga);
    }
    protected double hargaRM1(){
        
       //menghitung harga filling  dan topping per roti
       double keju = (rm1.keju()  /bk.keju() * hb.keju());
       double coklat = (rm1.coklat()  /bk.coklat() * hb.coklat());
       
       //menghitung  total harga filling dan topping
       double hargaTopping = keju + coklat;
       
       //menghitung harga roti per pcs
       double harga = hargaRM() + hargaTopping;
       return Math.ceil(harga);
       
    }
    protected double hargaRM2(){
        
        //menghitung harga filling  dan topping per roti
       double redBean = (rm2.redBean()  /bk.redBean() * hb.redBean());
       double krimVanila = (rm2.krimVanilla()  /bk.krimVanila() * hb.krimVanila());
       
       //menghitung  total harga filling dan topping
       double hargaTopping = redBean + krimVanila;
       
       //menghitung harga roti per pcs
       double harga = (hargaRM() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    protected double hargaRM3(){
        
        //menghitung harga filling  dan topping per roti
       double keju = (rm3.keju()  /bk.keju() * hb.keju());
       double sosis = (rm3.sosis()  /bk.sosis() * hb.sosis());
       
       //menghitung  total harga filling dan topping
       double hargaTopping = keju + sosis;
       
       //menghitung harga roti per pcs
       double harga = (hargaRM() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    
    protected double hargaRT1(){
        
        //menghitung harga filling  dan topping per roti
       double coklat = (rt1.coklat()  /bk.coklat() * hb.coklat());
       
       //menghitung  total harga filling dan topping
       double hargaTopping = coklat;
       
       //menghitung harga roti per pcs
       double harga = (hargaRT() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
    protected double hargaRT2(){
        
        //menghitung harga filling  dan topping per roti
       double keju = (rt2.keju()  /bk.keju() * hb.keju());
       
       //menghitung  total harga filling dan topping
       double hargaTopping = keju;
       
       //menghitung harga roti per pcs
       double harga = (hargaRT() + hargaTopping) * 140/100; 
       return Math.ceil (harga);
    }
 
    
    
    
    
    
}
