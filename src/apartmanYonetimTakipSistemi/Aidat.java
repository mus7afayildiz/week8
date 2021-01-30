package apartmanYonetimTakipSistemi;

/*-- Aidat
    + Tutacagi bilgiler: Ay numarasi, aidatin odenip odenmedigi bilgilerini tutacak
    + Iki contructor olusturulacak: Aylik ( int ayNumarasi),  Aylik ( int ayNumarasi, double odenenMiktar)*/

import java.util.Random;

public class Aidat {
    Random random = new Random();
    private int ayNumarasi;
    private double odenenMiktar;

    public int getAyNumarasi() {
        return ayNumarasi;
    }

    public void setAyNumarasi(int ayNumarasi) {
        this.ayNumarasi = ayNumarasi;
    }

    public double getOdenenMiktar() {
        return odenenMiktar;
    }

    public void setOdenenMiktar(double odenenMiktar) {

        this.odenenMiktar = odenenMiktar;
    }

    public void setOdenenMiktar(int ayNumarasi, double odenenMiktar) {
        this.ayNumarasi = ayNumarasi;
        this.odenenMiktar = odenenMiktar;

    }
    Aidat(){

    }

    Aidat(int ayNumarasi, double odenenMiktar){
        this.ayNumarasi = ayNumarasi;
        this.odenenMiktar = odenenMiktar;
    }

    public double aidatRandom(){
        setOdenenMiktar(random.nextInt(500));
        return odenenMiktar;
    }





}
