/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi4;


public class NamaLagu extends Lagu {
    protected String Judul_Lagu;
    private java.lang.String Nama_Lagu;
    
    public NamaLagu(String Nama_Lagu, String nama_album) {
        super(nama_album);
        this.Nama_Lagu = Nama_Lagu;
    }

    
    public void infoLagu(){
        System.out.println("Nama album : " + super.nama_album);
        System.out.println("Adalah judul album : " +this.Nama_Lagu);
    }
}
