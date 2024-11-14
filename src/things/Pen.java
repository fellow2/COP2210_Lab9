package things;

import java.util.Random;

public class Pen {
    private String color;
    private double price;

    Random rndGen = new Random();

    public Pen(String color, double price){
        this.color = color;
        this.price = rndGen.nextDouble(0, 2);
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("Type-> Pen-> \t Color:%7s \t\t Price: %.2f\n", color, price);
    }
}
