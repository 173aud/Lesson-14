package Queue;

public class Call {
    private String name;
    private int id;
    private static int nextid=1;
    
    public Call(String n){
        name=n;
        id=nextid++;
    }

    @Override
    public String toString() {
        return "Call{" + "name=" + name + ", id=" + id + '}';
    }
    
    
    
    
}
