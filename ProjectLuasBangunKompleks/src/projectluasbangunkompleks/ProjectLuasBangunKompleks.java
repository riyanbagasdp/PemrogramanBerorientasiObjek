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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /////////////////////// PROJECT 1 ////////////////////////
        // membuat objek dari class lingkaran
        Lingkaran l = new Lingkaran(); 
        // membuat objek dari class persegi
        Persegi p = new Persegi();
        // melakukan assigment hitungLuas milik persegi kedalam variable persegi
        double persegiProject1 = p.hitungLuas(42);
        // melakukan assigment hitungLuas milik lingkaran kedalam variable lingkaran
        double lingkaranProject1 = l.hitungLuas(21);
        // membuat rumus hitung untuk mengukur luas keseluruhan bangunan
        double totalSemua = lingkaranProject1 + persegiProject1;
        // cetak hasil luas semua  
        System.out.println("Total luas semua adalah " + totalSemua + " cm2");  
        
        /////////////////////// PROJECT 2 ////////////////////////
        // 
        double lingkaranBesarProject2 = l.hitungLuas2(14);        
        double lingkaranKecil1Project2 = l.hitungLuas2(7);        
        double lingkaranKecil2Project2 = l.hitungLuas2(7);
        double totalSemua2 = (lingkaranBesarProject2 - (lingkaranKecil1Project2 + lingkaranKecil2Project2 ));       
        System.out.println("Total luas semua adalah " + totalSemua2 + " cm2");  
        
        


        

        
    }
    
}
