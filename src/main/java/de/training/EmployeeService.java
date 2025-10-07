package de.training;

public interface EmployeeService {
    Employee getEmployeeById(Integer employeeId);
    EmployeeDto getDtoFromEntity(Employee entity);
    Employee getEntityFromDto(EmployeeDto dto);
}
