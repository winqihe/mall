package com.southwind.mmall002.service;

import com.southwind.mmall002.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.mmall002.vo.TableDataVO;
import com.southwind.mmall002.vo.TableProductVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 建强
 * @since 2020-05-18
 */
public interface ProductService extends IService<Product> {
    public List<Product> findByCategoryId(String type,Integer categoryId);

    /**
     * 后台管理系统返回商品数据
     */
    public TableDataVO<TableProductVO> findAllTableData(Integer page,Integer limit);
}
