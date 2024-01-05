package com.study.ch07.resister;

public class ProductRepository {

    void saveProduct(Product product) {
        ProductDB productDB = new ProductDB();
        productDB.insertProduct(product);
    }

}
