package cn.com.codeteenager.cloudproviderpayment.dao;


import cn.com.codeteenager.cloudproviderpayment.entities.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
}
