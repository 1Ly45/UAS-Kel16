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
    
    //method
    //Menghitung Jumlah Kemasan Bahan yang Digunakan
    
    private double bTepungTerigu(){
        double bahan = (1000*50*(this.RM1+this.RM2+this.RM3)/2350)+(1000*400*(this.RT1+this.RT2)/2065)+(1000*190*this.P/1950);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bGulaPasir(){
        double bahan = (150*50*(this.RM1+this.RM2+this.RM3)/2350)+(125*400*(this.RT1+this.RT2)/2065)+(100*190*this.P/1950);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bButter(){
        double bahan = (150*50*(this.RM1+this.RM2+this.RM3)/2350)+(100*400*(this.RT1+this.RT2)/2065)+(100*190*this.P/1950);
        double kemasan = Math.ceil(bahan/500);
        return kemasan;
    }
    
    private double bRagi(){
        double bahan = (20*50*(this.RM1+this.RM2+this.RM3)/2350)+(20*400*(this.RT1+this.RT2)/2065)+(20*190*this.P/1950);
        double kemasan = Math.ceil(bahan/11);
        return kemasan;
    }
    
    private double bSusuBubuk(){
        double bahan = (300*50*(this.RM1+this.RM2+this.RM3)/2350)+(250*400*(this.RT1+this.RT2)/2065)+(200*190*this.P/1950);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bSusuCair(){
        double bahan = (250*50*(this.RM1+this.RM2+this.RM3)/2350)+(200*400*(this.RT1+this.RT2)/2065)+(180*190*this.P/1950);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bTelur(){
        double bahan = (80*50*(this.RM1+this.RM2+this.RM3)/2350)+(70*400*(this.RT1+this.RT2)/2065)+(50*190*this.P/1950);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bEsBatu(){
        double bahan = (400*50*(this.RM1+this.RM2+this.RM3)/2350)+(300*400*(this.RT1+this.RT2)/2065)+(300*190*this.P/1950);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bKeju(){
        double bahan = (5*this.RM1)+(10*this.RM3)+(80*this.RT2)+(30*this.P);
        double kemasan = Math.ceil(bahan/250);
        return kemasan;
    }
    
    private double bCoklat(){
        double bahan = (10*this.RM1)+(80*this.RT1);
        double kemasan = Math.ceil(bahan/500);
        return kemasan;
    }
    
    private double bKrimVanilla(){
        double bahan = (5*this.RM2);
        double kemasan = Math.ceil(bahan/500);
        return kemasan;
    }
    
    private double bSelaiRedBean(){
        double bahan = (10*this.RM2);
        double kemasan = Math.ceil(bahan/500);
        return kemasan;
    }
    
    private double bSosis(){
        double bahan = (10*this.RM3)+(50*this.P);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bSmokedBeef(){
        double bahan = (50*this.P);
        double kemasan = Math.ceil(bahan/1000);
        return kemasan;
    }
    
    private double bBawangBombay(){
        double bahan = (30*this.P);
        double kemasan = Math.ceil(bahan/500);
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
        return (this.bCoklat()*29000) + (this.bKeju()*31000) + (this.bEsBatu()*2000) + (this.bTelur()*23000) + (this.bSusuCair()*24000) + (this.bTepungTerigu()*40000) + (this.bGulaPasir()*25000) + (this.bButter()*23000) + (this.bRagi()*5000) + (this.bSusuBubuk()*39000) + (this.bKrimVanilla()*30000) + (this.bSelaiRedBean()*25000) + (this.bSosis()*80000) + (this.bSmokedBeef()*90000) + (this.bBawangBombay()*40000);
    }
    
}

