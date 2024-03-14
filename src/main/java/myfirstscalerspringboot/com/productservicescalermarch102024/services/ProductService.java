package myfirstscalerspringboot.com.productservicescalermarch102024.services;

import myfirstscalerspringboot.com.productservicescalermarch102024.model.Category;
import myfirstscalerspringboot.com.productservicescalermarch102024.model.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getProducts();

    Product createProduct(String title,
    String description,
    double price,
                          String category,
    String image
    );
}
