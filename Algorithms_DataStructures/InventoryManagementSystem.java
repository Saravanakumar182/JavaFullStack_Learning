package Algorithms_DataStructures;

import java.util.*;

class Product{
    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int id , String name , double price ,int quantity){
        productId = id;
        productName = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Inventory{
    Map<Integer,Product> products = new HashMap<>();

    public void add(int id , String name , double price , int quantity){
        Product newProd = new Product(id, name, price, quantity);

        products.put(id,newProd);
        System.out.println("added successfully");
    }
    public void remove (int id){

        if(products.containsKey(id)){
            products.remove(id);
            System.out.println("removed successfully");
        }else{
            System.out.println("Product not found");
        }
    }
    public void update (int id , String name){
        if(products.containsKey(id)){
            products.get(id).productName = name;
            System.out.println("Updated successfully");
        }else {
            System.out.println("Product not found");
        }
    }
    public void update (int id , double pric){
        if(products.containsKey(id)){
            products.get(id).price = pric;
            System.out.println("Updated successfully");
        }else {
            System.out.println("Product not found");
        }
    }
    public void update (int id , int quantit){
        if(products.containsKey(id)){
            products.get(id).quantity = quantit;
            System.out.println("Updated successfully");
        }else {
            System.out.println("Product not found");
        }
    }
    public void updateAll(int id, String name, double price, int quantity) {
        if (products.containsKey(id)) {
            Product prod = products.get(id);
            prod.productName = name;
            prod.price = price;
            prod.quantity = quantity;
            System.out.println("All details updated successfully");
        } else {
            System.out.println("Product not found");
        }
    }
    
    public void display(){
        for(Product prod : products.values()){
            System.out.println(prod.productName+" "+prod.price+" "+prod.quantity);
        }
    }
    
}

public class InventoryManagementSystem{
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product Name");
            System.out.println("4. Update Product Price");
            System.out.println("5. Update Product Quantity");
            System.out.println("6. Display All products");
            System.out.println("7. Update All details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();
                    inventory.add(id, name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    inventory.remove(removeId);
                    break;
                case 3:
                    System.out.print("Enter Product ID to update name: ");
                    int updateNameId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter new Product Name: ");
                    String newName = sc.nextLine();
                    inventory.update(updateNameId, newName);
                    break;
                case 4:
                    System.out.print("Enter Product ID to update price: ");
                    int updatePriceId = sc.nextInt();
                    System.out.print("Enter new Product Price: ");
                    double newPrice = sc.nextDouble();
                    inventory.update(updatePriceId, newPrice);
                    break;
                case 5:
                    System.out.print("Enter Product ID to update quantity: ");
                    int updateQuantityId = sc.nextInt();
                    System.out.print("Enter new Product Quantity: ");
                    int newQuantity = sc.nextInt();
                    inventory.update(updateQuantityId, newQuantity);
                    break;
                case 6:
                    System.out.println("Products");
                    inventory.display();
                    break;
                case 7:
                    System.out.print("Enter Product ID to update all details: ");
                    int updateAllId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Product Name: ");
                    String updateAllName = sc.nextLine();
                    System.out.print("Enter new Product Price: ");
                    double updateAllPrice = sc.nextDouble();
                    System.out.print("Enter new Product Quantity: ");
                    int updateAllQuantity = sc.nextInt();
                    inventory.updateAll(updateAllId, updateAllName, updateAllPrice, updateAllQuantity);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}