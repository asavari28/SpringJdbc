package in.bushansirgur.springjdbcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springjdbcdemo.dao.EmployeeDAO;
import in.bushansirgur.springjdbcdemo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO eDAO;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return eDAO.getAll();
	}	

}
