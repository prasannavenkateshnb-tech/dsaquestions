import java.util.Scanner;
public class Missingnumber  {
    public int missingNumber(int[] arr,int N){
        int summation= (N * (N + 1)) / 2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return summation-sum;

    }


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Array elements ");
        int N=sc.nextInt();
        int[] arr=new int[N-1];
        System.out.println("Enter the Array elements ");
        for(int i=0;i<N-1;i++){
            arr[i]=sc.nextInt();

        }
        Missingnumber obj =new Missingnumber();
        int result=obj.missingNumber(arr,N);
        System.out.println("The Mising element in an array is "+result);


    }

}
