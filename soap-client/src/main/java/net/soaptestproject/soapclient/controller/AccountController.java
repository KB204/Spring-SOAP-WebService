package net.soaptestproject.soapclient.controller;


import net.soaptestproject.soapclient.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import stub.CustomerResponse;

import java.util.List;

@RestController
@RequestMapping("/api/clientsAccounts")
public class AccountController {
    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<CustomerResponse> findAccountsClients(){
        return service.getAllCustomers();
    }
    @GetMapping("/{identity}")
    @ResponseStatus(HttpStatus.OK)
    CustomerResponse findCustomer(@PathVariable String identity){
        return service.getCustomerByIdentity(identity);
    }
}
