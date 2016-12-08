/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms.dao.impl;

import com.leapfrog.sms.dao.StudentDAO;
import com.leapfrog.sms.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zak
 */
public class StudentDAOImpl implements StudentDAO {

    List<Student> stdList = new ArrayList<>();

    @Override
    public boolean insert(Student student) {
        return stdList.add(student);
    }

    @Override
    public boolean delete(int id) {
        for (Student s : stdList) {
            if(s.getId()==id){
                stdList.remove(s);   
            }
        }
        return true;
    }

    @Override
    public List<Student> showAll() {
        return stdList;
    }

    @Override
    public List<Student> search(String param) {
        List<Student> sList = new ArrayList<>();
        for (Student s : stdList) {
            if(s.getFirstName().equalsIgnoreCase(param)||s.getLastName().equalsIgnoreCase(param)||s.getEmail().equalsIgnoreCase(param)||s.getContactNo().equalsIgnoreCase(param)||s.getAddress().equalsIgnoreCase(param)){
                sList.add(s);
            }
        }
        return sList;
    }

    @Override
    public Student searchById(int id) {
        List<Student> sList = new ArrayList<>();
        for (Student s : stdList) {
            if(s.getId()==id){
                sList.add(s);
            }
        }
        return (Student) sList;
    }

}
