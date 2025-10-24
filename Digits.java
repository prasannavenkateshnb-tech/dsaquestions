import java.util.*;
public class Digits {
    public int countDigits(int num){
        int counter=0;
        while(num>0){
            int lastDigit=num%10;
            counter++;
            num=num/10;
        }
        return counter;

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        Digits obj=new Digits();
        int result=obj.countDigits(num);
        System.out.println("The Total digits in the number is "+result);

    }
    
}
