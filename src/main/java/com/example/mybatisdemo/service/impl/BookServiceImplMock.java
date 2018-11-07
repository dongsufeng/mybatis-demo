package com.example.mybatisdemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.mybatisdemo.dao.AppointmentDao;
import com.example.mybatisdemo.dao.BookDao;
import com.example.mybatisdemo.dto.AppointExecution;
import com.example.mybatisdemo.enums.AppointStateEnum;
import com.example.mybatisdemo.exception.AppointException;
import com.example.mybatisdemo.exception.NoNumberException;
import com.example.mybatisdemo.exception.RepeatAppointException;
import com.example.mybatisdemo.pojo.Appointment;
import com.example.mybatisdemo.pojo.Book;
import com.example.mybatisdemo.service.AppointmentService;
import com.example.mybatisdemo.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookServiceImplMock implements BookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private BookDao bookDao;

	@Autowired
	private AppointmentDao appointmentDao;

	@Autowired
	AppointmentService appointmentService;


	@Override
	public Book getById(long bookId) {
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList() {
		return bookDao.queryAll(0, 1000);
	}

	@Override
	/**
	 * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	public AppointExecution appoint(long bookId, long studentId) {
		logger.info("进入mock====================");
		return new AppointExecution();
	}
	@Override
	public int insertAppointment(long bookId, long studentId){
		return 0;
	}

}
