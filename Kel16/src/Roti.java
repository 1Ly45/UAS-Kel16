/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public abstract class Roti {
    //attribute jumlah produk
    int jumlah;
    
    
    //abstract method untuk bahan bahan roti
    //menggunakan protected agar data tidak dapat diubah diluar inheritance
    protected abstract int tepungTerigu();
    protected abstract int gulaPasir();
    protected abstract int butter();
    protected abstract int ragi();
    protected abstract int susuBubuk();
    protected abstract int susuCair();
    protected abstract int telur();
    protected abstract int esBatu();
    protected abstract int totalBerat();
    
    
    //method untuk mengambil nilai dari bahan(berat dari)
    int getTepungTerigu(){
        return this.tepungTerigu();
    }
    int getGulaPasir(){
        return this.gulaPasir();
    }
    int getButter(){
        return this.butter();
    }
    int getRagi(){
        return this.ragi();
    }
    int getSusuBubuk(){
        return this.susuBubuk();
    }
    int getSusuCair(){
        return this.susuCair();
    }
    int getTelur(){
        return this.telur();
    }
    int getEsBatu(){
        return this.esBatu();
    }
    int getTotalBerat(){
        return this.totalBerat();
    }
}

