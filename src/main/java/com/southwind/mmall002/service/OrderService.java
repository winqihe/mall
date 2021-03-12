package com.southwind.mmall002.service;

import com.southwind.mmall002.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.mmall002.entity.User;
import com.southwind.mmall002.vo.OrderVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 建强
 * @since 2020-05-18
 */
public interface OrderService extends IService<Orders> {
    public boolean save(Orders orders, User user,String address,String remark);
    public List<OrderVO> findAllOrederVOByUserId(Integer id);
}
