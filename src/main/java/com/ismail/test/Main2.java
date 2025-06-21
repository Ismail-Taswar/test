package com.ismail.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
public class Main2 {
    static int myMethod(int x) {
        return 6+x ;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(sum(10));
    }
}
*/
public class Main2 {

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
}
import java.time.LocalTime;
