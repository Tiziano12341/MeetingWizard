package de.training;

import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceMock implements EmployeeService {

    public EmployeeServiceMock (){

    }

    public Employee getEmployeeById(Integer employeeId) {
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
