public class Main {
    public static void main(String[] args) {
        CosmeticStore store = new CosmeticStore("Beauty Shop", "Центральна вулиця, 123", 100);
        CosmeticProduct lipstick = new CosmeticProduct("Помада", 25.0, "Maybelline");
        Customer customer = new Customer("Анна", 30, "anna@example.com");

        store.addProduct(lipstick);

        CosmeticProduct.processProductInfo(lipstick);
        CosmeticStore.processProductInfo(lipstick);

        customer.purchaseProduct(lipstick);
        customer.returnProduct(lipstick);
        Customer.processProductInfo(customer);

        // Виклик перевантажених методів
        lipstick.use(2); // Виклик методу з int параметром
        customer.purchaseProduct(50.0); // Виклик методу з double параметром
        store.addProduct("Шампунь Head & Shoulders"); // Виклик методу з різним типом даних (String)

        CosmeticProduct product1 = new CosmeticProduct("Помада", 25.0, "Maybelline");
        CosmeticProduct product2 = new CosmeticProduct("Туш для вій");
        CosmeticProduct product3 = new CosmeticProduct("Тональний крем");
        CosmeticProduct product4 = new CosmeticProduct();

        CosmeticProduct newProduct = product1.withNewPrice(30.0);
        System.out.println("Інформація про оригінальний продукт: " + product1.getProductInfo());
        System.out.println("Інформація про новий продукт: " + newProduct.getProductInfo());

        product1.useAnotherProduct(product2); // Виклик методу з передачею іншого об'єкта

        product1.printStringRecursively("Рекурсивний вивід", 1);

        product1.reducePriceRecursively();






    }
}
