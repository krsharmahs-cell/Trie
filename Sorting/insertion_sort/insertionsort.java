import java.util.Scanner;
public class insertionsort{

      public static void sort(int [] arr,int len)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key= arr[i];
            int j= i-1;
             while(j>=0 && arr[j]> key)
             {
                arr[j+1]= arr[j];
                j--;
             }

             arr[j+1]=key;
        }
       
        }
    

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int len= s.nextInt();
        int [] arr= new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=s.nextInt();
        }
        

        sort(arr, len);
    
        System.out.print("The Sorted array is : ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
    
