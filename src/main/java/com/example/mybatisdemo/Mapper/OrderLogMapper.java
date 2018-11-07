package com.example.mybatisdemo.Mapper;

import com.example.mybatisdemo.pojo.OrderLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author dongsufeng
 * @create 2018/10/22 14:41
 */
//@Mapper
public interface OrderLogMapper {

    OrderLog selectByPrimaryKey(Long id);

    List<OrderLog> selectByExample(OrderLog orderLog);
}
