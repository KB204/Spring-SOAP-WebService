package net.soap_test_project.soap_service.service;

import net.soap_test_project.soap_service.dao.CustomerRepository;
import net.soap_test_project.soap_service.dto.CustomerRequest;
import net.soap_test_project.soap_service.dto.CustomerResponse;
import net.soap_test_project.soap_service.entities.Customer;
import net.soap_test_project.soap_service.exceptions.ResourceAlreadyExists;
import net.soap_test_project.soap_service.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository repository;
    private final ModelMapper mapper;

    public CustomerServiceImpl(CustomerRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return repository.findAll()
                .stream()
                .map(customer -> mapper.map(customer, CustomerResponse.class))
                .toList();
    }

    @Override
    public void createNewCustomer(CustomerRequest request) {
        repository.findByIdentityIgnoreCase(request.getIdentity())
                .ifPresent(c -> {
                    throw new ResourceAlreadyExists(String.format("Customer identified by %s already exists",request.getIdentity()));
                });
        Customer customer = mapper.map(request,Customer.class);
        repository.save(customer);
    }

    @Override
    public CustomerResponse findCustomerByIdentity(String identity) {
        return mapper.map(repository.findByIdentityIgnoreCase(identity)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found")),CustomerResponse.class);
    }

    @Override
    public void deleteCustomerByIdentity(String identity) {
        Customer customer = repository.findByIdentityIgnoreCase(identity)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        repository.delete(customer);
    }
}
