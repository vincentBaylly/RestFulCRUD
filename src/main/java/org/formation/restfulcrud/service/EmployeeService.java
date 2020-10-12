package org.formation.restfulcrud.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.formation.restfulcrud.dao.EmployeeDAO;
import org.formation.restfulcrud.model.Employee;
 
@Path("employees")
public class EmployeeService {
 
    // URI:
    // /contextPath/servletPath/employees
    @GET
    public List<Employee> getEmployees() {
        List<Employee> listOfCountries = EmployeeDAO.getAllEmployees();
        return listOfCountries;
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{empNo}")
    public Employee getEmployee(@PathParam("empNo") String empNo) {
        return EmployeeDAO.getEmployee(empNo);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    public Employee addEmployee(Employee emp) {
        return EmployeeDAO.addEmployee(emp);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    public Employee updateEmployee(Employee emp) {
        return EmployeeDAO.updateEmployee(emp);
    }
 
    @DELETE
    @Path("/{empNo}")
    public void deleteEmployee(@PathParam("empNo") String empNo) {
        EmployeeDAO.deleteEmployee(empNo);
    }
 
}
