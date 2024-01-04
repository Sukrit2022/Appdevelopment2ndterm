package models;

public class tshirts {
        // Fields
        private String name;
        private int productCode;
        private double price;
        private String brand;
        private String description;
        private String[] sizes;

        // Constructor
        public tshirts(String name, int productCode, double price, String brand, String description, String[] sizes) {
            this.name = name;
            this.productCode = productCode;
            this.price = price;
            this.brand = brand;
            this.description = description;
            this.sizes = sizes;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getProductCode() {
            return productCode;
        }

        public void setProductCode(int productCode) {
            this.productCode = productCode;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String[] getSizes() {
            return sizes;
        }

        public void setSizes(String[] sizes) {
            this.sizes = sizes;
        }

        // Method to describe the t-shirt
        public void describeTShirt() {
            System.out.println("Item name: " + getName());
            System.out.println("Description: " + getDescription());
            System.out.println("Product code: " + getProductCode());
            System.out.println("Brand: " + getBrand());
            System.out.println("Price: " + getPrice());
            System.out.print("Sizes: [");
            for (String size : getSizes()) {
                System.out.print(size + " ");
            }
            System.out.println("]");
            System.out.println();
        }

        // Demonstrate the T-shirt class
        public static void main(String[] args) {
            // Create multiple T-shirt objects
            tshirts gorkhaliBatman = new tshirts("Gorkhali Batman", 572, 1235, "Karuna",
                    "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});
            tshirts buddhaXScott = new tshirts("Travis Scott X Buddha tshirt", 681, 1780, "COllabnpl",
                    "Show your pride with the rapper Scott and peace promoter Buddha of Nepal", new String[]{"Small", "Medium", "Large"});

            // Display T-shirt information
            System.out.println("T-Shirt Information:");
            gorkhaliBatman.describeTShirt();
            buddhaXScott.describeTShirt();
        }
    }


