package service;

import java.util.Date;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import Dao.customer;



@RunWith(SpringJUnit4ClassRunner.class) //使用Springtest测试框架
@ContextConfiguration("/spring-mybatis.xml") 

public class customerTest {
	@Autowired  //注入
	private customerMapper customerMapper;
	
	public void save(int store_id, String first_name,
			String last_name, String address_id, Date create_date){
		
		customer c=new customer();
		c.setStore_id(store_id);
		c.setFirst_name(first_name);
		c.setLast_name(last_name);
		c.setAddress_id(address_id);
		c.setCreate_date(create_date);
		customerMapper.save(c);
		System.out.println(c.toString());
	}


}
