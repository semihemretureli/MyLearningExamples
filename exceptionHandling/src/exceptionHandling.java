public class exceptionHandling {

    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Hata oluştu");
        }finally {
            System.out.println("ben her türlü çalışırım");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }

    }
}
