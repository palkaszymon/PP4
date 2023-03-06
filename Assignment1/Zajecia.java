package Assignment1;
import java.util.ArrayList;

public class Zajecia {
    ArrayList<Student> arr = new ArrayList<Student>();

    public void zapiszStudena(Student student){
        if(this.arr.size()<10){
            this.arr.add(student);
        }
        else{
            System.out.println("Can't add more than 10 students");
        }
    }
}