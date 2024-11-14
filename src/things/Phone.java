package things;

import java.util.Random;

public class Phone {
    private String number;
    private double price;

    Random rndGen = new Random();

    public Phone(String number){
        this.number = number;
        this.price = rndGen.nextDouble(150, 1451);
    }
    public String getNumber(){
        return number;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("Type-> Phone-> \t\t\t  %13s \t\t\t\t\t\t\t\t Price: %.2f\n", number, price);
    }
}
