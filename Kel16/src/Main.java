/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        //pembuatan object
       ShowData sd = new ShowData();
       
       //memasukan data
       sd.RM1 = 50;
       sd.RM1 = 50;
       sd.RM2 = 100;
       sd.RM3 = 70;
       sd.RT1 = 20;
       sd.RT2 = 15;
       sd.P = 10;
       
       //menunjukan harga per pcs, bahan yang dibutuhkan (kemasan), modal, dan keuntungan
       sd.showHarga();
       System.out.println("");
       sd.showBahan();
       System.out.println("");
       sd.showTotalHarga();
       sd.showUntung();
    }
}
