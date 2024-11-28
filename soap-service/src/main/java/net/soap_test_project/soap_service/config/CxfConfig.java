package net.soap_test_project.soap_service.config;

import net.soap_test_project.soap_service.controller.CustomerController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {
    private final Bus bus;
    private final CustomerController controller;

    public CxfConfig(Bus bus, CustomerController controller) {
        this.bus = bus;
        this.controller = controller;
    }

    @Bean
    public EndpointImpl customerWsEndpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,controller);
        endpoint.publish("/CustomerService");
        return endpoint;
    }
}
