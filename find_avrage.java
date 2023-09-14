public class find_avrage {
    public static void main(String[] args) {
        double arr[] = {2,4,7,1,7};
        double sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i<arr.length);
        double avrage = sum/arr.length;
        System.out.println("avrage = " + avrage);
    }
}
