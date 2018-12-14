package Queue;

import java.util.*;

public class Radio {

    public static void main(String[] args) {
        Queue<Call> phone=new ArrayDeque<>();
    
        // Three calls being made
        
        System.out.println(phone.add(new Call("Vax")));
        System.out.println(phone.add(new Call("Caleb")));
        System.out.println(phone.add(new Call("Liam")));

        // Removing the first call
        System.out.println(phone.remove());
        
        // Add two more calls
        System.out.println(new Call("Pike"));
        System.out.println(new Call("Yasha"));
        
        // Total number of calls
        System.out.println(phone.size());
        
        // Checking the next call
        System.out.println(phone.peek());
        
        // Removing the top call
        System.out.println(phone.remove());
        
        // Removing all callers 
        while(!phone.isEmpty()){System.out.println(phone.remove());}
        
        
        
    }
    
}
