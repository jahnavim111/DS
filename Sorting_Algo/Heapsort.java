import java.util.Scanner;
import java.util.Arrays;
public class Heapsort {
    public void heapSort(int arr[]){
        int n=arr.length;

        //build max heap
        //calling heapify on each subtree from bottom up manner
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        //extracting element one by one and swapping it with the last element in the array
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            //call heapify on reduced heap in top down manner
            heapify(arr,i,0);
        }
    }

    public void heapify(int arr[],int n,int i){
        //set root to largest
        int largest=i; 
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        //if largest != root then
        if(largest != i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            //recursively heapifying the affected sub tree
            heapify(arr,n,largest);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int a[];
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        Heapsort ob=new Heapsort();
        ob.heapSort(a);
        //printing after sorting
        System.out.println(Arrays.toString(a));
    }
}
