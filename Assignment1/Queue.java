package Assignment1;
import java.util.ArrayList;

public class Queue {
    ArrayList<Object> arr = new ArrayList<Object>();

    public void push(Object obj){
        arr.add(arr.size(), obj);
    }

    public void pop(){
        arr.remove(0);
    }
}