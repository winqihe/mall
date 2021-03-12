package com.southwind.mmall002.service;

import com.southwind.mmall002.entity.Product;
import com.southwind.mmall002.mapper.TestMapper;
import com.southwind.mmall002.vo.TableDataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService service;
    @Autowired
    private TestMapper testMapper;
    @Test
    void test(){
//        TableDataVO tableDataVO = service.findAllTableData();
        int i = 0;
    }
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Product> userList = testMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}