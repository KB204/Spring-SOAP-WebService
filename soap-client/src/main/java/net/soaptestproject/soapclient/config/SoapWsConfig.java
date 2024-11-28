package net.soaptestproject.soapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stub.CustomerControllerService;
import stub.CustomerWS;

@Configuration
public class SoapWsConfig {


    @Bean
    public CustomerWS customerWebService(){
        return new CustomerControllerService().getCustomerWSPort();
    }
}
