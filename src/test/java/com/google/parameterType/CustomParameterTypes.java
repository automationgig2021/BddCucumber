package com.google.parameterType;

import com.google.objects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterTypes {
    @ParameterType(".*")
    public Product product(String name){
        return new Product(name);
    }
}
