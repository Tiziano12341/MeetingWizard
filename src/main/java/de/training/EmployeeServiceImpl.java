package de.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo){
        this.repo = repo;
    }


    public Employee getEmployeeById(Integer employeeId) {

        Optional<Employee> employee = repo.findById(employeeId);
        if (employee.isPresent()){
            return employee.get();
        }
        return null;
    }




    public EmployeeDto getDtoFromEntity(Employee entity) {
        EmployeeDto dto = EmployeeDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .job(entity.getJob())
                .age(entity.getAge())
                .build();
        return dto;
    }

    public Employee getEntityFromDto(EmployeeDto dto) {
        Employee entity = new Employee();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setJob(dto.getJob());
        entity.setAge(dto.getAge());
        return entity;
    }


}
