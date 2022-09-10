/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.repository.impl;

import com.lnn.pojos.OrderDetail;
import com.lnn.repository.OrderDetailRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nguyen
 */
@Repository
public class OrderDetailRepositoryImpl implements OrderDetailRepository {
    @Autowired
    private SessionFactory sessionFactory;
        
    @Override
    public void addOrderDetail(OrderDetail orderDetail) {
        Session session = sessionFactory.getCurrentSession();
        session.save(orderDetail);
    }
    
}
