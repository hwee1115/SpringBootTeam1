package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.mycompany.webapp.dto.CartItem;
import com.mycompany.webapp.dto.Pager;


@Mapper
public interface CartDao {
	public List<CartItem> cartList(String uid);
	public List<CartItem> cartListByPage(@Param("uid")String uid, @Param("pager")Pager pager);
	public int count(String uid);
	public int insertCart(CartItem cart);
	public int deleteCart(@Param("uid") String uid, @Param("pid") int pid);
	public int deleteCartAll(String uid);
	public int increaseAmount(@Param("uid") String uid, @Param("pid") int pid);
	public int decreaseAmount(@Param("uid") String uid, @Param("pid") int pid);
	public CartItem cartListOne(@Param("uid") String uid, @Param("pid") int pid);
}
