package com.test.packageTest3;

import org.springframework.stereotype.Component;

@Component("c#")
public class test11 {

    private int number;
    private int lifeCycle;
    private int lifecycle;
    @Deprecated
    private String uniqueAccountName;
    private String passWord = "abc123";

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
                System.out.println("inner04Method2");
            }

        }

        public void method01() {
            test03Inner04 test04 = new test03Inner04();
            test04.method04();
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

    @Deprecated
    public void method05() {
        System.out.println("outerMethod1");
    }

    @Deprecated
    public void method03() {
        System.out.println("outerMethod2");
    }

    public static void main(String[] args) {
        String codeName = "java";
        test11 test = new test11();
        if (codeName == "java") {
            test.setNumber(3);
        }
        System.out.println(test.getNumber());
        System.out.println("test01");
        test11 object = new test11();
        test03Inner obj = object.new test03Inner();
        obj.method01();
        object.method05();
        object.method03();
    }

}
