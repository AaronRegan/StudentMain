/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuigalway.studentmain;

/**
 *
 * @author Aaron
 */
public class Student {
    /**
* 
*/
    public String name;
    public String course;
    public String id;
    public String age;
    public String DOB;

    public Student(String Sname, String idno, String cCode, String Sage, String SDOB) { //creates objects//
        this.name = Sname;
        this.id = idno;
        this.course = cCode;
        this.age = Sage;
        this.DOB = SDOB;
        
    }
       
    public String getStudentCourse()
    {
        return "\n"+name +" "+ id +" "+ course ;
    }
    
    public String getUsername()
    {
        return name + age;
    }

}

