package NesneProjeOdevi;

public final class Kedi extends Hayvanlar implements Konus {

    private String kediYemegi;
    private Kopek kopek;

    // Kedi sınıfı yapılandırıcıları
    Kedi() {
        this("kedi mamasi", "kedi", "beyaz", 4);
    }

    Kedi(String kediYemegi) {
        this(kediYemegi, "kedi", "beyaz", 4);
    }

    Kedi(String kediYemegi, String isim, String renk, int ayakSayisi) {
        super(isim, renk, ayakSayisi);
        this.kediYemegi = kediYemegi;
    }

    // Kedi sınıfı metotları
    public void kediKopek() {
        this.kopek = new Kopek();
        System.out.println("Kedinin arkadası : " + kopek.getIsim());
    }

    public void kediKopek(Kopek kopek) {
        this.kopek = kopek;
        System.out.println("Kedinin arkadasi : " + kopek.getIsim());
    }

    public void Tirmala() {
        System.out.println("Tırmalandınız!");
    }

    public void KediYazdir() {
        System.out.println("Kedinin ismi : " + getIsim() + " ayaksayısı : " + getAyakSayisi() + " renk : " + getRenk() + " yemeği : " + kediYemegi);
    }

    // Interface metodu
    @Override
    public void Konus() {
        System.out.println("miyav miyav");
    }
}
