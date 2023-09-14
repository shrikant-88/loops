import java.util.Scanner;

public class rotate_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ente only square matrix for result");
        System.out.print("enter rows of matrix : ");
        int i = scan.nextInt();
        System.out.print("enter columns of matrix : ");
        int j = scan.nextInt();
        
        int arr[][] = new int[i][j];
        System.out.println("enter element of array ");
        for (int m = 0 ; m<i;m++) {
            for (int n =0; n<j;n++) {
               arr[m][n] = scan.nextInt();
            }
        }
        for (int a[] : arr) {
            for (int a_ : a) {
                System.out.print(a_ + "    ");
            }
            System.out.println();
        }
       for(int m =0;m<i;m++){
            for(int n =m;n<j;n++){
                int tamp = arr[m][n];
                arr[m][n] = arr[n][m];
                arr[n][m] = tamp;
            }
        }
    
        System.out.println("after transpose");
        for (int a[] : arr) {
            for (int a_ : a) {
                System.out.print(a_ + "    ");
            }
            System.out.println();
        }
        for(int m =0;m<i;m++){
            int li =0; //left_index
            int ri =j-1; //right index

            while (li<ri) {
                int tamp = arr[m][li];
                arr[m][li]= arr[m][ri];
                arr[m][ri]= tamp;
                li++;ss
                ri--;
            }
        }
        System.out.println("matrix rotated successfully");
        for (int a[] : arr) {
            for (int a_ : a) {
                System.out.print(a_ + "    ");
            }
            System.out.println();
        }
}
}