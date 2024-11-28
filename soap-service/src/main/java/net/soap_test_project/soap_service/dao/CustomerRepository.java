package net.soap_test_project.soap_service.dao;

import net.soap_test_project.soap_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByIdentityIgnoreCase(String identity);
}
