package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Order;
import com.project.exception.RestuarantResource;
import com.project.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository orderRepo;
	@Override
	public Order createOrder(Order o) {
		return orderRepo.save(o);
	}

	@Override
	public Order updateOrder(Order o) {
		Optional<Order> order = orderRepo.findById(o.getId());
		if(order.isPresent())
		{
			Order updateOrder = order.get();
			updateOrder.setId(o.getId());;
			updateOrder.setTotalbill(o.getTotalbill());
			updateOrder.setQuantity(o.getQuantity());
			orderRepo.save(updateOrder);
			return updateOrder;
		}
		else
		{
			throw new RestuarantResource("Searching id is not available");
		}
	}

	@Override
	public List<Order> getAllOrder() {
		return orderRepo.findAll();
	}

	@Override
	public Order getOrderById(int id) {
		Optional<Order> Ord = orderRepo.findById(id);
		if(Ord.isPresent())
		{
			return Ord.get();		
		}
		else
		{
			throw new RestuarantResource("Searching id is not available");
		}
	}

	@Override
	public void deleteOrder(int id) {
		Optional<Order> Ord = orderRepo.findById(id);
		if(Ord.isPresent())
		{
			orderRepo.delete(Ord.get());		
		}
		else
		{
			throw new RestuarantResource("Searching id is not available");
		}	
		
	}

}
