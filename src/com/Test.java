package com;

public class Test {

       void f(int i,int...nums){
           System.out.println(i);
           System.out.println(nums[4]);
       }

    public static void main(String[] args) {
        Test t=new Test();
        t.f(12,3,3,4,5,6,2);
    }
}
