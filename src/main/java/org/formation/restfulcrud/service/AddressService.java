package org.formation.restfulcrud.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.formation.restfulcrud.dao.AddressDAO;
import org.formation.restfulcrud.model.Address;
import org.formation.restfulcrud.model.Employee;

@Path("addresses")
public class AddressService {
 
    // URI:
    // /contextPath/servletPath/address/{empNo}
    @GET
    @Path("/{empNo}")
    public Address getAddress(@PathParam("empNo") String empNo) {
        return AddressDAO.getAddress(empNo);
    }
 
    // URI:
    // /contextPath/servletPath/address
    @POST
    public Employee addAddress(Employee emp) {
        return AddressDAO.addAddress(emp.getEmpNo(), emp.getAddress());
    }
 
    // URI:
    // /contextPath/servletPath/adress
    @PUT
    public Employee updateAddress(Employee emp) {
        return AddressDAO.updateAddress(emp.getEmpNo(), emp.getAddress());
    }
 
    @DELETE
    @Path("/{empNo}")
    public void deleteAddress(@PathParam("empNo") String empNo) {
    	AddressDAO.deleteAddress(empNo);
    }
}
