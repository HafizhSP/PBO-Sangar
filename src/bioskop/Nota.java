/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Miftakhul Hafidz
 */
public class Nota {

    Tiket user = new Tiket();
    Controler ctr = new Controler();
    Pilihan plh = new Pilihan();
    int opsi;

    public void cetak() {
        String joption[] = {"Lanjut", "Kembali", "Selesai"};
        
        
        String nota = "Costumer Name                      " + user.getCustName()
                + "\nCustomer Phone                     " + user.getCustPhone()
                + "\nJudul Film                                  " + user.getNamaFilm()
                + "\nJam                                             " + user.getJam()
                + "\nJumlah pesan                           " + user.getTotalOrang()
                + "\nKursi                                          " + Arrays.toString(plh.kursibos)
                + "\nHarga                                          " + (user.getHargaTiket()) * (user.getTotalOrang())
                + "\nStatus Pembayaran                " + user.getStatusBayar()
                + "\n\nTekan LANJUT untuk melanjutkan pemesanan"
                + "\nTekan KEMBALI untuk mengulang pemesanan"
                + "\nTekan SELESAI jika pesanan anda sudah selesai"
                + "\nTekan NOMOR KURSI untuk melihat kursi anda";
        
        
        opsi = JOptionPane.showOptionDialog(null, nota, "RINCIAN NOTA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE , null, joption, joption[0]);

        switch (opsi) {
            case 0 : 
                JOptionPane.showMessageDialog(null, "Tekan 'OKE' untuk lanjut ke Billing Pembayaran");
                break;
            case 1 :
                JOptionPane.showMessageDialog(null, "Tekan 'OKE' untuk mengulang pemesanan film");
                ctr.Control();
                break;
            case 2 : 
                JOptionPane.showMessageDialog(null, "Tekan 'OKE' untuk keluar program");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
                System.exit(0);
                break;
        }
    }
}
