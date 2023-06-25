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
    RotiManis rm1 = new RotiManis();
    RotiTawar rt1 = new RotiTawar();
    RotiManis1 a = new RotiManis1();
    RotiManis2 b = new RotiManis2();
    RotiManis3 c = new RotiManis3();
    RotiTawar1 d = new RotiTawar1();
    RotiTawar2 e = new RotiTawar2();
    Pizza f = new Pizza();
    HargaBahan hb = new HargaBahan();
    BeratKemasan bk = new BeratKemasan();
    
    //method
    //Menghitung Jumlah Kemasan Bahan yang Digunakan
    
    private double bTepungTerigu(){
        double bahan = (rm1.tepungTerigu()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.tepungTerigu()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.tepungTerigu()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.tepungTerigu());
        return kemasan;
    }
    
    private double bGulaPasir(){
        double bahan = (rm1.gulaPasir()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.gulaPasir()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.gulaPasir()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.gulaPasir());
        return kemasan;
    }
    
    private double bButter(){
        double bahan = (rm1.butter()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.butter()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.butter()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.butter());
        return kemasan;
    }
    
    private double bRagi(){
        double bahan = (rm1.ragi()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.ragi()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.ragi()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.ragi());
        return kemasan;
    }
    
    private double bSusuBubuk(){
        double bahan = (rm1.susuBubuk()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.susuBubuk()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.susuBubuk()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.susuBubuk());
        return kemasan;
    }
    
    private double bSusuCair(){
        double bahan = (rm1.susuCair()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.susuCair()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.susuCair()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.susuCair());
        return kemasan;
    }
    
    private double bTelur(){
        double bahan = (rm1.telur()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.telur()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.telur()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.telur());
        return kemasan;
    }
    
    private double bEsBatu(){
        double bahan = (rm1.esBatu()*rm1.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm1.totalBerat())+(rt1.esBatu()*rt1.beratPerPcs()*(this.RT1+this.RT2)/rt1.totalBerat())+(f.esBatu()*f.beratPerPcs()*this.P/f.totalBerat());
        double kemasan = Math.ceil(bahan/bk.esBatu());
        return kemasan;
    }
    
    private double bKeju(){
        double bahan = (a.keju()*this.RM1)+(c.keju()*this.RM3)+(e.keju()*this.RT2)+(f.keju()*this.P);
        double kemasan = Math.ceil(bahan/bk.keju());
        return kemasan;
    }
    
    private double bCoklat(){
        double bahan = (a.coklat()*this.RM1)+(d.coklat()*this.RT1);
        double kemasan = Math.ceil(bahan/bk.coklat());
        return kemasan;
    }
    
    private double bKrimVanilla(){
        double bahan = (b.krimVanilla()*this.RM2);
        double kemasan = Math.ceil(bahan/bk.krimVanila());
        return kemasan;
    }
    
    private double bSelaiRedBean(){
        double bahan = (b.redBean()*this.RM2);
        double kemasan = Math.ceil(bahan/bk.redBean());
        return kemasan;
    }
    
    private double bSosis(){
        double bahan = (c.sosis()*this.RM3)+(f.sosis()*this.P);
        double kemasan = Math.ceil(bahan/bk.sosis());
        return kemasan;
    }
    
    private double bSmokedBeef(){
        double bahan = (f.smokeBeef()*this.P);
        double kemasan = Math.ceil(bahan/bk.smokeBeef());
        return kemasan;
    }
    
    private double bBawangBombay(){
        double bahan = (f.bawangBombay()*this.P);
        double kemasan = Math.ceil(bahan/bk.bawangBombay());
        return kemasan;
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
        
    }
    
    //Menghitung Total Modal
    double TotalModal(){
        return (this.bCoklat()*hb.coklat()) + (this.bKeju()*hb.keju()) + (this.bEsBatu()*hb.esBatu()) + (this.bTelur()*hb.telur()) + (this.bSusuCair()*hb.susuCair()) + (this.bTepungTerigu()*hb.tepungTerigu()) + (this.bGulaPasir()*hb.gulaPasir()) + (this.bButter()*hb.butter()) + (this.bRagi()*hb.ragi()) + (this.bSusuBubuk()*hb.susuBubuk()) + (this.bKrimVanilla()*hb.krimVanila()) + (this.bSelaiRedBean()*hb.redBean()) + (this.bSosis()*hb.sosis()) + (this.bSmokedBeef()*hb.smokeBeef()) + (this.bBawangBombay()*hb.bawangBombay());
    }
    
}

