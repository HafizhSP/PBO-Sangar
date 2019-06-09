/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author IrvanNaufal
 */
public class Pilihan extends Biodata {

    private String namafilm;
    private String jam;
    private int harga;
    public static int judulFilm;
    private int pilihanjam;
    static String[] kursibos;

    public void film() {
        String pilihFilm = "[1]. The Amazing Hafidz Zekken\n"
                + "Rp. 30.000,00\n\n"
                + "[2]. Gung The Tomp Rider\n"
                + "Rp. 45.000,00\n\n"
                + "[3]. Yannuar The Guardian Of Malang\n"
                + "Rp. 30.000,00";
        try {
            judulFilm = Integer.parseInt(JOptionPane.showInputDialog(null, pilihFilm, "Pilihan FILM", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OK untuk keluar program");
            System.exit(0);
        }

        switch (judulFilm) {
            case 1:

                namafilm = "[1]. The Amazing Hafidz Zekken";
                harga = 30000;
                break;
            case 2:
                namafilm = "[2]. Gung The Tomp Rider";
                harga = 45000;
                break;
            case 3:
                namafilm = "[3]. Yannuar The Guardian Of Malang";
                harga = 30000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Masukan angka sesuai pilihan yang tertera!");
                film();
        }

        user.setNamaFilm(namafilm);
        user.setHargaTiket(harga);
    }

    public void jam() {
        String pilihJam = "[1]. 12.30\n"
                + "[2]. 18.00\n"
                + "[3]. 20.00\n";
        try {
            pilihanjam = Integer.parseInt(JOptionPane.showInputDialog(null, pilihJam, "Pilihan JAM Hari Ini", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
            System.exit(0);
        }

        switch (pilihanjam) {
            case 1:
                jam = "12.30";
                break;
            case 2:
                jam = "18.00";
                break;
            case 3:
                jam = "20.00";
                break;
        }
        user.setJam(jam);

    }

    public void totalOrang() {
        String totalOrang = "Ingin memesan berapa tiket ? ";
        try {
            user.setTotalOrang(Integer.parseInt(JOptionPane.showInputDialog(null, totalOrang, "Jumlah Tiket", JOptionPane.QUESTION_MESSAGE)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
            System.exit(0);
        }
    }

    public void kursi() {
        File file = null;
        switch (judulFilm) {
            case 1:
                file = new File("src/bioskop/kursi1.txt");
                break;
            case 2:
                file = new File("src/bioskop/kursi2.txt");
                break;
            case 3:
                file = new File("src/bioskop/kursi3.txt");
                break;
        }

        BufferedReader br;
        kursibos = new String[user.getTotalOrang()];
        int j = 1;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            restart:
            for (int i = 0; i <= user.getTotalOrang() - 1; i++) {
                String strLine;
                String urutanKursi = "--------------------------"
                        + "\n|           Layar         |"
                        + "\n--------------------------"
                        + "\n\nA1            A2            A3"
                        + "\nB1             B2           B3"
                        + "\nC1             C2           C3"
                        + "\n\nSilahkan pilih kursi untuk orang ke-" + j + " (ex:A1)";

                kursibos[i] = JOptionPane.showInputDialog(null, urutanKursi, "Kursi Bioskop", JOptionPane.QUESTION_MESSAGE);

                while ((strLine = br.readLine()) != null) {
                    if (strLine.equalsIgnoreCase(kursibos[i])) {
                        JOptionPane.showMessageDialog(null, "Kursi yang anda pilih SUDAH TERISI!\n\n"
                                + "Silahkan klik OKE dan lakukan pemilihan kembali.");
                        kursi();
                        br.close();
                        break restart;
                    }
                }
                j++;

            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
            System.exit(0);
        }

    }
}
