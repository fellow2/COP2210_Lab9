package things;

import java.util.Random;

public class Pen {
    private String color;
    private double price;

    Random rndGen = new Random();

    public Pen(String color, double price){
        this.color = color;
        this.price = rndGen.nextDouble(1, 4.01);
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("Type-> Pen-> \t\t\t  Color: %-7s \t\t\t\t\t\t\t\t Price:  %6.2f\n", color, price);
    }
}
