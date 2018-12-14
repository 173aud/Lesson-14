package Stack;
import java.util.*;
public class Tire_Sale {

    public static void main(String[] args) {
        Stack<Tire> pole=new Stack();
        // The more recent variation of this includes the deque (double ended queue) command
        Deque<Tire> pole2=new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            pole.push(new Tire("Goodyear"));
        }
        
        System.out.println("Two tires sold");
        System.out.println("Sold Tire: "+pole.pop());
        System.out.println("Sold Tire: "+pole.pop());
        
        System.out.println("Addiing two Cooper Tires:");
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        
        // Removing four tires
        
        for (int i = 0; i < 4; i++) {
            pole.pop();
        }
        
        // Current number of items
        System.out.println(pole.size());

        // Removing all tires
        
        while(pole.empty()==false){
            System.out.println("Removing"+pole.pop());
        }
        
        System.out.println(pole.size());
        
    }
    
}
