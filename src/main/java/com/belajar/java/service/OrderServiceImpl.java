package com.belajar.java.service;

import java.util.ArrayList;
import java.util.List;

import com.belajar.java.constant.MasterBarang;
import com.belajar.java.entity.OrderDetail;

public class OrderServiceImpl implements IOrderService {

	@Override
	public List<OrderDetail> listOrder() {
		List<OrderDetail> list = new ArrayList<>();

		// TODO : code here
		OrderDetail orderNasiGoreng = getOrderDetail(MasterBarang.NASI_GORENG, 1);
		list.add(orderNasiGoreng);

		return list;
	}

	@Override
	public int totalTagihan() {
		// TODO : code here
		return 0;
	}

	private OrderDetail getOrderDetail(MasterBarang masterBarang, int jumlah) {
		OrderDetail orderdetail = new OrderDetail();
		orderdetail.setNamaBarang(masterBarang.getNamaBarang());
		orderdetail.setJumlah(jumlah);
		orderdetail.setHargaSatuan(masterBarang.getHargaSatuan());
		// TODO : code here

		return orderdetail;
	}

}
