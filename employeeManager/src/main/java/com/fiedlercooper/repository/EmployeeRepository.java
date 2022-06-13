package com.fiedlercooper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiedlercooper.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	void addEmployee();

	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);

}
