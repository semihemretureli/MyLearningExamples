public class recapdemo1 {
    public static void main(String[] args) {
        int sayı1 = 20;
        int sayı2 = 25;
        int sayı3 = 2;
        int enBuyuk = sayı1;

        if (enBuyuk < sayı2) {
            enBuyuk = sayı2;
            System.out.println("sayı2 sayı1 den büyüktür");
        }
        if (enBuyuk > sayı2){
            enBuyuk = sayı1;
            System.out.println("sayı1 sayı2 den büyüktür");
        }



    }
}
