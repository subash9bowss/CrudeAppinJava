/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.crude.controller;

import com.lfa.crude.entity.Department;
import com.lfa.crude.DAOImpl.DepartmentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Real
 */
public class DepartmentController {

    Scanner input;
    
    DepartmentDAOImpl departmentDAO = new DepartmentDAOImpl();

    public DepartmentController(Scanner x) {
        input = x;
    }

    public void menu() {
        System.out.println("============================");
        System.out.println("1. Add departments");
        System.out.println("2. Show all departments");
        System.out.println("3. Search By id");
        System.out.println("4. Delete department by id");
        System.out.println("5. Exit");
        System.out.println("=============================");
        System.out.println("Enter your choice");

    }

    public void add() {

        Department department = new Department();
        System.out.println("Enter the department id");
        department.setId(input.nextInt());
        System.out.println("Enter the department name");
        department.setName(input.next());
        System.out.println("Enter the code");
        department.setCode(input.next());
        System.out.println("Enter the status");
        department.setStatus(input.nextBoolean());
        departmentDAO.insert(department);

    }

    public void show() {

        for (Department de : departmentDAO.getll()) {
            System.out.println(de);
        }

    }

    public void search() {

        System.out.println("Enter the id");
        Department deee = departmentDAO.getById(input.nextInt());
        if (deee != null) {
            System.out.println(deee);

        }

    }

    public void delete() {

        System.out.println("Enter the id");
        departmentDAO.delete(input.nextInt());
        System.out.println("Deleted");

    }

    public void exit() {

        System.exit(0);

    }

    public void process() {
        menu();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                show();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
            case 5:
                exit();
        }

    }
}
