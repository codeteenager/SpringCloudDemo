package cn.com.codeteenager.cloudproviderpayment.controller;

import cn.com.codeteenager.cloudproviderpayment.entities.CommonResult;
import cn.com.codeteenager.cloudproviderpayment.entities.Payment;
import cn.com.codeteenager.cloudproviderpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/add")
    public String add(){
        Payment payment = new Payment();
        payment.setSerial("123456");
        int result = paymentService.add(payment);
        return "新增成功!";
    }
}
