public class overiding {
    public static void main(String[] args) {
       BaseKrediManeger[] krediManegers = new BaseKrediManeger[]
               {new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManeger()};
       for (BaseKrediManeger krediManeger :krediManegers){
           System.out.println(krediManeger.hesapla(1000));
       }
    }
}
