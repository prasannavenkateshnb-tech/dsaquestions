import java.util.*;
class Main{
    public void countEvenOdd(int[] arr){
        int oddCounter=0;
        int evenCounter=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCounter++;
            }
            else{
                oddCounter++;
            }
        }
        System.out.println("The odd numbers count= "+oddCounter);
        System.out.println("The even numbers count= "+evenCounter);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements ");
        int N =sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter the  array elements ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Main obj=new Main();
        obj.countEvenOdd(arr);

    }
}