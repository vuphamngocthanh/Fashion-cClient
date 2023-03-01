package com.example.fashionclient.service;

import com.example.fashionclient.dto.ProductDto;
import com.example.fashionclient.entity.Product;
import com.example.fashionclient.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<ProductDto> listProduct(){
        List<ProductDto> productDtoList = new ArrayList<>();
        List<Product> products = productRepository.findAllByCreateAt();
        BeanUtils.copyProperties(products,productDtoList);
        return productDtoList;
    }
}
