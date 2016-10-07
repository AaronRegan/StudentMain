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
    public ArrayList<Student> studentL;
    public String modId;

    public Module(String moduleName, String moduleID, ArrayList<Student> studentList) { //creates objects//
        this.modName = moduleName;
        this.modId = moduleID;
        this.studentL = studentList;
        
    }
    public String getModule()
    {
        return "Module Name:"+ modName +"\n Module ID:"+ modId + "\n List of Students:"+studentL;
    }
}
