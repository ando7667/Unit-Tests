package HW1.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> sortProductsByPrice() {
        this.products.sort(Comparator.comparing(Product::getCost));
        return this.products;
    }

    public Product getMostExpensiveProduct() {
        return Collections.max(this.products, Comparator.comparingInt(Product::getCost));
    }
    @Override
    public String toString() {
        return "Shop=" + this.products;
    }
}