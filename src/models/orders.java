package models;

public class orders {
        // Fields
        private String name;
        private String phoneNumber;
        private String[] items;
        private double[] price;

        // Constructor
        public orders(String name, String phoneNumber, String[] items, double[] price) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.items = items;
            this.price = price;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String[] getItems() {
            return items;
        }

        public void setItems(String[] items) {
            this.items = items;
        }

        public double[] getPrice() {
            return price;
        }

        public void setPrice(double[] price) {
            this.price = price;
        }

        // Method to print the bill with VAT and total price
        public void printBill() {
            double total = 0;
            System.out.println("Order details:");
            System.out.println("   Name: " + getName());
            System.out.println("   Phone number: " + getPhoneNumber());
            System.out.print("   Items: [");
            for (String item : getItems()) {
                System.out.print(item + " ");
            }
            System.out.println("]");

            System.out.print("   Price: [");
            for (double itemPrice : getPrice()) {
                total += itemPrice;
                System.out.print(itemPrice + " ");
            }
            total += total * 0.13; // Adding VAT
            System.out.println("]");

            System.out.println("Total Price (including VAT 13%): " + total);
        }

        // Demonstrate the Order class
        public static void main(String[] args) {
            // Create multiple Order objects
            orders order1 = new orders("Gopal Sharma", "0486756465", new String[]{"572", "681"}, new double[]{1235, 1780});
            orders order2 = new orders("Chabi Prasad ", "9880191910", new String[]{"572", "681"}, new double[]{1235, 1780});
            orders order3 = new orders("Ubey Bishwokarma", "9744456601", new String[]{"681"}, new double[]{1780});

            // Print the bill
            order1.printBill();
            order2.printBill();
            order3.printBill();
        }
    }
