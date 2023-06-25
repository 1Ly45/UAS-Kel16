/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Pizza extends Roti{
    
    double keju(){
        return 30;
    }
    
    double sosis(){
        return 50;
    }
    
    double smokeBeef(){
        return 50;
    }
    
    double bawangBombay(){
        return 30;
    }

    @Override
    double totalBerat() {
    return 1950;
    }

    @Override
    double beratPerPcs() {
    return 190;
    }

    @Override
    double tepungTerigu() {
    return 1000;
    }

    @Override
    double gulaPasir() {
   return 100;
    }

    @Override
    double butter() {
    return 100;
    }

    @Override
    double ragi() {
    return 20;
    }

    @Override
    double susuBubuk() {
    return 200;
    }

    @Override
    double susuCair() {
    return 180;
    }

    @Override
    double telur() {
    return 50.0;
    }

    @Override
    double esBatu() {
    return 300;
    }
}
