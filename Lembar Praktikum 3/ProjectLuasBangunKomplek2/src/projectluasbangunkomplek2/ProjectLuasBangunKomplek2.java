/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkomplek2;

/**
 *
 * @author ADMIN
 */
public class ProjectLuasBangunKomplek2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //PROJECT 2
        Persegi p2 = new Persegi ();
        Lingkaran l2 = new Lingkaran ();
        
        double LingkaranBesar = l2.hitungLuas(28/2)/2;
        double LingkaranKecil = l2.hitungLuas(14/2);
        
        double LuasAbu = LingkaranBesar - LingkaranKecil;
        System.out.println("Luas daerah yang berwarna abu-abu adalah : " + LuasAbu);
    }
}
