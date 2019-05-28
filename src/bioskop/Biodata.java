/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.util.Scanner;

/**
 *
 * @author Yannuar Andika
 */
public class Biodata {

    Scanner input = new Scanner(System.in);
    Tiket user = new Tiket();
    public String nama, nomer;

    public void bio() {
        System.out.println("Pemasanan Tiket Bioskop");
        System.out.print("Masukkan Nama :");
        nama = input.nextLine();
        System.out.print("Masukkan Nomer Telepon :");
        nomer = input.next();

        user.setCustomerName(nama);
        user.setCustomerPhone(nomer);

    }


}
