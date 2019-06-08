/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author samsung
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

    public void setJam(String jam) {
        this.jam = jam;
    }
    
    public String getStatusBayar(){
        return this.status;
    }
    
    public void setStatusBayar(String status){
        this.status = status;
    }
    
    public int getTotalOrang(){
        return this.totalOrang;
    }
    
    public void setTotalOrang(int orang){
        this.totalOrang = orang;
    }
}
