package com.example.demo;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepos;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepos employeeRepos;

	@Override
	public List<Employee> getEmplyees() {
		// TODO Auto-generated method stub
		return employeeRepos.findAll();
	}

	@Override
	public Employee getoneEmployee(int id) {

		Employee emp = employeeRepos.findById(id).get();

		return emp;
	}

	@Override
	public Response createEmployee(Employee employee) {

		Employee emp = employeeRepos.save(employee);

		return Response.ok(emp).build();
	}

	@Override
	public Response updateEmployee(Employee employee) {

		Employee emp = employeeRepos.save(employee);

		return Response.ok(emp).build();
	}

	@Override
	public Response deleteEmployee(int id) {
		Employee emp = employeeRepos.findById(id).get();
		Response res;
		if(emp!=null) {
			employeeRepos.deleteById(id);
			res=Response.ok().build();
		}else {
			res=Response.notModified().build();
		}
		
		
		return res;
	}

}
