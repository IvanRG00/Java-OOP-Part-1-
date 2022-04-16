/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
       

        System.out.println("Add 2 Tvs: ");
        AddTVs(products, scanner);

        System.out.println("Add 1 MP3 player");
        AddMP3Player(products, scanner);

        System.out.println("Add 2 Books");
        AddBook(products, scanner);

        DisplayProduct(products);
    }

    private static void AddTVs(ArrayList<Product> products, Scanner scanner) {
        for (int i = 0; i < 2; i++) {
            System.out.print("size: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            System.out.print("manufacturer: ");
            String manufacturerInput = scanner.nextLine();
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setName(manufacturerInput);

            System.out.print("price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            TV tv = new TV();
            tv.setSize(size);
            tv.setManufacturer(manufacturer);
            tv.setPrice(price);

            products.add(tv);
        }
        }
    private static void AddMP3Player(ArrayList<Product> products, Scanner scanner){
            
           System.out.println("Colour ?");
            Colour color=new Colour();
            String colour=scanner.nextLine();
            color.setName(colour);
            
            MP3Player mp3=new MP3Player();
            System.out.println("Manafacturer ? :");
            Manufacturer man=new Manufacturer();
            String producer=scanner.nextLine();
            man.setName(producer);
            
            System.out.println("Price");
            double price =scanner.nextDouble();
             mp3.setPrice(price);
             scanner.nextLine();
            products.add(mp3);  
    }
private static void AddBook(ArrayList<Product> products, Scanner scanner){
    for (int i = 0; i < 2; i++) {
    Book book =new Book();
    Publisher pub=new Publisher();
    System.out.println("Book Publisher ?");
    String publisher=scanner.nextLine();
    pub.setName(publisher);
    
    
    System.out.println("Year of publblishment ");
    int year=scanner.nextInt();
    book.setYearPublished(year);
    System.out.println("Price of book");
    double price=scanner.nextDouble();
    scanner.nextLine();
    book.setPrice(price);
    products.add(book);
    }
}
private static void DisplayProduct(ArrayList<Product> products){
       double totalDiscount=0 ; 
       for (int i = 0; i < products.size(); i++) {
            System.out.println(
                    "Item"+(i+1)+":"+
                    "Type="+products.get(i).getClass().getSimpleName()+","
                    +
                    "Regular Price="+products.get(i).getPrice()+","
                    + "Sale price="+products.get(i).getSalePrice());
       totalDiscount+=products.get(i).getPrice()- products.get(i).getSalePrice();
        }
       
        System.out.printf("Total discount = %.2f%n", totalDiscount);
        
    }
}



    



