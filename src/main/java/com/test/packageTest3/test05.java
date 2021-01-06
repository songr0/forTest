package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Deprecated
@Component("c#")
public class test05 {

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

    public class test05Inner {
        public void method02() {
            System.out.println("innerMethod2");
        }
    }

    public void method05() {
        System.out.println("outerMethod1");
    }

    @Deprecated
    public void method03() {
        System.out.println("outerMethod2");
    }

    public static void main(String[] args) {
        String code = "java";
        test05 test = new test05();
        test.setNumber(2);
        System.out.println(test.getNumber());
        System.out.println("test01");
        test05 object = new test05();
        test03Inner obj = object.new test03Inner();
        obj.method01();
        object.method05();
        object.method03();
    }

}
