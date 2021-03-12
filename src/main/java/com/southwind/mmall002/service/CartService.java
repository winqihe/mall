package com.southwind.mmall002.service;

import com.southwind.mmall002.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.mmall002.vo.CartVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 建强
 * @since 2020-05-18
 */
public interface CartService extends IService<Cart> {
    public List<CartVO> findAllCartVOByUserId(Integer id);
}
