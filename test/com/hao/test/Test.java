package com.hao.test;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * <code>Test</code>
 *
 * @description:
 * @author: Hao Xueqiang(xueqiang.hao@tendcloud.com)
 * @creation: 2016/12/2
 * @version: 1.0
 */
public class Test {
    public static void fun1(){
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个字符串：");
        try {
            String str = strin.readLine();
            System.out.println("第一个："+str);
            Stack<Character> stack = new Stack<>();
            for(char c : str.toCharArray()){
                stack.push(c);
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.empty()){
                sb.append(stack.pop());
            }
            System.out.println("反转后："+sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fun2(){
        String s1 = new String("abcdefg1");
        String s2 = new String("abcdefg1");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("s1 and s2:" + s1 == s2);
        Car car1 = new Car();
        car1.setId(1);
        car1.setName("Audi");
        car1.setPrice(350000f);
        Car car2 = new Car();
        car2.setId(2);
        car2.setName("Audi");
        car2.setPrice(350000f);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println("car1 and car2:"+(car1 == car2));
    }

    private static void fun3(){
        int a = 256;
        String a1 = Integer.toBinaryString(a);
        System.out.println(a1);
        int b = a&0xFF;
        String b1 = Integer.toBinaryString(0xFF);
        System.out.println(b1);
        System.out.println(b);
    }

    public static void main(String[] args){
        Test.fun3();
    }
}
