import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vize,finall;
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen Vize notunuzu giriniz");
        vize=sc.nextInt();
        System.out.println("Lütfen Final notunuzu giriniz");
        finall=sc.nextInt();
        int islem = ((vize * 4) / 10) + ((finall * 6) / 10);
        System.out.println("Not ortalamanız:"+islem);


    }
}