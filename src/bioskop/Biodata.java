/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import javax.swing.JOptionPane;

/**
 *
 * @author Yannuar Andika
 */
public class Biodata {

    Tiket user = new Tiket();
    public String nama, nomer;

    public void bio() {
        try {
             nama = JOptionPane.showInputDialog(null, "Masukkan Nama :", "Pemesanan Tiket Bioskop", JOptionPane.INFORMATION_MESSAGE);
             nomer = JOptionPane.showInputDialog(null, "Masukkan Nomer Telepon :", "Pemesanan Tiket Bioskop", JOptionPane.INFORMATION_MESSAGE);
                if (nomer.matches("[0-9]*")) {
                    JOptionPane.showMessageDialog(null, "Tekan OKE untuk melanjutkan memilih film");
                } else {
                    JOptionPane.showMessageDialog(null, "Inputan Nomor Anda SALAH!");
                    bio();
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
            System.exit(0);
        }
        user.setCustName(nama);
        user.setCustPhone(nomer);
    }


}
