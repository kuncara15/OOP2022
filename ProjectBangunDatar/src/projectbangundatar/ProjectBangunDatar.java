/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author ADMIN
 */
public class ProjectBangunDatar {
    public static void main(String[] args) {
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;
        
        C.hitungLuas();
        C.hitungKelliling();
        
        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;
        
        D.hitungLuas();
        D.hitungKelliling();
        
        Lingkaran L1 = new Lingkaran();
        L1.r = 6;
        
        L1.hitungLuasLingkaran();
        L1.hitungKelilingLingkaran();
                
        Lingkaran L2 = new Lingkaran();
        L2.r = 12;
        
        L2.hitungLuasLingkaran();
        L2.hitungKelilingLingkaran();
    }
}
