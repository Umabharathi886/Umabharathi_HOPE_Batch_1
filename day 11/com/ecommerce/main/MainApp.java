package com.ecommerce.main;
import com.ecommerce.service.CartService;
import com.ecommerce.model.*;
import com.ecommerce.util.DiscountUtil;
public class MainApp{
    public static void main(String[] args){
        CartService cart = new CartService();
Product p1 = new Product(1,"iphone 18 pro max",DiscountUtil.applyDiscount(175000));
Product p2 = new Product(2,"Redmi Note 15 Pro max",DiscountUtil.applyDiscount(100000));
   cart.addProduct(p1);
   cart.addProduct(p2);
   cart.showCart();
   int totalAmount =  cart.calculateTotal();
   System.out.println("Total amount : $"+ totalAmount);
    }
}