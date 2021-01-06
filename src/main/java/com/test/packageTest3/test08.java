package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Deprecated
@Component("c#")
public class test08 {

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

        public class test03Inner04 {
            public void method04() {
                System.out.println("inner04Method");
            }

        }

        public void method01() {
            System.out.println("innerMethod");
        }
    }

    public class test05Inner {
        String code = "java";

        public void method02() {
            if (code == "java") {
                System.out.println("innerMethod2");
            }
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
        test08 test = new test08();
        if (codeName == "java") {
            test.setNumber(3);
        }
        System.out.println(test.getNumber());
        System.out.println("test01");
        test08 object = new test08();
        test03Inner obj = object.new test03Inner();
        obj.method01();
        object.method05();
        object.method03();
    }

}
