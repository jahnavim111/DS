import java.util.Scanner;
import java.util.Arrays;
public class Insertionsort {
    public void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int a[];
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        Insertionsort ob=new Insertionsort();
        ob.insertionSort(a);
        //printing after sorting
        System.out.println(Arrays.toString(a));
    }
}
