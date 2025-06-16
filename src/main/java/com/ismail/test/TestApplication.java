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
        System.out.println(tst+tst4);
        System.out.println(3+3) ;
        //int x=6, y=1, z=12;
       // System.out.print(x+y+z);
        int x,y, z ;
                x=y=y=5 ;
                        z=6 ;
                        x=z+z;
                        z=x-z;
                        x=x-z;
        System.out.println(x) ;
        float aaaa = 12.22f;
		double qqqq=	12.111d;
		long dqqq = 1233L;
		double mydaaaaa = 12.123456789d;
		int myiiii = (int) mydaaaaa;
		System.out.println(myiiii);
		double myDouble = 12.123456789d;
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble);   // Outputs 9.78
		System.out.println(myInt);
		//the next line is needed for web apps
		//SpringApplication.run(TestApplication.class, args);
	}
}
