/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author Miftakhul Hafidz
 */
public class Controller {


    public void Control() {
        Pilihan bio = new Pilihan();
        Bayar byr = new Bayar();
        while (true) {
            bio.bio();
            bio.film();
            bio.jam();
            bio.olahKursiTerpakai();
            bio.totalOrang();
            bio.kursi();
        
        
        while (true){
                byr.cetak();
                byr.Bayar();
            }
        }    
        

    }
}
