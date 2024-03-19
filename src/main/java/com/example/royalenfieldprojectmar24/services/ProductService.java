package com.example.royalenfieldprojectmar24.services;

import com.example.royalenfieldprojectmar24.dtos.CreateProductRequestDto;
import com.example.royalenfieldprojectmar24.exceptions.ProductNotFoundException;
import com.example.royalenfieldprojectmar24.models.Product;
import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    List<Product> getProducts();

    Product createProduct(String title,
                          String description,
                          String category,
                          double price,
                          String image);
}
