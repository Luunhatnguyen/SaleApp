/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.service.impl;

import com.lnn.pojos.Category;
import com.lnn.pojos.Product;
import com.lnn.repository.CategoryRepository;
import com.lnn.service.CategoryService;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nguyen
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Category> getCategories() {
        return categoryRepository.getCategories("");
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getProductsByCategory(int cateId) {
        return categoryRepository.getProductsByCategory(cateId);
    }
}
