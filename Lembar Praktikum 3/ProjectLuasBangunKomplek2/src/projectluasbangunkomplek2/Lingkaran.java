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
public class Lingkaran {
    double hitungLuas(double r){
        double luas;
        if (r % 7 == 0){
            luas = (r * r) * 22/7;
        }
        else {
            luas = (r * r) * 3.14;
        }
        return luas;
    }
}
