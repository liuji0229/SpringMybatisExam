package com.hand;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.expression.ParseException;




public class main1 {
	public static void main(String[] args) throws java.text.ParseException {
		String resource = "config.xml";
		
		InputStream is=main1.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		String statement = "com.hand.customerMapper.insert";
		Scanner in = new Scanner(System.in);
		System.out.println("Please input first_name:");
		String fname = in.nextLine();
		System.out.println("Please input last_name:");
		String lname = in.nextLine();
		System.out.println("Please input email:");
		String email = in.nextLine();
		System.out.println("Please input address_id:");
		int addressid = in.nextInt();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");  
		String cDate = df.format(new Date());
		Date date = null ;
		try {
				date = (Date) df.parse(cDate);
			} catch (ParseException e) {
				System.out.println(11111);
				e.printStackTrace();
			}
		customer c = new customer(1,fname,lname,email,addressid,date);
		
		int insert=session.insert(statement, c);
		System.out.println("插入成功");
	//	session.commit();
		
		String statement2 = "com.hand.customerMapper.select";
		customer c2=new customer(fname,lname,addressid);
		List<customer> list=session.selectList(statement2,c2);
		for (int i = 0; i <list.size(); i++) {
			System.out.println("ID: "+list.get(i).getCustomer_id());
			System.out.println("FirstName: "+list.get(i).getFirst_name());
			System.out.println("LastName: "+list.get(i).getLast_name());
			System.out.println("email: "+list.get(i).getEmail());
			System.out.println("address_id:"+list.get(i).getAddress_id());
			System.out.println("create_date: "+list.get(i).getCreate_date());
			
		}
		
		System.out.println("请输入需要删除的customer_id：");
		int del=in.nextInt();
		String statement3 = "com.hand.customerMapper.delete";
		session.delete(statement3,del);
		session.commit();
		System.out.println("删除成功");
	}

}
