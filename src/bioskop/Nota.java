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
public class Nota {
    
    Tiket user = new Tiket();
    
    public void cetak(){
        System.out.println("===============PEMESANAN============");
        System.out.println("Costumer Name\t\t"+user.getCustomerName());
        System.out.println("Customer Phone\t\t"+user.getCustomerPhone());
        System.out.println("Judul Film\t\t"+user.getNamaFilm());
        System.out.println("Jam\t\t\t"+user.getJam());
        System.out.println("Harga\t\t\t"+user.getHargaTiket());
    }
}
