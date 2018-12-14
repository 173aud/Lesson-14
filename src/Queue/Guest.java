package Queue;

import java.sql.*;
import java.time.LocalDateTime;

public class Guest implements Comparable<Guest>{
    private String name;
    private int priority;
    private LocalDateTime time;

        
    public Guest(String n, int p){
        name=n;
        priority=p;
        time=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Guest{" + "name=" + name + ", priority=" + priority + ", time=" + time + '}';
    }

    @Override
    public int compareTo(Guest t){
        Guest other=t;
        if(priority==other.priority) return time.compareTo(other.time);
        else return priority-other.priority;
            
    }
    
    
    
    
    
}
