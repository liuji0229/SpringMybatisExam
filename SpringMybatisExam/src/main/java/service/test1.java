package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import Dao.customer;


public class test1 {
		public static void main(String[] args) throws ParseException {
				Scanner scanner=new Scanner(System.in);
				System.out.print("请输入first_name:");
				String first_name=scanner.nextLine();
				System.out.print("请输入last_name:");
				String last_name=scanner.nextLine();
				System.out.print("请输入email:");
				String email=scanner.nextLine();
				System.out.print("请输入address_id:");
				String address_id=scanner.nextLine();
		Date nowTime = new Date(System.currentTimeMillis());
		SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
		String retStrFormatNowDate = sdFormatter.format(nowTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date create_date = sdf.parse(retStrFormatNowDate);
		
		customerTest test=new customerTest();
		test.save(1, first_name, last_name, address_id, create_date);
	}

}
