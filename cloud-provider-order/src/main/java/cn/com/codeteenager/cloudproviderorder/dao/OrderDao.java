package cn.com.codeteenager.cloudproviderorder.dao;

import cn.com.codeteenager.cloudproviderorder.entities.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao extends BaseMapper<Orders> {
}
