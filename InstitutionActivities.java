/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class InstitutionActivities {
    
    public static void main(String args []){
    
    
    SchoolManagement SMDirector = new SchoolManagement();
    
    Staff Kaunda = new Principal(123,"Kaunda","Administation", true);
    SMDirector.callUpon(Kaunda);
    
    Staff Puonj = new Teacher(1234,"Japuonj","Teaching", true);
    SMDirector.callUpon(Puonj);
    
    Staff Jotedo = new NonTeachingStaff(1235,"Jotedo","Non-Teaching", true);
    SMDirector.callUpon(Jotedo);
    }
    
}
