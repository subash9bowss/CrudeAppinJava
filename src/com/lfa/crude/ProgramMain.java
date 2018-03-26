/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.crude;

import com.lfa.crude.entity.Department;
import java.util.Scanner;
import com.lfa.crude.DAOImpl.DepartmentDAOImpl;
import com.lfa.crude.controller.DepartmentController;

/**
 *
 * @author Real
 */
public class ProgramMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DepartmentController depC = new DepartmentController(input);
        DepartmentDAOImpl departmentDAO = new DepartmentDAOImpl();

        while (true) {

            depC.process();;

        }
    }
}
