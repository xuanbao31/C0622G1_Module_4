package com.service;

import com.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, (new Product(1, "Milo", "31/12/2023", "150$", "Delicious")));
        productMap.put(2, (new Product(2, "Kem Melano", "27/08/2024", "50$", "Delicious")));
        productMap.put(3, (new Product(3, "Coca cola", "11/01/2026", "150$", "Delicious")));
        productMap.put(4, (new Product(4, "Poca", "29/11/2023", "150$", "Delicious")));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }
}
