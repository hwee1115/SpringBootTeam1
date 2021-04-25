package com.mycompany.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.CartDao;
import com.mycompany.webapp.dto.CartItem;
import com.mycompany.webapp.dto.Pager;

@Service
public class CartsService {

	@Autowired
	private CartDao cartDao;
	
	public List<CartItem> getCartList(String uid){ 
		List<CartItem> list = cartDao.cartList(uid);
		return list;
	}
	public List<CartItem> getCartList(String uid, Pager pager){
		List<CartItem> list = cartDao.cartListByPage(uid, pager);
		return list;
	}
	public CartItem getCartOne(String uid, int pid) {
		CartItem cartitem =cartDao.cartListOne(uid, pid);
		return cartitem;
	}
	public int getTotalRows(String uid) {
	     int rows = cartDao.count(uid);
	     return rows;
	   }
	public void plusAmount(String uid, int pid) {
		cartDao.increaseAmount(uid, pid);
	}
	
	public void minusAmount(String uid, int pid) {
		cartDao.decreaseAmount(uid, pid);
	}
	
	public void removeCartList(String uid, int pid) {
		cartDao.deleteCart(uid, pid);
	}
	
	public void removeCartAll(String uid) {
		cartDao.deleteCartAll(uid);
	}
	
	public void addCart(CartItem cart) {
		cartDao.insertCart(cart);
	}
	
}
