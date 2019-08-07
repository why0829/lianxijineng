package com.bw.mapper;

import com.bw.pojo.Brand;
import com.bw.pojo.Shop;
import com.bw.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ShopMapper {
    @Select("SELECT * FROM t_shop s LEFT JOIN t_type t ON s.tid = t.tid LEFT JOIN t_brand b ON s.bid = b.bid")
    List<Shop> list();
@Select("select * from t_brand")
    List<Brand> getBrand();
    @Select("SELECT * FROM t_shop s LEFT JOIN t_type t ON s.tid = t.tid LEFT JOIN t_brand b ON s.bid = b.bid LEFT JOIN t_bt bt ON bt.tid = t.tid where b.bid=#{id}")
    List<Type> getType(Integer id);
}
