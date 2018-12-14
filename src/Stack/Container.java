/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author feli8871
 */
public class Container {
    private int id;
    private String name;
    private static int nextid=1001;
    
    public Container(){
        id=nextid++;
        name="N/A";
}

    public void unbook() {
        this.name="N/A";
    }

    public void book(String n) {
        this.name = n;
  
    }

    @Override
    public String toString() {
        return "Container{" + "id=" + id + ", name=" + name + '}';
    }

    
    
    
    
}
