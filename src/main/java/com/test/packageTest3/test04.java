package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Deprecated
@Component("c#")
public class test04 {

    @Deprecated
    private int number;
    private String name;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Component("c")
    public class test03Inner {
        public void method01() {
            System.out.println("innerMethod");
        }
    }

    public class test04Inner {
        public void method02() {
            System.out.println("innerMethod2");
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
        test04 test = new test04();
        test.setNumber(1);
        System.out.println(test.getNumber());
        System.out.println("test01");
        test04 object = new test04();
        test03Inner obj = object.new test03Inner();
        obj.method01();
        object.method04();
        object.method03();
    }

}
