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
   
    public void biodata(){
        bio();
    }
    
    public void film() {
        System.out.println("Pilihan Fim :");
        System.out.println("[1]. The Amazing Hafidz Zekken");
        System.out.println("[2]. Gung The Tomp Rider");
        System.out.println("{3}. Yannuar The Guardian Of Malang");
        System.out.print("Masukan Pilihan :");
        int judul = input.nextInt();
        switch (judul) {
            case 1:
                namafilm = "The Amazing Hafidz Zekken";
                harga = 30000;
                break;
            case 2:
                namafilm = "Gung The Tomp Rider";
                harga = 45000;
                break;
            default:
                namafilm = "Yannuar The Guardian Of Malang";
                harga = 30000;
                break;
        }
        user.setNamaFilm(namafilm);
        user.setHargaTiket(harga);
    }
    
   public void jam(){
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
}
