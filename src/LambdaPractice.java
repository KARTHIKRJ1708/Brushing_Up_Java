
import java.util.ArrayList;
import java.util.List;

interface functionInterface0 {
    void abstractFun();

    default void nonabstractFun(int y){
        System.out.println("Method definition.."+y);
    }

}

interface functionInterface1 {
    void abstractFun(int x);

    default void nonabstractFun(int y){
        System.out.println("Method definition.."+y);
    }

}

interface functionInterface2 {
    void abstractFun(int x, String s);

    default void nonabstractFun(int y){
        System.out.println("Method definition.."+y);
    }

}


public class LambdaPractice {

    public static void main(String args[]) {

        //Zero parameter Lambda
        functionInterface0 obj0= () -> System.out.println("Zero parameter lambda");
        obj0.abstractFun();
        //single parameter Lambda
        functionInterface1 obj1 = (int x) -> {
            System.out.println("Single Parameter Lambda x is:"+2*x);
        };
        obj1.abstractFun(5);
        obj1.nonabstractFun(6);

        //multiple parameter Lambda
        functionInterface2 obj2 = (int x, String s) -> {
            System.out.println("Multiple Parameter Lambda x is:"+2*x+"and String value is"+s.concat("Lambda"));
        };
        obj2.abstractFun(5, "Multiple");
        obj2.nonabstractFun(6);

        //Using Lambda print odd and even elements from ArrayList
        List<Integer> setofOddandEvens = new ArrayList<Integer>();
        setofOddandEvens.add(2);
        setofOddandEvens.add(5);
        setofOddandEvens.add(6);setofOddandEvens.add(8);setofOddandEvens.add(12);setofOddandEvens.add(23);setofOddandEvens.add(27);
        setofOddandEvens.add(29);
        System.out.println("Display All Numbers"+"\n");
        setofOddandEvens.forEach(n -> System.out.println(n));

        System.out.println("Display Even Numbers"+"\n");
        setofOddandEvens.forEach(n -> {
            if(n%2==0)
                System.out.println(n);
        });
        System.out.println("Display Odd Numbers"+"\n");
        setofOddandEvens.forEach(n -> {
            if(n%2!=0)
                System.out.println(n);
        });















    }

}
