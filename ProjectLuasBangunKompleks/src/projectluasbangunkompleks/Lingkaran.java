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
public class Lingkaran {
    double luasL;
    double hitungLuas(double jejari){
        // menyebutkan type luas
        double luasL;
        // rumus menghitung luas
        luasL = (((3.14*jejari*jejari)/2)*4) ;
        // cetak luas
        System.out.println("Total luas Lingkaran adalah " + luasL + " cm2");
        // mengembalikan nilai hasil luas
        return luasL;
    }
    double hitungLuas2(double jejari){
        // menyebutkan type luas
        double luasL;
        // rumus menghitung luas
        luasL = ((3.14*jejari*jejari)/2) ;
        // cetak luas
        System.out.println("Total luas Lingkaran 2 adalah " + luasL + " cm2");
        // mengembalikan nilai hasil luas
        return luasL;
    }
    
    
}
