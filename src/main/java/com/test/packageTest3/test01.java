package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Component("c")
public class test01 {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Deprecated
    public class test01Inner {
        public void method01() {
            System.out.println("innerMethod");
        }
    }

    public void method02() {
        System.out.println("outerMethod1");
    }

    @Deprecated
    public void method03() {
        System.out.println("outerMethod2");
    }

    public static void main(String[] args) {
        test01 test = new test01();
        test.setNumber(1);
        System.out.println(test.getNumber());
        System.out.println("test01");
        test01 object = new test01();
        test01Inner obj = object.new test01Inner();
        obj.method01();
        object.method02();
        object.method03();
    }

}
