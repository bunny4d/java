import java.util.Scanner;

class calculator{
    public void add(int a,int b){
        System.out.println("addition = " +(a+b));

    }
    public void diff(int a,int b ){
        System.out.println("subtraction="+(a-b));

    }
}
class advancedcalculator extends calculator{
    public void multiply(int a,int b ) {
        System.out.println("multiplication="+(a*b));

    }

}
class unlimtedcaluator extends advancedcalculator{
    public void division(int a, int b){
        if (b==0){
            System.out.println("denominator should be zero ");
        }
        else{
            System.out.println("division="+(a/b));
        }

        
}}
public class Multilevel{
public static void main(String[]args){
    System.out.println("");
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number :" );
    int a = input.nextInt();
    int b = input.nextInt();
    unlimtedcaluator u = new unlimtedcaluator();
    u.add ( a , b );
    u.diff( a , b );
    u.multiply( a , b );
    u.division( a , b );
    


    
}
}
