package com.daniu2021._Example01;
/**
封装一个人类，其属性有姓名、身高、年龄，吃饭和跑步行为，使用关键字private保护身高和年龄在合适的范围内，
并建立测试类进行测试。然后重写toString方法，输出类似10.1.5的第一个toString例子。
 */

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("陈攀");
//        person.setHeight(-26);
        person.setWeight(120);
        person.setHeight(188);

        System.out.println(person.getName());
        System.out.println("身高是："+person.getHeight());
        System.out.println("体重是："+person.getWeight());
        System.out.println(person.toString());

    }
}
