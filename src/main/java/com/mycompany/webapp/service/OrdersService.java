package com.mycompany.webapp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.OrderProductsDao;
import com.mycompany.webapp.dao.OrdersDao;
import com.mycompany.webapp.dto.CartItem;
import com.mycompany.webapp.dto.OrderProduct;
import com.mycompany.webapp.dto.Orders;
import com.mycompany.webapp.dto.Pager;

@Service
public class OrdersService {

	@Autowired
	OrdersDao ordersDao;

	@Autowired
	OrderProductsDao orderProductDao;



	//주문서 생성
	public void createOrders(Orders orders){

		ordersDao.ordersInsert(orders);

	}

	//주문 삭제
	public void deleteOrder(Orders orders) {
		ordersDao.updateStatus(orders);
	}
	
	//주문서 읽어오기
		public Orders ReadOrders(String order_id) {

			Orders orders=ordersDao.orderSelectByOne(order_id);
			return orders;
		}
	//주문내역 읽어오기
	public List<Orders> getOrdersList(String uid){ 
		List<Orders> list = ordersDao.ordersList(uid);
		return list;
	}
	
	public List<Orders> getOrdersList(Pager pager,String keyword){ 
		List<Orders> list = ordersDao.orderListByPage(pager, keyword);
		
		return list;
	}
	
	public int getTotalRows(String keyword) {
	     int rows = ordersDao.count(keyword);
	     return rows;
	   }

	
	
	//orderProduct 테이블 관련 
	public void creatOrderProduct(OrderProduct orderproduct) {
		orderProductDao.orderProductList(orderproduct);
	}

	public List<OrderProduct> getProductList(String oid){
		List<OrderProduct> plist = orderProductDao.productList(oid);
		return plist;
	}
	
	public List<CartItem> getOrderList(String uid){ 
		List<CartItem> list = orderProductDao.orderList(uid);
		return list;
	}
	
	

	public void updateStatus(OrderProduct orderproduct) {
		orderProductDao.updateStatus(orderproduct);
	}

}
