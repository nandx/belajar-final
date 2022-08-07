package com.belajar.java.service;

import java.util.List;

import com.belajar.java.entity.OrderDetail;

public interface IOrderService {

	public List<OrderDetail> listOrder();

	public int totalTagihan();

}
