package Queue;

import java.time.LocalDateTime;

public class Patient implements Comparable<Patient>{
   
    private String name;
    private int severity;
    private int id;
    private int next=0;
        
    public Patient(String n, int s){
        name=n;
        severity=s;
        id=next++;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", severity=" + severity + ", id=" + id + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    
    
    @Override
    public int compareTo(Patient p){
        if(severity==p.severity) return p.id-id;
        else return severity-p.severity;
            
    }

    
}



