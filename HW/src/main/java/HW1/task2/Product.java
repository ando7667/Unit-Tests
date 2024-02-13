package HW1.task2;

public class Product {
    private String title;
    private Integer cost;

    public Product(String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.cost;
    }
}