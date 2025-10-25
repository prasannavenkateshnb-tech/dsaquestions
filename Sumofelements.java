import java.util.Scanner;
public class Sumofelements  {
    public int sumOfElements(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;

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
        Sumofelements obj =new Sumofelements();
        int result=obj.sumOfElements(arr);
        System.out.println("The sum of Elements in an array is "+result);


    }

}
