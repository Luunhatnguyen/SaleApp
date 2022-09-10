/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.service.impl;

import com.lnn.pojos.Cart;
import com.lnn.pojos.OrderDetail;
import com.lnn.pojos.SaleOrder;
import com.lnn.pojos.User;
import com.lnn.repository.OrderDetailRepository;
import com.lnn.repository.SaleOrderRepository;
import com.lnn.service.OrderService;
import com.lnn.service.UserService;
import java.math.BigDecimal;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Nguyen
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private SaleOrderRepository saleOrderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public void addOrder(Collection<Cart> carts) {
        BigDecimal sum = new BigDecimal(0);
        
        for (Cart c: carts)
            sum = sum.add(c.getProduct()
                           .getPrice()
                           .multiply(new BigDecimal(c.getNum())));
     
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userService.getUserByUsername(username);
        
        SaleOrder order = new SaleOrder(sum, user);
        saleOrderRepository.addSaleOrder(order);

        for (Cart c: carts) {
            OrderDetail detail = new OrderDetail(order, c.getProduct(), c.getNum());
            orderDetailRepository.addOrderDetail(detail);
        }
    }
}
