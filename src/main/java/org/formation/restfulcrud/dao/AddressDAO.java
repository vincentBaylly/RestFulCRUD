package org.formation.restfulcrud.dao;

import org.formation.restfulcrud.model.Address;
import org.formation.restfulcrud.model.Employee;

public class AddressDAO {
 
 
    public static Address getAddress(String empNo) {
        return EmployeeDAO.getEmployee(empNo).getAddress();
    }
 
    public static Employee addAddress(String empNo, Address address) {
    	Employee emp = EmployeeDAO.getEmployee(empNo);
    	emp.setAddress(address);
		return emp;
    }
 
    public static Employee updateAddress(String empNo, Address address) {
    	Employee emp = EmployeeDAO.getEmployee(empNo);
    	emp.setAddress(address);
		return emp;
    }
 
    public static void deleteAddress(String empNo) {
    	Employee emp = EmployeeDAO.getEmployee(empNo);
    	emp.setAddress(null);
    }
	
}
