public class loopDemo {
    public static void main(String[] args) {
//        //for
//        for (int i=2 ; i<10 ; i+=2){
//            System.out.println( i );
//        }
//            System.out.println("döngü bitti");
//
//        //while
//        int i=1;
//        while (i<10){
//            System.out.println( i );
//            i++;
//        }
//        System.out.println("While döngüsü bitti");
//        //Do-While
//        int j=100;
//        do {
//            System.out.println(j);
//            j +=2;
//        }
//        while (j<10);
//
//        System.out.println("Do-While döngüsü bitti");

            String a="";
            int x = (int) Math.floor(5/2);
            System.out.println(x);

            for (int i =10; i>0; i--){
                a+="X";
                int b=10-a.length();
                String str="";
                for (int j = b; j>0; j--){
                    str+=" ";
                }
                System.out.println(str+a);
            }


    }
}

