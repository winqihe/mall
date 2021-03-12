package com.southwind.mmall002.service;

import com.southwind.mmall002.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.mmall002.vo.ProductCategoryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 建强
 * @since 2020-05-18
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    public List<ProductCategoryVO> getAllProductCategoryVO();
}
