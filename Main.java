package NesneProjeOdevi;

public class Main {

    public static void main(String[] args) {

        // Normal nesne oluşturuyoruz
        Kopek kopek = new Kopek();
        Kedi kedi = new Kedi();

        // Yapılandırıcı kullanarak nesne oluşturuyoruz
        Kopek kopek2 = new Kopek("Av Köpeği", "Karabaş", "Siyah", 4);
        Kedi kedi2 = new Kedi("Mama", "Tekir", "Beyaz", 4);

        // Kedi ve Köpek sınıflarını bağlıyoruz
        kedi.kediKopek(kopek);
        kopek.kopekKedi(kedi);

        // Kedi sınıfı metodlarını kullanıyoruz
        System.out.println("Kedi bir bacağını kaybetti :(");
        kedi.setAyakSayisi(3);
        System.out.println("Kedinin yeni ayak sayısı : " + kedi.getAyakSayisi());
        kedi.Konus(); // Interface metodu
        kedi.KediYazdir();
        kedi.kediKopek(); // 1-1 ilişki kurduğumuz sınıfı gösteriyoruz

        // Köpek sınıfı metodlarını kullanıyoruz
        kopek.setIsim("Kurt");
        System.out.println("Köpeğin ismini değiştirdin!");
        System.out.println("Köpeğin yeni ismi : " + kopek.getIsim());
        kopek.Isir(); // Interface metodu
        kopek.Konus();
        kopek.kopekKedi(); // 1-1 ilişki kurduğumuz sınıfı gösteriyoruz

        // Aşkın yapılandırıcılarla oluşturduğumuz nesneleri test ediyoruz
        kopek2.KopekYazdir();
        kedi2.KediYazdir();

    }

}
