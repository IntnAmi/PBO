/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi4;

public class Album {
    public static void main(String[] args) {
        Lagu LaguSaya = null;
        
        NamaLagu Namalagu = new NamaLagu ("Love Yourself Answer", "jamais vu");
        NamaProduser nama_prod = new NamaProduser("Matthew Tishler", "jamais vu");
        LaguSaya = Namalagu;
        LaguSaya.infoLagu();
        
        LaguSaya = nama_prod;
        LaguSaya.infoLagu();
    }
}
