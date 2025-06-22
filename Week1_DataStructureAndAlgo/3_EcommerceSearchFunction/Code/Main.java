public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Notebook", "Stationery"),
            new Product(104, "Smartphone", "Electronics"),
            new Product(105, "Tablet", "Electronics")
        };

        // Linear search
        Product result1 = SearchService.linearSearch(products, "Notebook");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Binary search
        Product result2 = SearchService.binarySearch(products, "Notebook");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
