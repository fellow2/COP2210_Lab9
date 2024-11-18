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
        for(Object PencilBag: pens){
            if(PencilBag instanceof Pen) {
                ((Pen) PencilBag).displayInfo();
            }
        }
    }
}
