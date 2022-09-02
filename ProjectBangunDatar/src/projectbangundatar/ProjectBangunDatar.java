/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author lenovo
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang ppA = new PersegiPanjang();
        ppA.hitungKelilingA(10, 7);
        ppA.hitungLuasA(10, 7);
        
        PersegiPanjang ppB = new PersegiPanjang();
        ppB.hitungKelilingB(14, 9);
        ppB.hitungLuasB(14, 9);
        
        PersegiPanjang ppC = new PersegiPanjang();
        ppC.hitungKelilingC(17, 8);
        ppC.hitungLuasC(17, 8);
        
        PersegiPanjang ppD = new PersegiPanjang();
        ppD.hitungKelilingD(26, 14);
        ppD.hitungLuasD(26, 14);
        
        Lingkaran l1 = new Lingkaran();
        l1.hitungKelilingL1(6);
        l1.hitungLuasL1(6);
        
        Lingkaran l2 = new Lingkaran();
        l2.hitungKelilingL2(12);
        l2.hitungLuasL2(12);
        
    }
    
}
