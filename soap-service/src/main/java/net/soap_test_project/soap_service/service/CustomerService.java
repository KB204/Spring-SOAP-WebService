package net.soap_test_project.soap_service.service;

import net.soap_test_project.soap_service.dto.CustomerRequest;
import net.soap_test_project.soap_service.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {
    List<CustomerResponse> getAllCustomers();
    void createNewCustomer(CustomerRequest request);
    CustomerResponse findCustomerByIdentity(String identity);
    void deleteCustomerByIdentity(String identity);
}
