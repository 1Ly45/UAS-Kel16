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
    double tepungTerigu() {
        return 40000;
    }

    @Override
    double gulaPasir() {
        return 25000;
    }

    @Override
    double butter() {
        return 23000;
    }

    @Override
    double ragi() {
        return 5000;
    }

    @Override
    double susuBubuk() {
        return 39000;
    }

    @Override
    double susuCair() {
        return 24000;
    }

    @Override
    double telur() {
        return 23000;
    }

    @Override
    double esBatu() {
        return 2000;
    }
    
    
    //Harga filling dan topping
    @Override
    public double keju() {
        return 31000;
    }

    @Override
    public double coklat() {
        return 29000;
    }

    @Override
    public double krimVanila() {
        return 30000;
    }

    @Override
    public double redBean() {
        return 25000;
    }

    @Override
    public double sosis() {
        return 80000;
    }

    @Override
    public double smokeBeef() {
        return 90000;
    }

    @Override
    public double bawangBombay() {
        return 40000;
    }
    
    
}
