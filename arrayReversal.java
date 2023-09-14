public class arrayReversal {
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,12,14};
        int n = arr.length;
        for(int i =0;i<n/2;i++){
            int tamp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=tamp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
