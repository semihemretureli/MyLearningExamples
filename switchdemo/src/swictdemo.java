public class swictdemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("malesef kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");


        }
    }
}
