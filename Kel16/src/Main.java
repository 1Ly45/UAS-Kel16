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
        HargaProduk hp = new HargaProduk();
        BahanYangDibutuhkan byd = new BahanYangDibutuhkan();
        System.out.println("Bahan Yang Dibutuhkan: ");
        byd.print();
        System.out.println("");
        System.out.println("Harga Roti PerPcs");
        hp.showHarga();
    }
}
