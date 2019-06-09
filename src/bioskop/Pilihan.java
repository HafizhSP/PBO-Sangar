/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author IrvanNaufal
 */
public class Pilihan extends Biodata {

    private String namafilm;
    private String jam;
    private int harga;
    private int judulFilm;
    private int pilihanjam;
    static String[] kursibos;

    public void biodata() {
        bio();
    }

    public void film() {
        String pilihFilm = "[1]. Hafidz Zekken v.1\n"
                + "Rp. 30.000,00\n"
                + "[2]. Hafidz Zekken v.2\n"
                + "Rp. 45.000,00\n"
                + "{3}. Hafidz Zekken v.3\n"
                + "Rp. 30.000,00";
        try {
            judulFilm = Integer.parseInt(JOptionPane.showInputDialog(null, pilihFilm, "Pilihan FILM", JOptionPane.QUESTION_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OK untuk keluar program");
            System.exit(0);
        }

        switch (judulFilm) {
            case 1:
                this.namafilm = "Hafidz Zekken part 1";
                harga = 30000;
                break;
            case 2:
                namafilm = "Hafidz Zekken part 2";
                harga = 45000;
                break;
            case 3:
                namafilm = "Hafidz Zekken part 3";
                harga = 30000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Masukan angka sesuai pilihan yang tertera!");
                film();
        }
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

    public void kursi() {
        File file = new File("src/bioskop/contoh.txt");
        BufferedReader br;
        BufferedWriter bw;
        kursibos = new String[user.getTotalOrang()];
        int j = 1;
        try {
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file, true);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            restart:
            for (int i = 0; i <= user.getTotalOrang() - 1; i++) {
                String strLine;
                String urutanKursi = "-----------------------"
                        + "\n|           Layar        |"
                        + "\n-----------------------"
                        + "\n\nA1    A2    A3"
                        + "\nB1    B2    B3"
                        + "\nC1    C2    C3"
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
                bw.newLine();
                bw.write(kursibos[i]);
                j++;

            }
            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}