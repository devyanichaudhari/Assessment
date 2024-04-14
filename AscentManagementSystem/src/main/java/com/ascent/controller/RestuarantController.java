package com.ascent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ascent.entity.Employee;
import com.ascent.entity.Menu;
import com.ascent.entity.Order;
import com.ascent.service.EmployeeService;
import com.ascent.service.MenuService;
import com.ascent.service.OrderService;

@RestController
@RequestMapping("/app")
public class RestuarantController {
	@Autowired
	MenuService menuService;
	@PostMapping("/addmenu")
	public Menu createMenu(@RequestBody Menu m)
	{
		return menuService.createMenu(m);
	}
	@GetMapping("/readmenu")
	public List<Menu>fetchAllMenuDetails()
	{
		return menuService.getAllMenu();
	}
	@GetMapping("readmenu/{id}")
	public Menu getMenuById(@PathVariable("id") int id) 
	{
		
		return menuService.getMenuById(id);
	}
	@DeleteMapping("/deletemenu/{id}")
	public void deleteMenu(@PathVariable("id")int id)
	{
		menuService.deleteMenu(id);
	}
		
	@PutMapping("/updatemenu/{id}")
	public Menu updateMenu(@PathVariable("id")int id,@RequestBody Menu m) 
	{
		m.setId(id);
		return menuService.updateMenu(m);
	}
	@Autowired
	EmployeeService empService;
	@PostMapping("/addEmployee")
	public Employee createEmployee(@RequestBody Employee e)
	{
		return empService.createEmployee(e);
	}
	@GetMapping("/readEmployee")
	public List<Employee>fetchAllEmployeeDetails()
	{
		return empService.getAllEmployee();
	}
	@GetMapping("readEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id)
	{
		
		return empService.getEmployeeById(id);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id")int id)
	{
		empService.deleteEmployee(id);
	}
		
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable("id")int id,@RequestBody Employee e)
	{
		e.setEid(id);
		return empService.updateEmployee(e);
	}
	@Autowired
	OrderService orderService;
	@PostMapping("/addOrder")
	public Order createOrder(@RequestBody Order o)
	{
		return orderService.createOrder(o);
	}
	@GetMapping("/readOrder")
	public List<Order>fetchAllOrderDetails()
	{
		return orderService.getAllOrder();
	}
	@GetMapping("readOrder/{id}")
	public Order getOrderById(@PathVariable("id") int id)
	{
		
		return orderService.getOrderById(id);
	}
	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable("id")int id)
	{
		orderService.deleteOrder(id);
	}
		
	@PutMapping("/updateOrder/{id}")
	public Order updateOrder(@PathVariable("id")int id,@RequestBody Order o)
	{
		o.setId(id);
		return orderService.updateOrder(o);
	}

}
