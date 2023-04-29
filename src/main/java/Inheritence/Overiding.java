package Inheritence;


/*Multiple class is needed
We should not change the definition/name of the method but we can change the body
Methods names are same
return type must be same
*/

class CapitalBank{
    double roi() {
        return 0.0;
    }

}

class Valley extends CapitalBank{

    double roi(){
        return 10.5;
    }
}

class BoA extends CapitalBank{

    double roi(){
        return 9.5;
    }
}

public class Overiding {

    public static void main(String[] args) {

        Valley valley  = new Valley();
        System.out.println(valley.roi()); //10.5

        BoA bo  = new BoA();
        System.out.println(bo.roi()); //9.5

        CapitalBank cp = new CapitalBank();
        System.out.println(cp.roi());

    }
}
