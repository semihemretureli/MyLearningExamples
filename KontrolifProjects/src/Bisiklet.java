public class Bisiklet {
    Insan binmisInsan ;

    public Bisiklet() {
        this.binmisInsan = null;
    }

    public Bisiklet(Insan gelenInsan) {
        this.binmisInsan = gelenInsan;
    }

    public void bin(Insan gelenInsan) {


        if (binmisInsan == null) {
            binmisInsan = gelenInsan;
            System.out.println(binmisInsan.getIsim()
                    + " başarıyla bindi.");
        }
        else
        {
            System.out.println("Zaten " + binmisInsan.getIsim()
                    + " binmiş!");
            System.out.println(gelenInsan.getIsim()+ " hoopp birader bisiklet dolu");
        }
    }

    public void in()
    {
        if ( binmisInsan == null)
        {
            System.out.println("zaten bisiklet boş");
        }
        else
        {
            binmisInsan = null;
            System.out.println("bisiklet şimdi boşaldı.");
        }
    }

    public void bin(Insan i1, Insan i2) {
        System.out.println(i1.getIsim()+", "+i2.getIsim()+" sıraynan gelin gardaş");
    }
}

