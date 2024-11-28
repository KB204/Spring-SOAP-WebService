package net.soap_test_project.soap_service.controller;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import net.soap_test_project.soap_service.dto.CustomerRequest;
import net.soap_test_project.soap_service.dto.CustomerResponse;
import net.soap_test_project.soap_service.service.CustomerService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(name = "CustomerWS")
@SOAPBinding
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }
    @WebMethod
    @WebResult(name = "Customer")
    public List<CustomerResponse> getAllCustomers(){
        return service.getAllCustomers();
    }
    @WebMethod
    @WebResult(name = "Customer")
    public CustomerResponse getCustomerByIdentity(@WebParam(name = "identity") String identity){
        return service.findCustomerByIdentity(identity);
    }
    @WebMethod
    @WebResult(name = "Customer")
    public String saveNewCustomer(@WebParam(name = "Customer") CustomerRequest request){
        service.createNewCustomer(request);
        return String.format("Customer identified by %s was created with succes",request.getIdentity());
    }
    @WebMethod
    @WebResult(name = "Customer")
    public void removeCustomer(@WebParam(name = "identity") String identity){
        service.deleteCustomerByIdentity(identity);
    }
}
