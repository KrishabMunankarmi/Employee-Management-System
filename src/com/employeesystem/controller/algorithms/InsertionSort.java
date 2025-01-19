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
public class InsertionSort {
    /**
     * Algorithm for Insertion sorting
     * @param unsortedData All the unsorted data in list
     * @param value Used for comparing and assigning values
     * @return dataToSort after the sorting process has been completed
     */
   public List<EmployeeModel> sortByName(List<EmployeeModel> unsortedData, boolean value) {
    List<EmployeeModel> dataToSort = new LinkedList<>();
    dataToSort.addAll(unsortedData);
    
    for (int i = 1; i < dataToSort.size(); i++) {
        EmployeeModel keyValue = dataToSort.get(i);
        int j = i - 1;
        
        if (value) {
            // Sorting in Descending order
            while (j >= 0 && dataToSort.get(j).getFullName().compareToIgnoreCase(keyValue.getFullName()) < 0) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        } else {
            // Sorting in Ascending order
            while (j >= 0 && dataToSort.get(j).getFullName().compareToIgnoreCase(keyValue.getFullName()) > 0) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
        }
        dataToSort.set(j + 1, keyValue);
    }
    return dataToSort;
}
}