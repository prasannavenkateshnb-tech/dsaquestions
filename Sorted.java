import java.util.Scanner;
public class Sorted {
    public boolean checkSorted(int[] arr){
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){

            }
            else{
                return false;
            }

        }
        return true;


    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Array elements ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter the Array elements ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        Sorted obj =new Sorted();
        boolean result=obj.checkSorted(arr);
        System.out.println("The array is "+result);

    }
    
}
