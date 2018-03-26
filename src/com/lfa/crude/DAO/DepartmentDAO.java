/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.crude.DAO;
import com.lfa.crude.entity.Department;
import java.util.List;

/**
 *
 * @author Real
 */
public interface DepartmentDAO {
    boolean insert(Department d);
    List<Department> getll();
    Department getById(int id);
    boolean delete(int id);
    
}
