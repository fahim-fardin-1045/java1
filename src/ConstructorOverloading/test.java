package ConstructorOverloading;

public class test {
    public static void main(String[] args) {
        Demo t = new Demo();
        Demo t1 = new Demo(3, 5, 6);
        Demo t2 = new Demo(13, 65);
        Demo t3 = new Demo("fahim", "fardin");

        System.out.println(t.a+" "+t.b+" "+t.c);
        System.out.println(t1.a+" "+t1.g+" "+t1.d);
        System.out.println(t2.a+" "+t2.d);
        System.out.println(t3.e+" "+t3.f);
    }
}