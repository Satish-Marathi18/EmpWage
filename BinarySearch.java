public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = { "my", "name", "is", "satish"};
        int rs = serchElement(arr, "satish");
        System.out.println(rs);
    }

    static int serchElement(String[] x, String i) {
        int left=0;
        int right=x.length-1;
        while(left<=right){
            int mid=left+right/2;
            int res=x[mid].compareTo(i);
            if(res==0){
                return mid;
            }
            else if(res<0){
                left=left+1;
            }
            else{
                right=right-1;
            }
        }
        return -1;
    }

    
}
