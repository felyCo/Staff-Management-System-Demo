/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class Teacher extends Staff {
    
    public Teacher(int staffNo, String name, String department, boolean working) {
        super(staffNo, name, department, working);
    }
    
    
    public void teaching(){
        System.out.println("Teaching a unit....");
    }
    
    public void givingExams(){
        System.out.println("Giving examination....");
    }
    
    public void markingExams(){
        System.out.println("Marking examinations....");
    }

    @Override
    public void performDuties() {
        teaching();
        givingExams();
        markingExams();   
    }
    
}
