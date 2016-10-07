/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuigalway.studentmain;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Aaron
 */
public class Course {
    /**
* 
*/
    String corName;
    List<Module> moduleL = new ArrayList();
    DateTime acStart;
    DateTime acEnd;

    public Course(String courseName, List moduleList, DateTime startDate, DateTime endDate) { //creates objects//
        this.corName = courseName;
        this.moduleL = moduleList;
        this.acStart = startDate;
        this.acEnd = endDate;
    }
    public String getCourse()
    {
        return "Course Name:"+ corName +"\n StartDate:"+ acStart + "\n End Date:"+acEnd + "\n List of Modules"+ moduleL;
    }
}
