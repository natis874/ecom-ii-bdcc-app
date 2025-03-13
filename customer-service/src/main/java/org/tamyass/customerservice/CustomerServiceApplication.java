package org.tamyass.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tamyass.customerservice.entities.Customer;
import org.tamyass.customerservice.repository.CustomerRepository;

import java.util.logging.Logger;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    static Logger logger = Logger.getLogger(CustomerServiceApplication.class.getName());

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Mohamed").email("mohamed@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Yassine").email("yassine@gmail.com").build());
            customerRepository.findAll().forEach(customer -> {
                logger.info("========================");
                System.out.println(customer.getId());
                System.out.println(customer.getName());
                System.out.println(customer.getEmail());
                System.out.println("========================");
            });
        };
    }
}
