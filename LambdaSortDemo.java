import java.util.*;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 55000));
        products.add(new Product("Headphones", 2500));
        products.add(new Product("Smartphone", 30000));
        products.add(new Product("Keyboard", 1200));
        products.add(new Product("Mouse", 800));

        System.out.println("Original List:");
        products.forEach(System.out::println);

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("\nSorted by Price:");
        products.forEach(System.out::println);

        // Sort by name
        products.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        System.out.println("\nSorted by Name:");
        products.forEach(System.out::println);
    }
}
