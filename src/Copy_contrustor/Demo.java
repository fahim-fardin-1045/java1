package Copy_contrustor;

public class Demo {
    int a;
    String b;

    Demo(){
        a = 10;
        b = "fahim";
        System.out.println(a+" " +b);
    }

    Demo(Demo copy){ //////obj reference

        a= copy.a; ///////copy
        b= copy.b; ///////copy
        System.out.println(a+" " +b);
    }
}
