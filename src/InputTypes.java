import java.util.Scanner;

public class InputTypes {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");
        String four = scan.next();
        System.out.println("Given a string with single line: "+four);

        System.out.println("Enter integer value:");
        int one =scan.nextInt();
        System.out.println("Given integer value:"+one);

        System.out.println("Enter float value:");
        float two = scan.nextFloat();
        System.out.println("Given Float value:"+two);

        System.out.println("Enter double value:");
        double three = scan.nextDouble();
        System.out.println("Given double value:"+three);


        System.out.println("Enter a sentence:");
        String five = scan.nextLine();
        System.out.println("Given sentence: "+five);

        scan.close();

    }

}
