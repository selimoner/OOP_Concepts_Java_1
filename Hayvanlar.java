package NesneProjeOdevi;

public abstract class Hayvanlar {

    private String isim;
    private String renk;
    private int ayakSayisi;

    Hayvanlar() {
        this("hayvan", "hayvan rengi", 4);
    }

    Hayvanlar(String hayvanIsmi, String hayvanRengi, int hayvanAyakSayisi) {
        setAyakSayisi(hayvanAyakSayisi);
        setIsim(hayvanIsmi);
        setRenk(hayvanRengi);
    }

    // Get - Set metodları
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
}
