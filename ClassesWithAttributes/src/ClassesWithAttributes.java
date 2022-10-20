public class ClassesWithAttributes {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Monster Laptop",20500,3,"Siyah");
        product.setName();
        product.setId(1);
        product.setDescription("Monster Laptop ");
        product.setPrice(20500);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}
