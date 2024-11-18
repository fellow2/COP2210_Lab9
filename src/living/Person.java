package living;

import things.Book;
import things.BookBag;
import things.Pen;
import things.Phone;

public class Person {
    private String firstName;
    private String lastName;
    private BookBag bookBag = null;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public BookBag getBookBag(){
        return bookBag;
    }
    public void setBookBag(BookBag bookBag){
        this.bookBag = bookBag;
    }
    public double totalPriceOfPossessions(){
        double totalPrice = 0.0;
       for(Object Person: bookBag.getItems()){
           if(Person instanceof Phone) {
               totalPrice += ((Phone) Person).getPrice();
           }
           if(Person instanceof Pen){
               totalPrice += ((Pen) Person).getPrice();
           }
           if(Person instanceof Book){
               totalPrice += ((Book) Person).getPrice();
           }
       }
       return totalPrice;
    }
}
