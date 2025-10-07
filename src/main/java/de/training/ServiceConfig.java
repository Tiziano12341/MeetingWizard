package de.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class ServiceConfig {

    private final EmployeeRepository repo;

    public ServiceConfig(EmployeeRepository repo){
        this.repo = repo;
    }

   // @Profile("prod")
    @Bean
    public EmployeeService employeeService (){
        return new EmployeeServiceImpl(repo);
    }

    //@Profile("test")
    @Bean
    public EmployeeService employeeServiceTest (){
        return new EmployeeServiceMock();
    }






}
