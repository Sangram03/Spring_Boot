public class Product {

    // Attributes
    int productId;
    String productName;
    double price;

    // Method to display product details
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Main method
    public static void main(String[] args) {

        // Creating object of Product class
        Product p1 = new Product();

        // Assigning values
        p1.productId = 101;
        p1.productName = "Laptop";
        p1.price = 55000;

        // Displaying product details
        p1.displayProduct();
    }
}