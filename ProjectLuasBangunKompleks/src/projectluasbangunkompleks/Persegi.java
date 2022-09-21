/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author lenovo
 */
public class Persegi {
    double hitungLuas(double sisi){
        // menyebutkan type luas
        double luasP;
        // rumus menghitung luas
        luasP = sisi*sisi;
        // mencetak luas
        System.out.println("Total luas Persegi adalah " + luasP + " cm2");
        // mengembalikan nilai luas
        return luasP;
    }
   
}
