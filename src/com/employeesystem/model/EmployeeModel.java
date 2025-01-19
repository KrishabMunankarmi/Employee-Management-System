/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employeesystem.model;

/**
 * @author Krishab Munankarmi
 * LMU ID: 23048630
 */
public class EmployeeModel {
    //Creating global variables
    public int empID;
    public String fullName;
    public String Address;
    public String contactNo;
    public int Age;
    public String Position;
    public int contractPeriod;
    
    //Creating a constructor
    public EmployeeModel(int empID, String fullName, String Address, String contactNo, int Age, String Position, int contractPeriod){
        this.empID = empID;
        this.fullName = fullName;
        this.Address = Address;
        this.contactNo = contactNo;
        this.Age = Age;
        this.Position = Position;
        this.contractPeriod = contractPeriod;
    }

    //Creating Getter and Setter methods
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }
    
    
}


