package cn.com.codeteenager.cloudproviderpayment.service.impl;

import cn.com.codeteenager.cloudproviderpayment.dao.PaymentDao;
import cn.com.codeteenager.cloudproviderpayment.entities.Payment;
import cn.com.codeteenager.cloudproviderpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.insert(payment);
    }
}
