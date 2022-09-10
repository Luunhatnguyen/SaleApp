/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.formatter;

import com.lnn.pojos.Category;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Nguyen
 */
public class CategoryFormatter implements Formatter<Category> {
    @Override
    public String print(Category obj, Locale locale) {
        return String.valueOf(obj.getId());
    }

    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        Category cat = new Category();
        cat.setId(Integer.parseInt(text));
        
        return cat;
    }    
}
