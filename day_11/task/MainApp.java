package com.ecommerce.main;
import com.ecommerce.model.*;
import com.ecommerce.service.CartService;
import com.ecommerce.util.DiscountUtil;
import java.util.*;
public class MainApp{
    public static void main(String[] args) {
        CartService cart=new CartService();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name:");
        String name=sc.nextLine();
        System.out.println("Enter product price:");
        int price=sc.nextInt();
        Product p1=new Product(1, name, DiscountUtil.applyDiscount(price));
        System.out.println("Enter another product name:");
        sc.nextLine();
        String name2=sc.nextLine();
        System.out.println("Enter another product price:");
        int price2=sc.nextInt();
        Product p2=new Product(2,name2,DiscountUtil.applyDiscount(price2));
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totalAmount=cart.calculateTotal();
        System.out.println("Total Amount: ₹ "+totalAmount);
    }
}