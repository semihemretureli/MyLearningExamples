public class ifKontrolifadesi {
    public static void main(String[] args)
    {
        Insan i1 = new Insan(25, "Semih");
        Insan i2 = new Insan(24,"Merve");

        Bisiklet b1 = new Bisiklet();

        b1.in();

        b1.bin(i1);
        b1.in();
        b1.bin(i1);
        b1.bin(i2);
        b1.in();
        b1.bin(i2);
        b1.bin(i1,i2);



    }

}