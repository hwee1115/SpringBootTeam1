package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mycompany.webapp.dto.Orders;
import com.mycompany.webapp.dto.Pager;


@Mapper
public interface OrdersDao {
	public int ordersInsert(Orders orders);
	public int updateStatus(Orders orders);
	public List<Orders> ordersList(String uid);
	public List<Orders> orderListByPage(@Param("pager")Pager pager, @Param("keyword")String keyword,@Param("status")String status);
	public Orders orderSelectByOne(String order_id);
	public int count(String keyword,String status);
}
