/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.repository;

import com.lnn.pojos.Product;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Nguyen
 */
public interface ProductRepository {
    List<Product> getProducts(String kw);
    List<Product> getProductsByPrice(BigDecimal fromPrice, BigDecimal toPrice);
    Product getProductById(int id);
    void addProduct(Product product);
    boolean checkProductName(String name);
}
