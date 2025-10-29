import java.util.*;
class Rearrangearray{
    public int[] rearrangeArray( int[] arr){
        int[] nums=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                nums[pos]=arr[i];
                pos+=2;
            }
            else{
                nums[neg]=arr[i];
                neg+=2;
            }
        }
        return nums;



    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter the array elements consisting of positive and negatives ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        Rearrangearray obj =new Rearrangearray();
        int[] result=obj.rearrangeArray(arr);
        System.out.println("After rearranging positive and negative alternatively "+Arrays.toString(result));

    }
}