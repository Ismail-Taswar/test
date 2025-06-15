package com.ismail.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) {
		System.out.println("hello Worlds") ;
		System.out.print("test1 ") ;
		System.out.print("test2") ;
		System.out.print("123//") ;
		String name = "123";
		System.out.println(name) ;
		int tst = 12 ;
		System.out.println(tst);
		float tst2 = 12.12f;
		System.out.println(tst2) ;
		float tst23 = 12.12232f ;
		System.out.println(tst23) ;
		char tst22 = 'a';
		System.out.println(tst22) ;
		boolean tst3 = true ;
		System.out.println(tst3) ;
		final int tst4 = 11111;
		tst3=false ;
		System.out.println(tst4) ;
		//tst4=11;

		//the next line is needed for web apps
		SpringApplication.run(TestApplication.class, args);
	}
}
