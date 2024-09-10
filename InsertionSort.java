public class InsertionSort {

    // static void sort(int[] x){
    //     int n=x.length;
    //     for(int i=1;i<n;i++){
    //         int curr=x[i];
    //         int j=i-1;
    //         while(j>=0 && curr<x[j]){
    //             x[j+1]=x[j];
    //             j--;
    //         }
    //         x[j+1]=curr;
    //     }
    // }

    static void sort(String[] x){
        int n=x.length;
        for(int i=1;i<n;i++){
            String curr=x[i];
            int j=i-1;
            while(j>=0 && curr.length()<x[j].length()){
                x[j+1]=x[j];
                j--;
            }
            x[j+1]=curr;

        }
    }

    public static void main(String[] args) {
        String[] arr = {"Satish","Vikas","Sati","Tom"};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
