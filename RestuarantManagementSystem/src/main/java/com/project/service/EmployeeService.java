package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Employee;
import com.project.entity.Menu;
import com.project.exception.RestuarantResource;
import com.project.repository.EmployeeRepository;
@Service
public interface EmployeeService {
	Employee createEmployee(Employee e);
	Employee updateEmployee(Employee e);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	void deleteEmployee(int id);
/*
	@Autowired
	private EmployeeRepository repo;
		
		public Employee createEmployee(Employee e) 
		{
			return repo.save(e);
		}

		public Employee updateEmployee(Employee e) throws RestuarantResource 
		{
			Optional<Employee> employee = repo.findById(e.getEid());
			if(employee.isPresent())
			{
				Employee updateEmployee = employee.get();
				updateEmployee.setEid(e.getEid());
				updateEmployee.setEname(e.getEname());
				updateEmployee.setEcontact(e.getEcontact());
				updateEmployee.setEdesignation(e.getEdesignation());
				repo.save(updateEmployee);
				return updateEmployee;
			}
			else
			{
				throw new RestuarantResource("Searching id is not available");
			}
		}

		public List<Employee> getAllEmployee() 
		{
			return repo.findAll();
		}
		
		public Employee getEmployeeById(int id) throws RestuarantResource 
		{
			Optional<Employee> emp = repo.findById(id);
			if(emp.isPresent())
			{
				return emp.get();		
			}
			else
			{
				throw new RestuarantResource("Searching id is not available");
			}
		}

		public void deleteEmployee(int id) throws RestuarantResource 
		{
			Optional<Employee> emp1 = repo.findById(id);
			if(emp1.isPresent())
			{
				repo.delete(emp1.get());		
			}
			else
			{
				throw new RestuarantResource("Searching id is not available");
			}	
		}
		*/
}
