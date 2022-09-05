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
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luas: " + luas + " satuan luas");
    }
    
    void hitungKelliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
}