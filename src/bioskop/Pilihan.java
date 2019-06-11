/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafizh S.P
 * @author Yannuar A
 * @author IrvanNaufal
 */
public class Pilihan extends Biodata {

    private String namafilm;
    private String jam;
    private int harga;
    public static int judulFilm;
    private int pilihanjam;
    private int kursiTerpakai;
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
                JOptionPane.showMessageDialog(null, "masukan angka sesuai pilihan yang tertera!");
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

    public void olahKursiTerpakai() {
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
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String strLine;
            while ((strLine = br.readLine()) != null) {
                kursiTerpakai++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
            System.exit(0);
        }
    }

    public void totalOrang() {
        String teksTotal = "Ingin memesan berapa tiket ? "
                + "\nSisa kursi saat ini adalah " + (9 - kursiTerpakai) + " Kursi";
        try {
            String totalOrang = JOptionPane.showInputDialog(null, teksTotal, "Jumlah Tiket", JOptionPane.QUESTION_MESSAGE);

            if (totalOrang.matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(null, "Harap masukan hanya angka pada kolom inputan!");
                totalOrang();

            } else {
                int jumlahOrang = Integer.parseInt(totalOrang);

                if (jumlahOrang >= (9 - kursiTerpakai) || jumlahOrang <= 0) {
                    JOptionPane.showMessageDialog(null, "Maaf, sisa kursi untuk saat ini adalah " + (9 - kursiTerpakai) + " Kursi");
                    totalOrang();
                } else {
                    user.setTotalOrang(jumlahOrang);
                }
            }

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

        kursibos = new String[user.getTotalOrang()];
        String[] kursiTerisi = new String[kursiTerpakai];
        int j = 1, m=0;
        String pilihKursi, strLine;

        try {
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            while ((strLine = br.readLine()) != null) {
                kursiTerisi[m] = strLine;
                m++;
            }
            
            restart:
            for (int i = 0; i <= user.getTotalOrang() - 1; i++) {

                String urutanKursi = "--------------------------"
                        + "\n|           Layar         |"
                        + "\n--------------------------"
                        + "\n\nA1            A2            A3"
                        + "\nB1             B2           B3"
                        + "\nC1             C2           C3"
                        + "\n\nKursi yang sudah terisi adalah Kursi \n" + Arrays.toString(kursiTerisi)
                        + "\n\nSilahkan pilih kursi untuk orang ke-" + j + " (Ex: A1)";
                pilihKursi = JOptionPane.showInputDialog(null, urutanKursi, "Kursi Bioskop", JOptionPane.QUESTION_MESSAGE);

                if (pilihKursi.length() < 2 || pilihKursi.length() > 2) {
                    JOptionPane.showMessageDialog(null, "Masukan pilihan kursi anda sesuai format yang ada! (Ex: A1)");
                    kursi();
                    br.close();
                    break restart;
                } else {
                    boolean benar = true;

                    for (int l = 0; l <= kursiTerisi.length - 1; l++) {
                        if (kursiTerisi[l].equalsIgnoreCase(pilihKursi)) {
                            JOptionPane.showMessageDialog(null, "Kursi yang anda pilih SUDAH TERISI!\n\n"
                                    + "Silahkan klik OKE dan lakukan pemilihan kembali dari awal.");
                            benar = false;
                            i--;
                            break;
                        }
                    }

                    if (i >= 1) {
                        for (int k = 0; k < i; k++) {
                            if (kursibos[k].equalsIgnoreCase(pilihKursi)) {
                                JOptionPane.showMessageDialog(null, "Kursi yang anda pilih sama dengan kursi sebelumnya!\n\n"
                                        + "Silahkan klik OKE dan lakukan pemilihan kembali.");
                                i--;
                                benar = false;
                                break;
                            }
                        }
                    }

                    if (benar == true) {
                        kursibos[i] = pilihKursi;
                        j++;
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tekan OKE untuk keluar program");
            System.exit(0);
        }

    }
}
