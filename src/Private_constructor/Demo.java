package Private_constructor;

public class Demo {
    int a;
    double b;
    String c;

    private Demo(){////// can used with in class
        a=1045;
        b= 4.00;
        c="fahim fardin";
        System.out.printf(c+"\n"+a+"\n"+b);
    }

    public static void main(String[] args) {
        Demo t1 = new Demo();
    }
}
