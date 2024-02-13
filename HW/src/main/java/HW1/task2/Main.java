package HW1.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Молоко", 120));
        products.add(new Product("Хлеб", 55));
        products.add(new Product("Масло", 250));
        products.add(new Product("Сметана", 75));
        Shop shop = new Shop(products);
        System.out.println("Shop: " + shop.getProducts());
        System.out.println("Продукты отсортированы по стоимости: " + shop.sortProductsByPrice());
        System.out.println("Самый дорогой продукт: " + shop.getMostExpensiveProduct());
    }
}