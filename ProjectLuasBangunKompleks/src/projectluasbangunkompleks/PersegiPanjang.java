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
public class PersegiPanjang {
    int hitungLuas(int panjang, int lebar){
        // menyebutkan type luas
        int luasPP;
        
        // rumus menghitung luas
        luasPP = panjang*lebar;
        
        // mencetak luas
        System.out.println("Total luas Persegi Panjang adalah " + luasPP);
        
        // mengembalikan nilai luas
        return luasPP;
    }
}
