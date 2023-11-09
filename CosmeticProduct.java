class CosmeticProduct {
    private String name;
    private double price;
    private String brand;

    public CosmeticProduct(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public CosmeticProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.brand = "Невідомий бренд";
    }

    public CosmeticProduct(String name) {
        this.name = name;
        this.price = 0.0;
        this.brand = "Невідомий бренд";
    }

    public CosmeticProduct() {
        this.name = "Без назви";
        this.price = 0.0;
        this.brand = "Невідомий бренд";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getProductInfo() {
        return "Назва: " + name + ", Бренд: " + brand + ", Ціна: " + price + " грн";
    }


    // Перевизначений метод, який приймає різний тип даних (int)
    public void use(int times) {
        System.out.println("Ви використали товар " + name + " " + times + " разів.");
    }
    // Перевантажений статичний метод змінює логіку, виводячи іншу інформацію
    public static void processProductInfo(CosmeticProduct product) {
        System.out.println("Інформація про товар: " + product.getName() + ", Бренд: " + product.getBrand());
    }

    public void useAnotherProduct(CosmeticProduct anotherProduct) {

        System.out.println("Ціна іншого продукту: " + anotherProduct.getPrice());
        System.out.println("Бренд іншого продукту: " + anotherProduct.getBrand());
    }

    public CosmeticProduct withNewPrice(double newPrice) {
        // Метод посилкового типу, який повертає новий об'єкт зі зміненою ціною
        return new CosmeticProduct(name, newPrice, brand);
    }

    public void printStringRecursively(String str, int count) {
        if (count <= 0) {
            // Умова виходу з рекурсії
            return;
        }

        System.out.println(str);

        // Рекурсивний виклик методу зі зменшенням лічильника
        printStringRecursively(str, count - 1);
    }
    public void reducePriceRecursively() {
        if (price > 10.0) {
            // Логіка рекурсивного методу: зменшення ціни і виведення інформації про товар
            System.out.println("Зменшення ціни товару " + name + " до " + price + " грн");
            price -= 5.0;
            reducePriceRecursively(); // Рекурсивний виклик
        } else {
            System.out.println("Ціна товару " + name + " вже не може бути зменшена.");
        }

    }
}