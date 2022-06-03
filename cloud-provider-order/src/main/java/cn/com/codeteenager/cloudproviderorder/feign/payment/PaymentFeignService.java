package cn.com.codeteenager.cloudproviderorder.feign.payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cloud-payment-service",path = "/payment")
public interface PaymentFeignService {
    @GetMapping("/add")
    public String add();
}
