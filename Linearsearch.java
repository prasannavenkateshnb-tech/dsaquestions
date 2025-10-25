import java.util.Scanner;
public class Linearsearch  {
    public void checkElement(int[] arr,int target){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }


        }
        if(flag){
            System.out.println("The element is present  ");
        }
        else{
            System.out.println("The element is  not present  ");
        }






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
        System.out.println("Enter the Target Element  ");
        int target=sc.nextInt();
        Linearsearch obj =new Linearsearch();
        obj.checkElement(arr,target);


    }

}
