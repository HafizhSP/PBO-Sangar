/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafizh
 */
public class Bayar extends Nota {

    Thread thread = new Thread();
    int pilih, nominal;
    String nama, via;

    public void Bayar() {
        try {
            String pilihBayar = "1. Lakukan Pembayaran\n"
                    + "2. Konfirmasi Pembayaran";
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null, pilihBayar, "Biling Pembayaran", JOptionPane.QUESTION_MESSAGE));

            switch (pilih) {
                case 1:
                    String metodeBayar = "Pembayaran dapat dilakukan melalui : \n"
                            + "1. Indomart / Alfamart\n"
                            + "2. ATM / M-BANKING All Bank";
                    JOptionPane.showMessageDialog(null, metodeBayar);

                    String totalHarga = "Silahkan lakukan pembayaran dengan kode bayar : 1607\n"
                            + "Total pembelian anda : Rp." + (user.getHargaTiket()) * (user.getTotalOrang());
                    JOptionPane.showMessageDialog(null, totalHarga);
                    Bayar();
                    break;

                case 2:
                    try {
                        JOptionPane.showMessageDialog(null, "Lakukan Konfirmasi dengan menyertakan identitas anda secara BENAR!");
                        nama = JOptionPane.showInputDialog(null, "NAMA : ", "Konfirmasi Pembayaran", JOptionPane.QUESTION_MESSAGE);
                        via = JOptionPane.showInputDialog(null, "PEMBAYARAN VIA : ", "Konfirmasi Pembayaran", JOptionPane.QUESTION_MESSAGE);
                        nominal = Integer.parseInt(JOptionPane.showInputDialog(null, "NOMINAL : (ex: 30000)", "Konfirmasi Pembayaran", JOptionPane.QUESTION_MESSAGE));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Harap masukan nominal dengan angka!");
                        Bayar();
                        break;
                    }

                    if (nama.equals("") || via.equals("")) {
                        JOptionPane.showMessageDialog(null, "Harap isi semua data diri anda!");
                        Bayar();
                        break;
                    } else {

                        JOptionPane.showMessageDialog(null, "SETELAH ANDA KLIK OKE, PEMBAYARAN ANDA AKAN OTOMATIS TERDETEKSI\n");

                        for (int i = 2; i >= 0; i--) {
                            thread.sleep(1000);
                        }

                            if (nominal != (user.getHargaTiket()) * (user.getTotalOrang())) {
                                JOptionPane.showMessageDialog(null, "Nominal Konfirmasi anda TIDAK SESUAI dengan pesanan!\n"
                                        + "Silahkan klik OKE untuk mengulangi konfirmasi");
                                Bayar();
                            } else {

                                user.setStatusBayar("LUNAS");
                                try {
                                    FileWriter fw=null;
                                    switch (plh.judulFilm) {
                                        case 1:
                                            fw = new FileWriter("src/bioskop/kursi1.txt", true);
                                            break;
                                        case 2:
                                            fw = new FileWriter("src/bioskop/kursi2.txt", true);
                                            break;
                                        case 3:
                                            fw = new FileWriter("src/bioskop/kursi3.txt", true);
                                            break;
                                    }
                                    BufferedWriter bw = new BufferedWriter(fw);

                                    for (int i = 0; i <= user.getTotalOrang() - 1; i++) {
                                        bw.newLine();
                                        bw.write(plh.kursibos[i]);

                                    }
                                    bw.close();
                                } catch (IOException e) {
                                    JOptionPane.showMessageDialog(null, "Tekan OKE untuk kembali ke rincian Nota");
                                    cetak();
                                    break;
                                }
                                JOptionPane.showMessageDialog(null, "TERIMA KASIH - PEMBAYARAN ANDA SUDAH TERDETEKSI\n"
                                        + "\nTekan OKE untuk lanjut..");
                            }

                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tekan OKE untuk kembali ke rincian Nota");
                    cetak();
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk kembali ke rincian Nota");
        }

    }
}
