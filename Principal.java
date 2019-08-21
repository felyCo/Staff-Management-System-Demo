/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class Principal extends Staff{
    
    public Principal(int staffNo, String name, String department, boolean working) {
        super(staffNo, name, department, working);
    }
    
     public void cordination(){
        System.out.println("Cordinating the school activities...");
    }
    
    public void organizingAndChairingMeeting(){
        System.out.println("Chairing PTA and teachers meetings....");
    }
    
    public void administation(){
        System.out.println("Representing the school on administrative matters....");
    }

    @Override
    public void performDuties() {
        cordination();
        organizingAndChairingMeeting();
        administation();
    }
    
    
}
