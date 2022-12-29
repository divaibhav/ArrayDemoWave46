import java.util.Scanner;

/*
Create a method int[] userInput(), will return an array of values entered by user.
Create another method int[] sumOfGivenArrays(int[] arr, int[] brr) and will return an array containing
sum of elements present on same index of arr and brr.

WAP to accept two array from user, and perform the sum of arrays, and display all the arrays

 */
public class ArrayQuestion {
    public static void main(String[] args) {
        ArrayQuestion arrayQuestion = new ArrayQuestion();
        int[] inputArray1 = arrayQuestion.userInput();
        int[] myArray = arrayQuestion.userInput();//{10,80,30,50,60,70,90};
        int[] sumOfArray = arrayQuestion.sumOfGivenArrays(myArray, inputArray1);
        System.out.println("array 1");
        arrayQuestion.printArray(inputArray1);
        System.out.println("array 2");
        arrayQuestion.printArray(myArray);
        System.out.println("sum of arrays");
        arrayQuestion.printArray(sumOfArray);

    }

    public int[] userInput() {
        int[] response = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter values for initializing array");
        for (int i = 0; i < response.length; i++) {
            System.out.println("enter a number");
            response[i] = scanner.nextInt();
        }
        return response;
    }

    public int[] sumOfGivenArrays(int[] arr, int[] brr) {
        //if length of given arrays are different, we can not add them, then return null;
        int[] response = null;
        if (arr.length == brr.length) {
            response = new int[arr.length];
            for (int i = 0; i < response.length; i++) {
                response[i] = arr[i] + brr[i];
            }
        }
        return response;
    }

    public void printArray(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println();
        }
    }
}
