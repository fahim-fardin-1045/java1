package Constructor;

public class Demo {

    int x,y,z;
    String d;

    Demo() {
        System.out.println("my name is fahim ");
    }
    Demo(int a,int b,int c){
        x=a;
        y=b;
        z=c;

    }
    Demo(String a,String b ){
        System.out.println(a+" "+b);
    }
    void display() {
        System.out.println(x+" "+y+" "+z);
    }
}
