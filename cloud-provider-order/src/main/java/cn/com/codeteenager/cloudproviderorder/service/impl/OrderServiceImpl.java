package cn.com.codeteenager.cloudproviderorder.service.impl;

import cn.com.codeteenager.cloudproviderorder.dao.OrderDao;
import cn.com.codeteenager.cloudproviderorder.entities.Orders;
import cn.com.codeteenager.cloudproviderorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;

    @Override
    public int add(Orders orders) {
        return orderDao.insert(orders);
    }
}
