/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

/**
 *
 * @author irvannaufal
 */
public class Tiket extends Customer {
    private static String NamaFilm;
    private static int HargaTiket;
    private static String Jam;

    /**
     * @return the Kode
     */
    public String getNamaFilm() {
        return this.NamaFilm;
    }

    /**
     * @param NamaFilm the Kode to set
     */
    public void setNamaFilm(String NamaFilm) {
        this.NamaFilm = NamaFilm;
    }

    /**
     * @return the HargaTiket
     */
    public int getHargaTiket() {
        return this.HargaTiket;
    }

    /**
     * @param HargaTiket the HargaTiket to set
     */
    public void setHargaTiket(int hrg) {
        this.HargaTiket = hrg;
    }

    /**
     * @return the Jam
     */
    public String getJam() {
        return this.Jam;
    }

    /**
     * @param Jam the Jam to set
     */
    public void setJam(String jam) {
        this.Jam = jam;
    }
}
