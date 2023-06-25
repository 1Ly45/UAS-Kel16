/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Pizza extends Roti{
    
    int keju(){
        return 30;
    }
    
    int sosis(){
        return 50;
    }
    
    int smokeBeef(){
        return 50;
    }
    
    int bawangBombay(){
        return 30;
    }

    @Override
    int totalBerat() {
    return 1950;
    }

    @Override
    int beratPerPcs() {
    return 190;
    }

    @Override
    int tepungTerigu() {
    return 1000;
    }

    @Override
    int gulaPasir() {
   return 100;
    }

    @Override
    int butter() {
    return 100;
    }

    @Override
    int ragi() {
    return 20;
    }

    @Override
    int susuBubuk() {
    return 200;
    }

    @Override
    int susuCair() {
    return 180;
    }

    @Override
    int telur() {
    return 50;
    }

    @Override
    int esBatu() {
    return 300;
    }
}
