package things;

import java.util.ArrayList;

public class PencilBag {
    public PencilBag(){
        pens = new ArrayList<>();
    }
    private  ArrayList<Pen> pens;

    public ArrayList<Pen> getPens(){
        return pens;
    }
    public void displayContains(){
        for(Object pens: pens){
            if(pens instanceof Pen) {
                ((Pen) pens).displayInfo();
            }
        }
    }
}
