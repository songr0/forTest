package com.test.packageTest1.testRename;

public class testRename4 {

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        name = "rename";
        this.name = name;
    }

    public String sayHello(){
        return "hello";
    }

    public class InnerClass2{

        public void test(){
            if("rename".equals(name)){
                setName("test");
            }
        }

    }

    public interface InnerInterface{
        public void test();
    }

    private String name;


}
