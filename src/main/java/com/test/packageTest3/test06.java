package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Deprecated
@Component("c#")
public class test06 {

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
        String codeName = "java";
        test06 test = new test06();
        if(codeName == "java"){
            test.setNumber(2);
        }
        System.out.println(test.getNumber());
        System.out.println("test01");
        test06 object = new test06();
        test03Inner obj = object.new test03Inner();
        obj.method01();
        object.method05();
        object.method03();
    }

}
