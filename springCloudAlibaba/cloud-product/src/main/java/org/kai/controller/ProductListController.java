package org.kai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductListController {

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @GetMapping(value = "/productList")
    public Map<String,String> productList() {
        System.out.println("进入商品服务+++++++++++++++++++++"+port);
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("state","200");
        stringStringHashMap.put("msg","这是商品列表"+"端口号："+port);
        return stringStringHashMap;
    }
}
