package com.example.mybatisdemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.mybatisdemo.dao.AppointmentDao;
import com.example.mybatisdemo.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
//import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author dongsufeng
 * @create 2018/10/30 11:24
 */
@Service(version = "1.0.0",group = "test")
public class AppointmentServiceImpl implements AppointmentService {
    static Logger logger= LoggerFactory.getLogger(AppointmentServiceImpl.class);
    @Autowired
    private AppointmentDao appointmentDao;


    @Override
//    @Transactional
    public int insertAppointment(long bookId, long studentId) {
        logger.info("预约类开始预约");

        int insert = appointmentDao.insertAppointment(bookId, studentId);
        int i = 1 / 0;
        logger.info("预约类预约成功={}",insert);
        return insert;
    }
}
