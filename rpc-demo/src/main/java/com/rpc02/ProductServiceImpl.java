package com.rpc02;

import com.common.IProductService;
import com.common.Product;

/**
 * @author: Admin
 * @create: 2020/8/14 21:54
 */
public class ProductServiceImpl implements IProductService {
    @Override
    public Product findProductById(Integer id) {
        return new Product(id,"product");
    }
}
