package things;

import java.util.Random;

public class Book {
    private String subject;
    private double price;

    Random rndGen = new Random();

    public Book(String subject, double price){
        this.subject = subject;
        this.price = rndGen.nextDouble(50, 201);
    }
    public String getSubject(){
        return subject;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("Type-> Book-> \t\t\t  Subject: %-10s \t\t\t\t\t\t\t Price:  %6.2f\n", subject, price);
    }
}

