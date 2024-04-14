package com.project.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Employee;
import com.project.entity.Order;
import com.project.exception.RestuarantResource;
import com.project.repository.OrderRepository;
@Service
//It will handle Business Logic it calls method from Repository
public interface OrderService {
	Order createOrder(Order o);
	Order updateOrder(Order o);
	List<Order> getAllOrder();
	Order getOrderById(int id) ;
	void deleteOrder(int id);
/*@Autowired
private OrderRepository repo;

	public Order createOrder(Order o) 
	{
		return repo.save(o);
	}
	public Order updateOrder(Order o) throws RestuarantResource 
	{
		Optional<Order> order = repo.findById(o.getOrderId());
		if(order.isPresent())
		{
			Order updateOrder = order.get();
			updateOrder.setOrderId(o.getOrderId());;
			updateOrder.setTotalbill(o.getTotalbill());
			repo.save(updateOrder);
			return updateOrder;
		}
		else
		{
			throw new RestuarantResource("Searching id is not available");
		}
	}
	public List<Order> getAllOrder() 
	{
		return repo.findAll();
	}

	public Order getOrderById(int id) throws RestuarantResource 
	{
		Optional<Order> Ord = repo.findById(id);
		if(Ord.isPresent())
		{
			return Ord.get();		
		}
		else
		{
			throw new RestuarantResource("Searching id is not available");
		}
	}

	public void deleteOrder(int id) throws RestuarantResource 
	{
		Optional<Order> Ord = repo.findById(id);
		if(Ord.isPresent())
		{
			repo.delete(Ord.get());		
		}
		else
		{
			throw new RestuarantResource("Searching id is not available");
		}	
	}*/
}
