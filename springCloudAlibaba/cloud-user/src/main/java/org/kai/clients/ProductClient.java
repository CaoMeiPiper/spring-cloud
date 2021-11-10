package org.kai.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


@FeignClient("cloudproduct")//cloudproduct 是服务的服务id 也就是服务名，把想要调用的服务的服务接口可以直接复制过来，feign会自动的把接口注册到工厂中，通过@Autowoide调用
public interface ProductClient {
    @GetMapping("/product/productList")
    Map<String,String> productList();
}
