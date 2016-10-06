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
class Student {
    /**
* 
*/
    String name;
    String course;
    String id;
    String age;
    String DOB;

    Student(String Sname, String idno, String cCode, String Sage, String SDOB) { //creates objects//
        this.name = Sname;
        this.id = idno;
        this.course = cCode;
        this.age = Sage;
        this.DOB = SDOB;
        
    }
       
    public String getUsername()
    {
        return name + age;
    }

}

