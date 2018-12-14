package Queue;

import java.util.*;

public class Club {
    
    public static void main(String[] args) {
        Guest guest1=new Guest("Felix",1);
        Guest guest2=new Guest("Christian",2);
        Guest guest3=new Guest("God",213132313);
        Guest guest4=new Guest("Matthew Mercer",0);
        Guest guest5=new Guest("Martins",5);
        Queue<Guest> line=new PriorityQueue<>(); 
        line.add(guest1);
        
        line.add(guest2);
        
        line.add(guest3);
        
        line.add(guest4);
        
        line.add(guest5);
        // First
        System.out.println(line.peek());
        
        // Removing the first three guests
        System.out.println("\n"+line.remove());
        System.out.println(line.remove());
        System.out.println(line.remove());
    
        // Adding a guest
        line.add(new Guest("RIP",2));
       
        
    }
    
    
    
    
    
    
    
}
