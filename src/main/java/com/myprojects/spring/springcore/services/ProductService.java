package com.myprojects.spring.springcore.services;

import com.myprojects.spring.springcore.commands.ProductForm;
import com.myprojects.spring.springcore.domain.Product;

public interface ProductService extends CRUDService<Product> {

    Product saveOrUpdateProductForm(ProductForm productForm);

}

