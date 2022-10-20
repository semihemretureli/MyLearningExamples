public class UcgenOlusturma {
    public static void main(String[] args) {
        drawTriAngle(56);

//        int a, b, c;
//
//        for (a = 1; a < 10; a++) {
//            for (b = a; b < 10; b++ )
//                System.out.print(" ");
//        }
//        for (c = 1 ; c <= a ; c++) {
//            System.out.print("*");
//            System.out.print(" ");
//        }
//       System.out.println(" ");

    }

    public static void drawTriAngle(int groundWidth) {
        int halfCnt = (int) Math.floor(groundWidth / 2);
        int rowCnt = 1;
        for (int i = 0; i <= halfCnt; i++) {
            for (int j = halfCnt - i; j > 0; j--) {
                System.out.print(" ");
            }
            //System.out.println("*");
            for (int z = rowCnt; z > 0; z--) {
                System.out.print("*");
            }
            rowCnt += 2;
            System.out.println();
        }

    }
}
