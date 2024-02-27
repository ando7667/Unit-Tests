package HW3;

public class Main {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(10));
        System.out.println(isNumberInInterval(21));
    }
    public static boolean isEvenNumber(int x) {
        return x % 2 == 0;
    }

    public static boolean isNumberInInterval(int x) {
        return x > 25 && x < 100;
    }
}
