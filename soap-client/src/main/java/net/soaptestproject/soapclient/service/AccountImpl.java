package net.soaptestproject.soapclient.service;

import org.springframework.stereotype.Service;
import stub.CustomerResponse;
import stub.CustomerWS;

import java.util.List;

@Service
public class AccountImpl implements AccountService{
    private final CustomerWS customerWS;

    public AccountImpl(CustomerWS customerWS) {
        this.customerWS = customerWS;
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return customerWS.getAllCustomers();
    }

    @Override
    public CustomerResponse getCustomerByIdentity(String identity) {
        return customerWS.getCustomerByIdentity(identity);
    }
}
