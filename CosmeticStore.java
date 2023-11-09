class CosmeticStore {
    private String name;
    private String location;
    private int stockCount;

    public CosmeticStore(String name, String location, int stockCount) {
        this.name = name;
        this.location = location;
        this.stockCount = stockCount;
    }

    public void addProduct(CosmeticProduct product) {
        System.out.println("Додано товар " + product.getName() + " до магазину " + name);
    }

    public void removeProduct(CosmeticProduct product) {
        System.out.println("Видалено товар " + product.getName() + " з магазину " + name);
    }

    public void displayStoreInfo() {
        System.out.println("Магазин косметики: " + name);
        System.out.println("Місце розташування: " + location);
        System.out.println("Кількість товарів в наявності: " + stockCount);
    }
    public String getStoreInfo() {
        return "Назва: " + name + ", Місце розташування: " + location + ", Кількість товарів в наявності: " + stockCount;
    }

    // Перевизначений метод, який приймає різний тип даних (String)
    public void addProduct(String productName) {
        System.out.println("Додано товар " + productName + " до магазину " + name);
    }

    public static void processProductInfo(CosmeticProduct product) {
        System.out.println("Магазин обробив інформацію про товар " + product.getName() + " від бренду " + product.getBrand());
    }


}