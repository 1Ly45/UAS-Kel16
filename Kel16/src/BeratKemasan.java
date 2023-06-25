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
    double tepungTerigu() {
        return 1000;
    }

    @Override
    double gulaPasir() {
        return 1000;
    }

    @Override
    double butter() {
        return 500;
    }
    
    @Override
    double ragi() {
        return 11;
    }

    @Override
    double susuBubuk() {
        return 1000;
    }

    @Override
    double susuCair() {
        return 1000;
    }

    @Override
    double telur() {
        return 1000;
    }
    
    @Override
    double esBatu() {
        return 1000;
    }

    //Berat kemasan dari filling dan Topping
    @Override
    public double keju() {
        return 250;
    }

    @Override
    public double coklat() {
        return 500;
    }

    @Override
    public double krimVanila() {
        return 500;
    }

    @Override
    public double redBean() {
        return 500;
    }

    @Override
    public double sosis() {
        return 1000;
    }

    @Override
    public double smokeBeef() {
        return 1000;
    }

    @Override
    public double bawangBombay() {
        return 500;
    }
    
}
