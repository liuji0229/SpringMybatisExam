package com.hand;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		System.out.println("Please input first_name:");
		System.out.println("Please input last_name:");
		System.out.println("Please input email:");
		System.out.println("Please input address_id:");
		Scanner in = new Scanner(System.in);
		String fname = in.nextLine();
		String lname = in.nextLine();
		String email = in.nextLine();
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
		session.commit();
		System.out.println(insert);
	}

}
