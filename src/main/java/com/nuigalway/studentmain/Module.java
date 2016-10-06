/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuigalway.studentmain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class Module {
    /**
* 
*/
    String modName;
    List<Student> studentL= new ArrayList();
    String modId;

    Module(String moduleName, String moduleID, List moduleStudents) { //creates objects//
        this.modName = moduleName;
        this.modId = moduleID;
        this.studentL = moduleStudents;
        
    }
    
    public String getModule()
    {
        return "Module Name:"+ modName +"/n Module ID:"+ modId + "/n List of Students:"+studentL;
    }
}
