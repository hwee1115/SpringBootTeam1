package com.mycompany.webapp.dto;

import java.sql.Timestamp;
import java.util.Date;

public class CartItem {   
   private int amount;
   private String p_size; 
   private String user_id;
   private int p_id;
   private String p_name;
   private int p_price;
   private int photo_id;
   private String photo_oname;
   private String photo_sname;
   private String photo_type;
   private String photo_role;
   private Timestamp cart_date;
   

public Timestamp getCart_date() {
	return cart_date;
}
public void setCart_date(Timestamp cart_date) {
	this.cart_date = cart_date;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getP_size() {
	return p_size;
}
public void setP_size(String p_size) {
	this.p_size = p_size;
}
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public int getP_price() {
	return p_price;
}
public void setP_price(int p_price) {
	this.p_price = p_price;
}
public int getPhoto_id() {
	return photo_id;
}
public void setPhoto_id(int photo_id) {
	this.photo_id = photo_id;
}
public String getPhoto_oname() {
	return photo_oname;
}
public void setPhoto_oname(String photo_oname) {
	this.photo_oname = photo_oname;
}
public String getPhoto_sname() {
	return photo_sname;
}
public void setPhoto_sname(String photo_sname) {
	this.photo_sname = photo_sname;
}
public String getPhoto_type() {
	return photo_type;
}
public void setPhoto_type(String photo_type) {
	this.photo_type = photo_type;
}
public String getPhoto_role() {
	return photo_role;
}
public void setPhoto_role(String photo_role) {
	this.photo_role = photo_role;
}
   

   
	   
	  
}