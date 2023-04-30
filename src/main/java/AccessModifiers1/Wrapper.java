package AccessModifiers1;

public class Wrapper {

   /*
   * The wrapper class in java provides the mechanism to converts primitive into object and also object into primitive
   *
   * int     Integer
   * short   Short
   * byte      Byte
   * long       Long
   * float      Float
   * double     Double
   * char       Character
   * boolean      Boolean
   *
   * */

    int a =100;
    Integer m= 100;



    void dis(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        byte b =10;
        short s =20;
        char c= 'B';

        Byte byteobj = b;
        System.out.println(byteobj);





        Wrapper wp = new Wrapper();

    }

}
