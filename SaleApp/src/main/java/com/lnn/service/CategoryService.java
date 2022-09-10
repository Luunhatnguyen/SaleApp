/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.service;

import com.lnn.pojos.Category;
import com.lnn.pojos.Product;
import java.util.List;

/**
 *
 * @author Nguyen
 */
public interface CategoryService {
    List<Category> getCategories();
    List<Product> getProductsByCategory(int cateId);
}
