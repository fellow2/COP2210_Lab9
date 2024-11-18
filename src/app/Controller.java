//=================================================================================================
// PROGRAMMER: Gabriel Lozano
// PANTHER ID: 6338626
//
// CLASS: COP2210
// SECTION: UO2
// SEMESTER: Fall 2024
// CLASSTIME: 9:30 AM - 12:15 PM
//
// Project: Lab 8
// DUE: 11/10/24
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                                          own and that none of it is the work of any other person.
//===================================================================================================

package app;

import living.Person;
import things.*;

import java.util.Random;

public class Controller {
    public static void main(String[] args){
        yourInfoHeader();

        Random rndGen = new Random();
        Person person = new Person("Mike","Johnson");
        BookBag bookBag = new BookBag(person);
        person.setBookBag(bookBag);

        for(int i = 0; i < 5; i++){
            int areaCode = rndGen.nextInt(100,1000);
            int threeDigit = rndGen.nextInt(100, 1000);
            int fourDigit = rndGen.nextInt(1000, 10000);

            String phoneNumber = "(" + areaCode + ")-" + threeDigit + "-" + fourDigit;
            Phone phone = new Phone(phoneNumber);
            bookBag.getItems().add(phone);

        }

        String[] subjects = {"Math","Chemistry","Economics","CS","Physics","History"};
        for(int i = 0; i < 4; i++){
            int randomIndex = rndGen.nextInt(subjects.length-1);
            String subject = subjects[randomIndex];
            double price = rndGen.nextDouble(50, 201);
            Book book = new Book(subject,price);
            bookBag.getItems().add(book);

        }
        PencilBag pencilBag = new PencilBag();
        bookBag.getItems().add(pencilBag);
        String[] colors = {"Red","Black","Green","Blue"};
        for(int i = 0; i < 5; i++){
            int randomIndex = rndGen.nextInt(colors.length-1);
            String color = colors[randomIndex];
            double price = rndGen.nextDouble(1,5);
            Pen pen = new Pen(color, price);
            pencilBag.getPens().add(pen);
        }

        bookBag.displayItems();

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Total Price of Possessions");
        System.out.println("--------------------------------");
        System.out.printf("Total: $%.2f", person.totalPriceOfPossessions());
    }
    public static void yourInfoHeader(){
        System.out.println("========================================");
        System.out.println("PROGRAMMER: " + "Gabriel Lozano");
        System.out.println("PANTHER ID: " + "6338626");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO2");
        System.out.println("SEMESTER: \t " + "Fall");
        System.out.println("CLASSTIME: \t " + "9:30 AM - 12:30 PM");
        System.out.println();
        System.out.println("Assignment: " + "Lab 9");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU'S academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("=========================================");
        System.out.println();
    }
}
