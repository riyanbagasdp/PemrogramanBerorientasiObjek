/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author lenovo
 */
public class Ruang {
    // panjang ruang 	
    int panjang;
    // lebar ruang
    int lebar;
    
    int hitungLuas(){
        ///////////////////////////////////////////////
        // menghitung luas dengan memanfaatkan class persegi panjang
//        PersegiPanjang p = new PersegiPanjang();
        
        // panjang dari persegi panjang diambil dari panjang ruang
//        p.panjang = this.panjang;
        // lebar dari persegi panjang diambil dari lebar ruang
//        p.lebar = this.lebar;
        
        // hitung luasnya
//        return p.hitungLuas();
    ////////////////////////////////////////////////////////
            // menghitung luas dengan memanfaatkan class persegi panjang
//            PersegiPanjang p = new PersegiPanjang();

            // hitung luasnya
//            return p.hitungLuas(this.panjang, this.lebar);
    //////////////////////////////////////////////////////////
            // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
               
        // hitung luasnya
        return p.perkalian(this.panjang, this.lebar);
//        return PersegiPanjang.perkalian(this.lebar, this.lebar);

        

    }

}
