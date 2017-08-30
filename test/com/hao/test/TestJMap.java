package com.hao.test;

import java.util.Scanner;

/**
 * <code>TestJMap</code>
 *
 * @description:
 * @author: Hao Xueqiang(xueqiang.hao@tendcloud.com)
 * @creation: 2017/6/30
 * @version: 1.0
 */
public class TestJMap {
    private static void fun1(){
        Car car1 = new Car();
        Car car2 = new Car();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int val = scanner.nextInt();
        System.out.println(val+":"+name);
    }

    public static void main(String[] args) {
        TestJMap.fun1();
    }
}
