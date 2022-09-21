/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author ADMIN
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PROJECT 1
        Persegi p1 = new Persegi();
        Lingkaran l1 = new Lingkaran();
        
        double LuasBangunDatar = p1.hitungLuas(42) + (l1.hitungLuas(42/2)*2);
        System.out.println("Luas bangun datar adalah : " + LuasBangunDatar);
    }
    
}
