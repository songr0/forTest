package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Component("c#")
public class test03 {

    @Deprecated
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Component("c++")
    public class test03Inner {
        public void method01() {
            System.out.println("innerMethod");
        }
    }

    public void method04() {
        System.out.println("outerMethod1");
    }

    @Deprecated
    public void method03() {
        System.out.println("outerMethod2");
    }

    public static void main(String[] args) {
        test03 test = new test03();
        test.setNumber(1);
        System.out.println(test.getNumber());
        System.out.println("test01");
        test03 object = new test03();
        test03Inner obj = object.new test03Inner();
        obj.method01();
        object.method04();
        object.method03();
    }

}
