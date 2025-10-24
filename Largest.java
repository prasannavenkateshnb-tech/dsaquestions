import java.util.*;
public class Largest{
    public int largestElement(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of Array elements ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter"+N +"Array elements ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Largest obj=new Largest();
        int result=obj.largestElement(arr);
        System.out.println("The Largest Element in an array  "+result);

    }
}
