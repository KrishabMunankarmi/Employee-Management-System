/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employeesystem.controller.algorithms;

import com.employeesystem.model.EmployeeModel;
import java.util.List;

/**
* @author Krishab Munankarmi
* LMU ID: 23048630
 */
public class BinarySearch {
    /**
     * Searching for the details of an employee with Full name using Binary Search
     * @param searchValue Full name that is being search for
     * @param employeeList List of Employees
     * @param left Left side of the index
     * @param right Right side of the index
     * @return The searched value
     */
    public EmployeeModel searchByName(String searchValue, List<EmployeeModel> employeeList, int left, int right) {
        //Input validation
        if (searchValue == null || employeeList == null || employeeList.isEmpty()) {
            return null;
        }
        
        //Base case for recursion
        if (right < left) {
            return null;
        }
        
        int mid = left + (right - left) / 2;
        
        //Prevent IndexOutOfBoundsException
        if (mid >= employeeList.size()) {
            return null;
        }
        
        int comparison = searchValue.compareToIgnoreCase(employeeList.get(mid).getFullName());
        if (comparison == 0) {
            return employeeList.get(mid);
        } else if (comparison < 0) {
            return searchByName(searchValue, employeeList, left, mid - 1);
        } else {
            return searchByName(searchValue, employeeList, mid + 1, right);
        }
    }
}