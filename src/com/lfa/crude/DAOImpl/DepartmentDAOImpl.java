/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.crude.DAOImpl;

import com.lfa.crude.DAO.DepartmentDAO;
import com.lfa.crude.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Real
 */
public class DepartmentDAOImpl implements DepartmentDAO {

    List<Department> departmentList = new ArrayList<>();

    @Override
    public boolean insert(Department d) {
         departmentList.add(d);
         
         return true;

    }

    @Override
    public List<Department> getll() {
        return departmentList;
    }

    @Override
    public Department getById(int id) {
        for (Department e : departmentList) {
            if (e.getId() == id) {
                return e;
            }

        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        Department depart = getById(id);

        if (depart != null) {
            departmentList.remove(depart);
            return true;
        }return false;
    }
}
