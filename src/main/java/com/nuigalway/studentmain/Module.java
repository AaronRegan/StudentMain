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
    public String modName;
    public List<Student> studentL= new ArrayList();
    public String modId;

    public void setModule(String moduleName, String moduleID, List moduleStudents) { //creates objects//
        this.modName = moduleName;
        this.modId = moduleID;
        this.studentL = moduleStudents;  
    }
    
    public String getModule()
    {
        return "Module Name:"+ modName +"\n Module ID:"+ modId;
    }
    @Override
    public String toString()
    {
        return "\n List of Students:"+studentL;
    }
}
