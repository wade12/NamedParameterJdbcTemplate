package com.osgo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

import com.osgo.dao.JdbcDaoImpl;
import com.osgo.model.Circle;

public class JdbcSpring
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
				
		// Circle circle = dao.getCircle(1);
		//System.out.println(circle.getName());
		
		// System.out.println(dao.getCircleName(1));
		// System.out.println(dao.getCircleForId(1).getName());
		
		// dao.insertCircle(new Circle(2, "Second Circle"));
		// dao.insertCircle(new Circle(3, "Third Circle"));
		// dao.insertCircle(new Circle(4, "Fourth Circle"));
		dao.insertCircle(new Circle(5, "Fifth Circle"));
		System.out.println(dao.getAllCircles().size());
		
		// dao.createTriangleTable();

	} // end method main

} // end Class jdbcDemo
