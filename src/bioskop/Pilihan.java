/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author IrvanNaufal
 */
public class Pilihan extends Biodata{

    private String namafilm;
    private String jam;
    private int pilihanjam;
    int harga;
    private int judulFilm;
    private Object pilihJam;
    private int pilihjam;
   
    public void biodata(){
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
    
    public void jam() {
        String pilihanam = "[1]. 12.30\n"
                + "[2]. 18.00\n"
                + "[3]. 20.00\n";
        System.out.println("Pilihan Jam Hari ini :");
        System.out.println("[1]. 12.30");
        System.out.println("[2]. 18.00");
        System.out.println("[3]. 20.00");
        System.out.print("Masukan Pilihan :");
        try {
            pilihjam = Integer.parseInt(JOptionPane.showInputDialog(null, pilihJam, "Pilihan JAM Hari Ini", JOptionPane.QUESTION_MESSAGE));
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

