package com.example.springbootzj.demo;

public class Demo {
}

class avs{
    public void fun(){
        int i = 0;
        switch(i) {
            case 1:
                System.out.println("====");
            case 0:
                System.out.println("000000");
            default:
                System.out.println("22222");
        }
    }

    public static void main(String[] args) {
        int i = 0;
        switch(i) {
            case 1:
                System.out.println("====");
                break;
            case 0:
                System.out.println("000000");
                break;
            default:
                System.out.println("22222");
                break;
        }

        short a = 1;
        a += 1;

        int n = 2 << 3;
        System.out.println(n);

        String s = new String("1232");
        s = s + "345";
        System.out.println(s);
    }
}
