import java.util.*;
class Movezeros{
    public int[] moveZeros(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return arr;


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter the array elements consisting zeros ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        Movezeros obj =new Movezeros();
        int[] result=obj.moveZeros(arr);
        System.out.println("after moving zeros "+Arrays.toString(result));

    }
}