package com.example.demo.dto;

import java.util.HashMap;
import java.util.Map;

public class CardDto {
    Map<ProductDto, Integer> productDtoMap = new HashMap();

    public CardDto() {
    }

    public CardDto(Map<ProductDto, Integer> productDtoMap) {
        this.productDtoMap = productDtoMap;
    }

    public Map<ProductDto, Integer> getProductDtoMap() {
        return productDtoMap;
    }

    public void setProductDtoMap(Map<ProductDto, Integer> productDtoMap) {
        this.productDtoMap = productDtoMap;
    }

    public void addProduct(ProductDto productDto) {
        if (productDtoMap.containsKey(productDto)) {
            Integer currentValue = productDtoMap.get(productDto);
            productDtoMap.replace(productDto, currentValue + 1);
        } else {
            productDtoMap.put(productDto, 1);
        }
    }

    public void remove(ProductDto productDto) {
        productDtoMap.remove(productDto);
    }

    public void deleteProduct(ProductDto productDto) {
        if (productDtoMap.containsKey(productDto)) {
            if (productDtoMap.get(productDto) > 1) {
                Integer currentValue = productDtoMap.get(productDto);
                productDtoMap.replace(productDto, currentValue - 1);
            } else {
                productDtoMap.remove(productDto);
            }
        }
    }
}
