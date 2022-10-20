public class TheredingDemo {
    public static void main(String[] args) {
        KronometreThered thered1= new KronometreThered("thread1");

       // KronometreThered thered2= new KronometreThered("thread2");

       // KronometreThered thered3= new KronometreThered("thread3");

        thered1.start();
       // thered2.start();
       // thered3.start();
    }
}
