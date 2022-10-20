public class mukemmelSayi {
    public static void main(String[] args) {
        int sayı = 28;
        int total = 0;
        for (int i=1;i<sayı;i++){
            if (sayı % i == 0){
                total=total +i ;
            }
        }
        if (total== sayı){
            System.out.println("Mükemmel sayıdır");
        }
        else {
            System.out.println("Mükemmel sayı değildir");
        }

    }
}
