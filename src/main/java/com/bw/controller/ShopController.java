package com.bw.controller;

import com.bw.pojo.Brand;
import com.bw.pojo.Shop;
import com.bw.pojo.Type;
import com.bw.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    private ShopService shopService;
    @RequestMapping("list")
    public  String list(Shop shop, Model model){
        List<Shop> list =shopService.list();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("toadd")
    public String toadd(){
        return  "add";
    }
    @RequestMapping("getBrand")
    @ResponseBody
    public List<Brand> getBrand(){
        List<Brand> list = shopService.getBrand();
        return  list;
    }
    @RequestMapping("getType")
    @ResponseBody
    public List<Type> getType(Integer id){
        List<Type> list = shopService.getType(id);
        return  list;
    }
}
