public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Excalibur Laptop", 5000, 5, "siyah");
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Excalibur Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(5); //---> bunları yazmak yerine yukarıdaki gibi parantez içine yazabilirsin (constructor bloğundan set edebiliriz.).

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());
    }
}