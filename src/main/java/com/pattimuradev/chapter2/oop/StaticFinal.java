package com.pattimuradev.chapter2.oop;

public class StaticFinal {
    public void contohMethod(){
        // inner class pake static
        InnerClassStatic.methodPing();


        //inner class non static
        InnerClass iclass = new InnerClass();
        iclass.methodDeep();
    }

    public static class InnerClassStatic{
        public static void methodPing(){
            System.out.println("ping");
        }
    }

    public class InnerClass{
        public void methodDeep(){
            System.out.println("beep");
        }
    }
}
