/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employeesystem.controller.algorithms;

import com.employeesystem.model.EmployeeModel;
import java.util.LinkedList;
import java.util.List;

/**
* @author Krishab Munankarmi
* LMU ID: 23048630
 */
public class SelectionSort {
/**
 * Algorithm for Selection sorting
 * @param unsortedData All the unsorted data in list 
 * @param value Used for comparing and assigning values
 * @return dataToSort after the sorting process has been completed
 */
    public List<EmployeeModel> sortByEmpID(List<EmployeeModel> unsortedData, boolean value) {
        
        List<EmployeeModel> dataToSort = new LinkedList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //Minimum value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // Comparing and Assigning
                if (value) {
                    if (dataToSort.get(j).getEmpID() > dataToSort.get(minIndex).getEmpID()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getEmpID() < dataToSort.get(minIndex).getEmpID()) {
                        minIndex = j;
                    }
                }
            }
            //Swapping
            EmployeeModel tempEmployee = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempEmployee);
        }
        return dataToSort;
    }
}