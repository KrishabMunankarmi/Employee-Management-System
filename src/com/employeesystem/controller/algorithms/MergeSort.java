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
public class MergeSort {
    /**
     * Algorithm for Merge sorting
     * @param unsortedData All the unsorted data in list
     * @param value Used for comparing and assigning values
     * @return merged after the sorting process
     */
    public List<EmployeeModel> sortByPosition(List<EmployeeModel> unsortedData, boolean value) {
    List<EmployeeModel> dataToSort = new LinkedList<>();
    dataToSort.addAll(unsortedData);
    
    if (dataToSort.size() <= 1) {
        return dataToSort;
    }
    
    // Dividing the list into two 
    int mid = dataToSort.size() / 2;
    List<EmployeeModel> left = new LinkedList<>(dataToSort.subList(0, mid));
    List<EmployeeModel> right = new LinkedList<>(dataToSort.subList(mid, dataToSort.size()));
    
    // Recursive sorting on both sides
    left = sortByPosition(left, value);
    right = sortByPosition(right, value);
    
    // Merging the sorted sides
    return mergeByPosition(left, right, value);
}
    /**
     * Merge Sorting by Position attribute
     * @param left One side of sorted data
     * @param right Another side of sorted data
     * @param value Used to assign value
     * @return 
     */
    private List<EmployeeModel> mergeByPosition(List<EmployeeModel> left, List<EmployeeModel> right, boolean value) {
        List<EmployeeModel> merged = new LinkedList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (value) {
                // Sorting in descending order
                if (left.get(leftIndex).getPosition().compareToIgnoreCase(right.get(rightIndex).getPosition()) >= 0) {
                    merged.add(left.get(leftIndex++));
                } else {
                    merged.add(right.get(rightIndex++));
                }
            } else {
                // Sorting in ascending order
                if (left.get(leftIndex).getPosition().compareToIgnoreCase(right.get(rightIndex).getPosition()) <= 0) {
                    merged.add(left.get(leftIndex++));
                } else {
                    merged.add(right.get(rightIndex++));
                }
            }
        }

        // Adding remaining values
        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex++));
        }
        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex++));
        }

        return merged;
    }
}