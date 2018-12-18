package Stack;

public class Tire {
    private String name;
    private String id;
    private static String nextid=1;
    
    public Tire(String n){
        name=n;
        id=nextid;
        nextid++;
    }

    @Override
    public String toString() {
        return "Tire{" + "name=" + name + ", id=" + id + '}';
    }
    //
    
    
    
}
