/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuigalway.studentmain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class StudentTest {
    @Test
            public void getUsernameTest()
            {
            Student student = new Student("Aaron", "13446668", "4BP1", "21", "11/01/1995");
            String Test = student.getUsername();

            assertEquals("Aaron21",Test);
            }
}
