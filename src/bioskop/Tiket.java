/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author Hafizh S.P
 */
public class Tiket extends Customer {

    private static String namaFilm;
    private static int hargaTiket;
    private static String jam;
    private static int totalOrang;
    private static String status="BELUM LUNAS";


    public String getNamaFilm() {
        return this.namaFilm;
    }

    public void setNamaFilm(String NamaFilm) {
        this.namaFilm = NamaFilm;
    }

    public int getHargaTiket() {
        return this.hargaTiket;
    }

    public void setHargaTiket(int hrg) {
        this.hargaTiket = hrg;
    }

    public String getJam() {
        return this.jam;
    }

    public void setJam(String Jam) {
        this.jam = Jam;
    }
    
    public String getStatusBayar(){
        return this.status;
    }
    
    public void setStatusBayar(String Status){
        this.status = Status;
    }
    
    public int getTotalOrang(){
        return this.totalOrang;
    }
    
    public void setTotalOrang(int Orang){
        this.totalOrang = Orang;
    }
}
