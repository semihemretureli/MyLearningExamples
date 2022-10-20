import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,String>sozluk=new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        for (String item: sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }
        sozluk.remove("table");
        sozluk.clear();
        try {
            System.out.println(sozluk.get("book").trim());
        } catch (Exception exception){
            System.out.println("Hata oluştu");

        } finally {
            System.out.println(sozluk.get("table"));
        }


    }


}
