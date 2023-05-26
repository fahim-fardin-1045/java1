package ConstructorOverloading;

public class Demo {

    int a,d,g;
    double b;
    String c,e,f;

    Demo() {
        a=23;
        b= 4.0;
        c= "fahim";
    }
    Demo(int x,int y,int z){
       a=x;
       g=y;
       d=z;
    }
    Demo(int x,int y){
        a=x;
        d=y;
    }

    Demo(String x,String y ){

       e=x;
       f=y;
    }
}
