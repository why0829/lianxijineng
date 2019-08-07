package com.bw.service;

import com.bw.mapper.ShopMapper;
import com.bw.pojo.Brand;
import com.bw.pojo.Shop;
import com.bw.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public List<Shop> list() {
        return shopMapper.list();
    }

    @Override
    public List<Brand> getBrand() {
        return shopMapper.getBrand();
    }

    @Override
    public List<Type> getType(Integer id) {
        return shopMapper.getType(id);
    }
}
