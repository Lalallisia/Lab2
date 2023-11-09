class Customer {
    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void purchaseProduct(CosmeticProduct product) {
        System.out.println(name + " придбав товар " + product.getName() + " від бренду " + product.getBrand() + " за " + product.getPrice() + " грн");
    }

    public void returnProduct(CosmeticProduct product) {
        System.out.println(name + " повернув товар " + product.getName() + " до магазину");
    }

    public void displayCustomerInfo() {
        System.out.println("Покупець: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Email: " + email);
    }

    // Перевизначений метод, який приймає різний тип даних (double)
    public void purchaseProduct(double amount) {
        System.out.println(name + " придбав товар на суму " + amount + " грн.");
    }

    public static void processProductInfo(Customer customer) {
        System.out.println("Покупець " + customer.name + " обробив інформацію про товар.");
    }
}