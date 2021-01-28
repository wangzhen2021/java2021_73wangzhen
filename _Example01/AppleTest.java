package com.daniu2021._Example01;
/**
作业二：封装一苹果类，其属性有品牌、尺寸、开机状态，打电话和上网行为，
使用关键字private保护尺寸和开机状态在合适的范围内，并建立测试类进行测试。
然后重写toString方法，输出类似10.1.5的第二个toString例子。
 */

public class AppleTest {
    public static void main(String[] args) {
        Apple apple = new Apple("Macbook",12.3,true);

        System.out.println(apple.toString());
    }
}
