package cn.com.codeteenager.cloudproviderorder.controller;
import cn.com.codeteenager.cloudproviderorder.entities.CommonResult;
import cn.com.codeteenager.cloudproviderorder.entities.Orders;
import cn.com.codeteenager.cloudproviderorder.feign.payment.PaymentFeignService;
import cn.com.codeteenager.cloudproviderorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    PaymentFeignService paymentFeignService;

    @GetMapping("/add")
    public CommonResult add(){
        Orders order = new Orders();
        order.setSerial("测试");
        int result = orderService.add(order);
        paymentFeignService.add();
        return new CommonResult(300,"新增成功!");
    }
}
