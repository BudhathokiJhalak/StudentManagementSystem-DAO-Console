/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms.dao;

import com.leapfrog.sms.entity.Student;
import java.util.List;

/**
 *
 * @author zak
 */
public interface StudentDAO {
    boolean insert(Student student);
    boolean delete(int id);
    List<Student> showAll();
    List<Student> search(String param);
    Student searchById(int id);
    
}
