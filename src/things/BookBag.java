package things;

import living.Person;

import java.util.ArrayList;


public class BookBag {
    private Person owner;
    private ArrayList<Object> items;
    public BookBag(Person owner){
        this.owner = owner;
        items = new ArrayList<>();
    }
    public Person getOwner(){
        return owner;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }
    public ArrayList<Object> getItems(){
        return items;
    }
    public void listItems(){
    }
    public void displayItems(){
        for(Object item: items){
            if(item instanceof Phone){
                ((Phone) item).displayInfo();
            }
            if(item instanceof Book){
                ((Book) item).displayInfo();
            }
            if(item instanceof PencilBag) {
                ((PencilBag) item).displayContains();
            }
            if(item instanceof Person){
                ((Person) item).totalPriceOfPossessions();
            }
        }
    }
}
