public class Main {
    public static void main(String[] args) {
        char grade = '';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

    }
}