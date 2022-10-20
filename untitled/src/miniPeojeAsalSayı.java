public class miniPeojeAsalSayı {
    public static void main(String[] args) {
        int sayı = -2 ;
        int kalan = sayı % 2 ;
        System.out.println(kalan);
        boolean asalSayımı = true;

        if (sayı==1){
            System.out.println("Sayı asal değildir");
            return;
        }

        if (sayı<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2 ; i<sayı ; i++){
            if (sayı % i == 0){
                asalSayımı = false;

            }
        }
        if (asalSayımı) {
            System.out.println("Sayı asaldır");
        }
        else {
            System.out.println("Sayı asal değildir");

        }
    }
}
