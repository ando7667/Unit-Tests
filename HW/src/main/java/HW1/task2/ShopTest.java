package HW1.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShopTest {
    Shop shop;
    List<Product> products;
    @BeforeEach
    void prepareData() {
        products = new ArrayList<>();
        products.add(new Product("Молоко", 120));
        products.add(new Product("Хлеб", 55));
        products.add(new Product("Масло", 250));
        products.add(new Product("Сметана", 75));
        shop = new Shop(products);
    }

    @Test
    void getProductsCountTest() {
        assertThat(shop.getProducts()).hasSize(4);
    }

    @Test
    void getProductsListTest() {
        assertThat(shop.getProducts()).isEqualTo(products);
    }

    @Test
    void sortProductsByPriceTest() {
        assertThat(shop.sortProductsByPrice().toString())
                .isEqualTo("[Хлеб - 55, Сметана - 75, Молоко - 120, Масло - 250]");
    }

    @Test
    void getMostExpensiveProductTest() {
        assertThat(shop.getMostExpensiveProduct().toString()).isEqualTo("Масло - 250");
    }
}