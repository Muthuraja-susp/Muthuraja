package com.emp.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.emp.sample.Invoice;

public class Solution {


	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("**********ANY FOR 5**********");
		System.out.println("Enter the number of items....");
		int num = Integer.valueOf(bf.readLine());
		int i = 0;
		Float net=(float) 0.0;
		while (i < num) {
			session.beginTransaction();
			i++;

			// System.out.print("Enter Id : ");
			// int sno = Integer.valueOf(bf.readLine());
			System.out.print("Enter the Item" + num + " name");
			String iname = bf.readLine();
			System.out.print("Enter the Quantity(with precision) : ");
			Float qty = Float.valueOf(bf.readLine());

			Float QTY_price=(float) 0.0;
			Invoice employee = new Invoice(1, iname, qty, QTY_price);
			//System.out.println(employee.getSno() + " " + employee.getIname() + " " + employee.getQty());
			session.save(employee);
			session.getTransaction().commit();
			net+=QTY_price;
		}
		System.out.println("NET TOTAL="+net);
		session.close();
		System.exit(0);
		
	}

}
