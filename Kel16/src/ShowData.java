/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ShowData extends BahanYangDibutuhkan{
    //menampilkan harga perpcs roti
    public void showHarga(){
        System.out.println("HARGA ROTI PER PCS");
        System.out.println("===================");
        System.out.println("Harga Roti Manis Varian 1: " + hargaRM1() );
        System.out.println("Harga Roti Manis Varian 2: " + hargaRM2() );
        System.out.println("Harga Roti Manis Varian 3: " + hargaRM3() );
        System.out.println("Harga Roti Tawar Varian 1: " + hargaRT1() );
        System.out.println("Harga Roti Tawar Varian 2: " + hargaRT2() );
        System.out.println("Harga Pizza: " + hargaP());
    }
    
    //Output Jumlah Kemasan Bahan yang Dibutuhkan
    void showBahan(){
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
    //total harga dari orderan
    double totalHarga(){
        double harga = (this.RM1 * this.hargaRM1()) + (this.RM2 * this.hargaRM2()) + (this.RM3 + this.hargaRM3()) + (this.RT1 * this.hargaRT1()) + (this.RT2 * this.hargaRT2()) + (this.P * this.hargaP());
        return harga;
    }
    
    //menunjukan total harga dari orderan
    void showTotalHarga(){
        System.out.println("Total Harga dari Orderan: " + totalHarga());
    }
    
    //menunjukan keuntungan penjual
    void showUntung(){
        double untung = this.totalHarga() - this.TotalModal();
        double persen = (untung/this.TotalModal()) * 100;
        System.out.println("Total Keuntungan: " + untung);
        System.out.println("Persentase Keuntungan: " + persen + "%");
        
    }
    
}
