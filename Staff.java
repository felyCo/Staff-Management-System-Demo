/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public abstract class Staff {
    
    private int staffNo;
    private String name;
    private String department;
    private boolean working;
    
    public Staff(int staffNo,String name,String department,boolean working){
        super();
        this.staffNo = staffNo;
        this.name = name;
        this.department = department;
        this.working = working;
    }
    
    public abstract void performDuties();
    
    
    public String toString(){
   return "Staff [staffNo=" + staffNo + ", name=" + name + ", department=" + department + ", working=" +working+ "]";
     
 }   
    
}
