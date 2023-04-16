package Java_Basic;

public class Method_Overloading {

/*
    Polymorhism:can be achieved by method overloading and method overriding

    Shape- cirlce, triangle, oval, sqauire
    STATE- NY, Cal, Texas, Florida, Ohio, Atlanta
    Lisa- Women, Daughter, Mother, Wife, Sister

    add(10,20);
    add(10,20,30);
    add(10, 20 ,30 ,40)


    add01(10,20);
    add02(10,20,30);
    add03(10, 20 ,30 ,40)

    300000000000000.00
 */


    /*Method Overloading Rules
    * Methods names should/must be same
    * Numbers of parameters should / must be different
    * Data type must be different(if parameters count is same)
    * Order of parameters must be different
    * */
    int x, y;
    double d;

    void sum(){
        x=20;
        y=50;
        System.out.println(x+y);
    }

    void sum(int a, int b){

        x=a;
        y=b;
        System.out.println(x+y);
    }

    void sum(int a, double b){

        x=a;
        d=b;
        System.out.println(x+y);
    }

    void sum(double b, int a){

        x=a;
        d=b;
        System.out.println(x+y);
    }

}
