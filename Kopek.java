package NesneProjeOdevi;

public final class Kopek extends Hayvanlar implements Konus {

    private String kopeginDurumu;
    private Kedi kedi;

    // Köpek sınıfı yapılandırıcıları
    Kopek() {
        this("Ev kopegi", "Kopek", "siyah", 4);
    }

    Kopek(String kopeginDurumu, String isim, String renk, int ayakSayisi) {
        super(isim, renk, ayakSayisi);
        this.kopeginDurumu = kopeginDurumu;
    }

    // Köpek ve Kediyi bağlıyoruz (1 - 1 ilişki)
    public void kopekKedi() {
        this.kedi = new Kedi();
        System.out.println("Köpeğin arkadası : " + kedi.getIsim());
    }

    public void kopekKedi(Kedi kedi) {
        this.kedi = kedi;
        System.out.println("Köpeğin arkadası : " + kedi.getIsim());
    }

    // Köpek sınıfı metodları
    public void KopekYazdir() {
        System.out.println("Köpeğin ismi : " + getIsim() + "\nrenk : " + getRenk() + "\nayak sayısı : " + getAyakSayisi() + "\ndurumu : " + kopeginDurumu);
    }

    public void Isir() {
        System.out.println("Isırıldınız!!");
    }

    // Interface metodunu eziyoruz
    @Override
    public void Konus() {
        System.out.println("hav hav");
    }

    // Get - Set metodları
    public String getKopeginDurumu() {
        return kopeginDurumu;
    }

    public void setKopeginDurumu(String kopeginDurumu) {
        this.kopeginDurumu = kopeginDurumu;
    }

    public Kedi getKedi() {
        return kedi;
    }

    public void setKedi(Kedi kedi) {
        this.kedi = kedi;
    }
}
