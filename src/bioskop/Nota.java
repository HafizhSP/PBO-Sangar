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
    Controller ctr = new Controller();
    Pilihan plh = new Pilihan();
    int opsi;

    public void cetak() {
        String joption[] = {"LANJUT", "HOME", "SELESAI"};
        
        
        String nota = "Costumer Name                      " + user.getCustName()
                + "\nCustomer Phone                     " + user.getCustPhone()
                + "\nJudul Film                                  " + user.getNamaFilm()
                + "\nJam                                             " + user.getJam()
                + "\nJumlah pesan                           " + user.getTotalOrang()
                + "\nKursi                                           " + Arrays.toString(plh.kursibos)
                + "\nHarga                                          " + (user.getHargaTiket()) * (user.getTotalOrang())
                + "\nStatus Pembayaran                " + user.getStatusBayar()
                + "\n\n    HARAP SCREENSHOT HALAMAN INI UNTUK PENUKARAN TIKET"
                + "\n            PASTIKAN STATUS PEMBAYARAN ANDA 'LUNAS'"
                + "\n\nTekan LANJUT untuk melanjutkan pemesanan"
                + "\nTekan HOME untuk mengulang/memesan film kembali"
                + "\nTekan SELESAI jika pesanan anda sudah selesai dan ingin keluar";
        
        
        opsi = JOptionPane.showOptionDialog(null, nota, "RINCIAN NOTA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE , null, joption, joption[0]);

        switch (opsi) {
            case 0 : 
                JOptionPane.showMessageDialog(null, "Tekan 'OKE' untuk lanjut ke Billing Pembayaran");
                break;
            case 1 :
                JOptionPane.showMessageDialog(null, "Tekan 'OKE' untuk mengulang/memesan film kembali");
                user.setStatusBayar("BELUM LUNAS");
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
