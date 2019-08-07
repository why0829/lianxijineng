package com.bw.service;

import com.bw.pojo.Brand;
import com.bw.pojo.Shop;
import com.bw.pojo.Type;

import java.util.List;

public interface ShopService {
    List<Shop> list();

    List<Brand> getBrand();

    List<Type> getType(Integer id);
}
