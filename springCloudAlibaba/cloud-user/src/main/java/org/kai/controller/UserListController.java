package org.kai.controller;

import org.kai.clients.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserListController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductClient productClient;

    @ResponseBody
    @RequestMapping("/userList")
    public Map<String,String> userList() {
        System.out.println("进入用户服务+++++++++++++++++++++"+port);
        Map<String, String> map = productClient.productList();
        return map;
    }
}
