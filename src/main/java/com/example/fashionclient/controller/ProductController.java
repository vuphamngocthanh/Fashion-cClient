package com.example.fashionclient.controller;

import com.example.fashionclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping
    public ModelAndView viewIndex(){
        return new ModelAndView("index");
    }
}
