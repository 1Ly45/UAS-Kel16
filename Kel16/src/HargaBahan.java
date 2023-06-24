/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *s
 * @author HP
 */
public class HargaBahan extends Bahan implements FillingAndTopping{
    //Harga Bahan
    
    @Override
    int tepungTerigu() {
        return 40000;
    }

    @Override
    int gulaPasir() {
        return 25000;
    }

    @Override
    int butter() {
        return 23000;
    }

    @Override
    int ragi() {
        return 5000;
    }

    @Override
    int susuBubuk() {
        return 39000;
    }

    @Override
    int susuCair() {
        return 24000;
    }

    @Override
    int telur() {
        return 23000;
    }

    @Override
    int esBatu() {
        return 2000;
    }
    
    
    //Harga filling dan topping
    @Override
    public int keju() {
        return 31000;
    }

    @Override
    public int coklat() {
        return 29000;
    }

    @Override
    public int krimVanila() {
        return 30000;
    }

    @Override
    public int redBean() {
        return 25000;
    }

    @Override
    public int sosis() {
        return 80000;
    }

    @Override
    public int smokeBeef() {
        return 90000;
    }

    @Override
    public int bawangBombay() {
        return 40000;
    }
    
    
}
