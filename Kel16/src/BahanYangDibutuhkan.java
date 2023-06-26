/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BahanYangDibutuhkan extends HargaProduk {
    //attribut
    int RM1;
    int RM2;
    int RM3;
    int RT1;
    int RT2;
    int P;
   
    
    //method
    //Menghitung Jumlah Kemasan Bahan yang Digunakan
    
    protected double bTepungTerigu(){
        double bahan = (rm.tepungTerigu()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.tepungTerigu()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.tepungTerigu()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.tepungTerigu());
        return kemasan;
    }
    
    protected double bGulaPasir(){
        double bahan = (rm.gulaPasir()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.gulaPasir()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.gulaPasir()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.gulaPasir());
        return kemasan;
    }
    
    protected double bButter(){
        double bahan = (rm.butter()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.butter()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.butter()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.butter());
        return kemasan;
    }
    
    protected double bRagi(){
        double bahan = (rm.ragi()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.ragi()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.ragi()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.ragi());
        return kemasan;
    }
    
    protected double bSusuBubuk(){
        double bahan = (rm.susuBubuk()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.susuBubuk()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.susuBubuk()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.susuBubuk());
        return kemasan;
    }
    
    protected double bSusuCair(){
        double bahan = (rm.susuCair()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.susuCair()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.susuCair()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.susuCair());
        return kemasan;
    }
    
    protected double bTelur(){
        double bahan = (rm.telur()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.telur()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.telur()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.telur());
        return kemasan;
    }
    
    protected double bEsBatu(){
        double bahan = (rm.esBatu()*rm.beratPerPcs()*(this.RM1+this.RM2+this.RM3)/rm.totalBerat())+(rt.esBatu()*rt.beratPerPcs()*(this.RT1+this.RT2)/rt.totalBerat())+(p.esBatu()*p.beratPerPcs()*this.P/p.totalBerat());
        double kemasan = Math.ceil(bahan/bk.esBatu());
        return kemasan;
    }
    
    protected double bKeju(){
        double bahan = (rm1.keju()*this.RM1)+(rm3.keju()*this.RM3)+(rt2.keju()*this.RT2)+(p.keju()*this.P);
        double kemasan = Math.ceil(bahan/bk.keju());
        return kemasan;
    }
    
    protected double bCoklat(){
        double bahan = (rm1.coklat()*this.RM1)+(rt1.coklat()*this.RT1);
        double kemasan = Math.ceil(bahan/bk.coklat());
        return kemasan;
    }
    
    protected double bKrimVanilla(){
        double bahan = (rm2.krimVanilla()*this.RM2);
        double kemasan = Math.ceil(bahan/bk.krimVanila());
        return kemasan;
    }
    
    protected double bSelaiRedBean(){
        double bahan = (rm2.redBean()*this.RM2);
        double kemasan = Math.ceil(bahan/bk.redBean());
        return kemasan;
    }
    
    protected double bSosis(){
        double bahan = (rm3.sosis()*this.RM3)+(p.sosis()*this.P);
        double kemasan = Math.ceil(bahan/bk.sosis());
        return kemasan;
    }
    
    protected double bSmokedBeef(){
        double bahan = (p.smokeBeef()*this.P);
        double kemasan = Math.ceil(bahan/bk.smokeBeef());
        return kemasan;
    }
    
    protected double bBawangBombay(){
        double bahan = (p.bawangBombay()*this.P);
        double kemasan = Math.ceil(bahan/bk.bawangBombay());
        return kemasan;
    }
    
    //Menghitung Total Modal
    double TotalModal(){
        return (this.bCoklat()*hb.coklat()) + (this.bKeju()*hb.keju()) + (this.bEsBatu()*hb.esBatu()) + (this.bTelur()*hb.telur()) + (this.bSusuCair()*hb.susuCair()) + (this.bTepungTerigu()*hb.tepungTerigu()) + (this.bGulaPasir()*hb.gulaPasir()) + (this.bButter()*hb.butter()) + (this.bRagi()*hb.ragi()) + (this.bSusuBubuk()*hb.susuBubuk()) + (this.bKrimVanilla()*hb.krimVanila()) + (this.bSelaiRedBean()*hb.redBean()) + (this.bSosis()*hb.sosis()) + (this.bSmokedBeef()*hb.smokeBeef()) + (this.bBawangBombay()*hb.bawangBombay());
    }
    
        
}