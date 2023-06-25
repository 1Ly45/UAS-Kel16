/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BahanYangDibutuhkan {
    //attribut
    int RM1;
    int RM2;
    int RM3;
    int RT1;
    int RT2;
    int P;
   
    //object
    RotiManis rm = new RotiManis();
    RotiTawar rt = new RotiTawar();
    Pizza p = new Pizza();
    RotiManis1 rm1 = new RotiManis1();
    RotiManis2 rm2 = new RotiManis2();
    RotiManis3 rm3 = new RotiManis3();
    RotiTawar1 rt1 = new RotiTawar1();
    RotiTawar2 rt2 = new RotiTawar2();
    HargaBahan hb = new HargaBahan();
    BeratKemasan bk = new BeratKemasan();
    
    //method
    //Menghitung Jumlah Kemasan Bahan yang Digunakan
    
    private double bTepungTerigu(){
        double bahan = (rm.tepungTerigu()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.tepungTerigu()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.tepungTerigu()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.tepungTerigu());
        return kemasan;
    }
    
    private double bGulaPasir(){
        double bahan = (rm.gulaPasir()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.gulaPasir()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.gulaPasir()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.gulaPasir());
        return kemasan;
    }
    
    private double bButter(){
        double bahan = (rm.butter()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.butter()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.butter()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.butter());
        return kemasan;
    }
    
    private double bRagi(){
        double bahan = (rm.ragi()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.ragi()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.ragi()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.ragi());
        return kemasan;
    }
    
    private double bSusuBubuk(){
        double bahan = (rm.susuBubuk()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.susuBubuk()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.susuBubuk()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.susuBubuk());
        return kemasan;
    }
    
    private double bSusuCair(){
        double bahan = (rm.susuCair()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.susuCair()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.susuCair()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.susuCair());
        return kemasan;
    }
    
    private double bTelur(){
        double bahan = (rm.telur()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.telur()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.telur()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.telur());
        return kemasan;
    }
    
    private double bEsBatu(){
        double bahan = (rm.esBatu()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.esBatu()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.esBatu()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.esBatu());
        return kemasan;
    }
    
    private double bKeju(){
        double bahan = (rm1.keju()*this.RM1)+(rm3.keju()*this.RM3)+(rt2.keju()*this.RT2)+(p.keju()*this.P);
        double kemasan = Math.ceil(bahan/bk.keju());
        return kemasan;
    }
    
    private double bCoklat(){
        double bahan = (rm1.coklat()*this.RM1)+(rt1.coklat()*this.RT1);
        double kemasan = Math.ceil(bahan/bk.coklat());
        return kemasan;
    }
    
    private double bKrimVanilla(){
        double bahan = (rm2.krimVanilla()*this.RM2);
        double kemasan = Math.ceil(bahan/bk.krimVanila());
        return kemasan;
    }
    
    private double bSelaiRedBean(){
        double bahan = (rm2.redBean()*this.RM2);
        double kemasan = Math.ceil(bahan/bk.redBean());
        return kemasan;
    }
    
    private double bSosis(){
        double bahan = (rm3.sosis()*this.RM3)+(p.sosis()*this.P);
        double kemasan = Math.ceil(bahan/bk.sosis());
        return kemasan;
    }
    
    private double bSmokedBeef(){
        double bahan = (p.smokeBeef()*this.P);
        double kemasan = Math.ceil(bahan/bk.smokeBeef());
        return kemasan;
    }
    
    private double bBawangBombay(){
        double bahan = (p.bawangBombay()*this.P);
        double kemasan = Math.ceil(bahan/bk.bawangBombay());
        return kemasan;
    }
    
    //Menghitung Total Modal
    double TotalModal(){
        return (this.bCoklat()*hb.coklat()) + (this.bKeju()*hb.keju()) + (this.bEsBatu()*hb.esBatu()) + (this.bTelur()*hb.telur()) + (this.bSusuCair()*hb.susuCair()) + (this.bTepungTerigu()*hb.tepungTerigu()) + (this.bGulaPasir()*hb.gulaPasir()) + (this.bButter()*hb.butter()) + (this.bRagi()*hb.ragi()) + (this.bSusuBubuk()*hb.susuBubuk()) + (this.bKrimVanilla()*hb.krimVanila()) + (this.bSelaiRedBean()*hb.redBean()) + (this.bSosis()*hb.sosis()) + (this.bSmokedBeef()*hb.smokeBeef()) + (this.bBawangBombay()*hb.bawangBombay());
    }
    
    //Output Jumlah Kemasan Bahan yang Dibutuhkan
    void print(){
        System.out.println("TOTAL BAHAN YANG DIBUTUHKAN (Jumlah Kemasan)");
        System.out.println("============================================");
        System.out.println("Tepung Terigu   : " + this.bTepungTerigu());
        System.out.println("Gula Pasir      : " + this.bGulaPasir());
        System.out.println("Butter          : " + this.bButter());
        System.out.println("Ragi            : " + this.bRagi());
        System.out.println("Susu Bubuk      : " + this.bSusuBubuk());
        System.out.println("Susu Cair       : " + this.bSusuCair());
        System.out.println("Telur           : " + this.bTelur());
        System.out.println("Es Batu         : " + this.bEsBatu());
        System.out.println("Keju            : " + this.bKeju());
        System.out.println("Coklat          : " + this.bCoklat());
        System.out.println("Krim Vanilla    : " + this.bKrimVanilla());
        System.out.println("Selai Red Bean  : " + this.bSelaiRedBean());
        System.out.println("Sosis           : " + this.bSosis());
        System.out.println("Smoked Beef     : " + this.bSmokedBeef());
        System.out.println("Bawang Bombay   : " + this.bBawangBombay());
        System.out.println("Total Modal     : " + this.TotalModal());
        
    }
    
}