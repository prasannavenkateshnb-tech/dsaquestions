import java.util.*;
class Reversearray{
    public int[] reverseAnArray(int[] arr){
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return arr;

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
        Reversearray obj=new Reversearray();
        int[] result=obj.reverseAnArray(arr);//1 2 3 4 5
        System.out.println("The Array after reversing"+Arrays.toString(result));

    }
}