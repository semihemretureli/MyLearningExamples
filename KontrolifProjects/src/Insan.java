public class Insan {
    private int yas;
    private String isim;

    public Insan()
    {
        setYas(-1);
        setIsim("isimsiz");
    }


    public Insan(int yas, String isim) {
        this.yas = yas;
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
