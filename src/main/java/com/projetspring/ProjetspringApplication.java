package com.projetspring;

import com.projetspring.Model.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.print.attribute.DateTimeSyntax;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ProjetspringApplication {
//static Date a;
//static Date b;
	public static void main(String[] args) {
		SpringApplication.run(ProjetspringApplication.class, args);
	Reference r=new Reference();

//		Reference r2=new Reference();
//		SimpleDateFormat a = new SimpleDateFormat("MM/dd/yy");
//		try {
//
//
//			r.setDatereference(a.parse("02/03/2022"));
//			r2.setDatereference(r.getDatereference());
//		}
//		catch (Exception e){}
//		System.out.println(r.getDatereference());




		//a=new Date("2022/03/02");
//		SimpleDateFormat a = new SimpleDateFormat("MM/dd/yy");
//		SimpleDateFormat b = new SimpleDateFormat("MM/dd/yy");
//		try {
//			long c;
//			c = b.parse("02/03/2022").getTime() - a.parse("02/03/2022").getTime();
//			System.out.println("fffffffffff");
//			System.out.println(c);
//		} catch (Exception e) {
//			System.out.println("kkkkkkkkkkk");
//		}
	}
}
