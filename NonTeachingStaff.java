/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class NonTeachingStaff extends Staff{
    
    public NonTeachingStaff(int staffNo, String name, String department, boolean working) {
        super(staffNo, name, department, working);
    }
    
     public void cleaning(){
        System.out.println("Cleaning the compound...");
    }
    
    public void cooking(){
        System.out.println("Preparing food for students and teachers....");
    }
    
    public void accounting(){
        System.out.println("Handling financial matters....");
    }
    
    public void security(){
        System.out.println("Maintaining law and order in the school....");
    }
    
    public void driver(){
        System.out.println("Driving school vehicles....");
    }

    @Override
    public void performDuties() {
       cleaning();
       cooking();
       accounting();
       security();
       driver();
    }
    
    
}
