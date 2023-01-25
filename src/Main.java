import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Asking a user to put in their top 5 fast foods; storing the input in an array
        //and stopping them after 3 cuz wtf
        //then printing out the contents of the array

        String[] fastF00dArray = new String[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("What is your top 5 fast f00dz???: ");
            String fastF00d = scanner.nextLine();
            fastF00dArray[i] = fastF00d;

        }
        System.out.println("No more memory available, sry: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(fastF00dArray[i]);
        }
    }
}


        //Create an array of five doubles and give each element some value.
// Calculate the sum of all the elements and print the result.
// Calculate the mean/average of the all the elements and print that too.


//double[] newArray = {420.69, 66.6, 69.9, 7.7, 13.5};
//
//double sumOfNums = 0;
//
//
//for (int i = 0; i < newArray.length; i++){
//    sumOfNums = sumOfNums + newArray[i];
//    System.out.println(newArray[i]);
//}
//        double mean = sumOfNums / newArray.length;
//System.out.println("Your grand total is " + sumOfNums);
//System.out.println("The mean of these " + newArray.length + "numbers is " + mean);



        //Use a loop to populate an array with integers from 1 to 20.

//        int[] array = new int[20];
//
//        for (int i = 0; i < 20; i++) {
//            array[i] = i + 1;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }








    //Create an integer array of 10 elements and give each element an arbitrary value.
// Print out the entire array using a loop.

//        int[] arr = {2, 3, 7, 2, 4, 5, 420, 69, 33, 10};
//
//        for (int i = 0; i < arr.length; i++ ){
//            System.out.println(arr[i]);
//        }
//
//
//
//    }
