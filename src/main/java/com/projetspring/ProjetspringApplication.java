package com.projetspring;

import com.projetspring.Model.AppelOffre;
import com.projetspring.Model.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.print.attribute.DateTimeSyntax;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ProjetspringApplication {

	static Date a1=new Date("2022/02/03");
	static Date a2=new Date("2022/04/03");
	public static void main(String[] args) {
		SpringApplication.run(ProjetspringApplication.class, args);


    long x = a2.getTime() - a1.getTime();

	}
}
