package net.soaptestproject.soapclient.service;

import stub.CustomerResponse;

import java.util.List;

public interface AccountService {
    List<CustomerResponse> getAllCustomers();
    CustomerResponse getCustomerByIdentity(String identity);
}
