import java.util.Scanner;

/*
Create a method int[] userInput(), will return an array of values entered by user.
Create another method int[] sumOfGivenArrays(int[] arr, int[] brr) and will return an array containing
sum of elements present on same index of arr and brr.

WAP to accept two array from user, and perform the sum of arrays, and display all the arrays

 */
public class ArrayQuestion {
    public int[] userInput(){
        int[] response = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < response.length; i++) {
            System.out.println("enter a number");
            response[i]= scanner.nextInt();
        }
        return response;
    }
}
