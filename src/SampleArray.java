public class SampleArray {
    public static void main(String[] args) {
        //syntax
        //type [] arrayName = new type[int size];
        int size = 10;
        //int[] arr = new int[size];
        //System.out.println(arr);
        //int[] arr;
        int[] arr = new int[]{10,50,20,30};
        arr[0] = 500;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr);

    }
}
