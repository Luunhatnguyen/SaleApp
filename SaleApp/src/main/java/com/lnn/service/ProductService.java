/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.service;

import com.lnn.pojos.Product;
import java.util.List;

/**
 *
 * @author Nguyen
 */
public interface ProductService {
    List<Product> getProducts(String kw);
    Product getProductById(int productId);
    void addProduct(Product product, String rootDir);
    boolean checkProductName(String productName);
}
