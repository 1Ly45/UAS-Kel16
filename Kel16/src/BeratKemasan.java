/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author HP
 */
public class BeratKemasan extends Bahan implements FillingAndTopping {
    //berat kemasan dari bahan
    @Override
    int tepungTerigu() {
        return 1000;
    }

    @Override
    int gulaPasir() {
        return 1000;
    }

    @Override
    int butter() {
        return 500;
    }
    
    @Override
    int ragi() {
        return 11;
    }

    @Override
    int susuBubuk() {
        return 1000;
    }

    @Override
    int susuCair() {
        return 1000;
    }

    @Override
    int telur() {
        return 1000;
    }
    
    @Override
    int esBatu() {
        return 1000;
    }

    //Berat kemasan dari filling dan Topping
    @Override
    public int keju() {
        return 250;
    }

    @Override
    public int coklat() {
        return 500;
    }

    @Override
    public int krimVanila() {
        return 500;
    }

    @Override
    public int redBean() {
        return 500;
    }

    @Override
    public int sosis() {
        return 1000;
    }

    @Override
    public int smokeBeef() {
        return 1000;
    }

    @Override
    public int bawangBombay() {
        return 500;
    }
    
}
