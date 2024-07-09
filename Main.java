import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //"FINISH
        //1.Write a program to find all of the longest word in a given dictionary.
//        String[] myArray={ "cat", "dog", "red", "is", "am" };
//        ArrayList<String> arraylongest=new ArrayList<>();
//        String longest=myArray[0];
//
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i].length()>=longest.length()){
//                arraylongest.add(myArray[i]);
//            }
//        }
//        System.out.println(arraylongest);

        //"FINISH"
        //2. Write a program that displays the number of occurrences of an element in the array.
        //[1,1,1,3,3,5]
//        System.out.println("Enter number to get occurrences");
//        int[] arrayNumber={1,1,1,3,3,5};
//        int usernum=input.nextInt();
//        int counter=0;
//        for (int num:arrayNumber){
//            if (usernum==num){
//                counter++;
//            }
//        }
//        System.out.println(usernum+" occurs "+counter+" times");


        //3.Write a program to find the k largest elements in a given array. Elements in the array can be in
        //any order.
        //"FINISH"
//        System.out.println("Enter number to get the largest: ");
//        int[] myArrNumber={1, 4, 17, 7, 25, 3, 100};
//        int userWant= input.nextInt();
//        if (userWant>myArrNumber.length) {
//            System.out.println("There are only " + myArrNumber.length + " elements in array.");
//        }else {
//            int indexmyArrN = myArrNumber.length - 1;
//            int index = 0;
//            int temporally = 0;
//            Arrays.sort(myArrNumber);
//            while (indexmyArrN > index) {
//                temporally = myArrNumber[indexmyArrN];
//                myArrNumber[indexmyArrN] = myArrNumber[index];
//                myArrNumber[index] = temporally;
//                index++;
//                indexmyArrN--;
//            }
//            System.out.println(userWant + " largest elements of the said array are:");
//            for (int i = 0; i <= userWant - 1; i++) {
//                System.out.print(myArrNumber[i] + " ");
//            }
//        }

//        //4. Create a method to reverse an array of integers. Implement the method without creating a new
//        //array.
//        //5,4,3,2,1
        //FINISH
//        int[] revers={5,4,3,2,1};
//        int left=0;
//        int right=revers.length-1;
//        int temp=0;
//        while (right>left){
//            temp=revers[left];
//            revers[left]=revers[right];
//            revers[right]=temp;
//            right--;
//            left++;
//        }
//        System.out.println("revers Array: "+Arrays.toString(revers));

        //5. Write a menu-driven Java program
        //1. Accept elements of an array //length array and add element
        //2. Display elements of an array//display array
        //3. Search the element within array //search an element
        //4. Sort the array //sort only
        //5. To Stop//exit
//        int[] array = null;
//        int choice;
//        do {
//            System.out.println("\nMenu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search for an element in the array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. Stop");
//
//            System.out.print("Enter your choice: ");
//             choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    array = acceptElements(input);
//                    break;
//                case 2:
//                    displayElements(array);
//                    break;
//                case 3:
//                    searchElement(array, input);
//                    break;
//                case 4:
//                    sortArray(array);
//                    break;
//                case 5:
//                    System.out.println("Stop program");
//                    break;
//                default:
//                    System.out.println("enter number from 1 to 5.");
//                    break;
//            }
//
//        } while (choice != 5);


        //========= 6 =============
//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers
//        System.out.print("Enter the minimum value of the range: ");
//        int min = input.nextInt();
//        System.out.print("Enter the maximum value of the range:: ");
//        int max = input.nextInt();
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = input.nextInt();
//        System.out.println("Random numbers within the specified range:");
//        getRandom(min, max, count);
        //End ========== 6 =========



        //========= 7 ==============
//        System.out.println("Enter your password");
//        String password = input.next();
//        int result = checkLength(password.length()) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//        Total(result);



        //8.Create a method that generates the Fibonacci sequence up to a specified number of terms.
//        fibonacci(10);
    }





    //7. Method for Q7
//    static int checkLength(int passwordLength) {
//        //• Length: "0-5 characters (0 points)", "6-7 characters (2 points)", 8 or more characters
//        //(3 points).
//        if (passwordLength >= 8) {
//            return 3;
//        } else if (passwordLength >= 6) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//    static int checkSpecialCharacters(String password) {
//        //• Special characters: Absence (0 points), Presence (2 points).
//        for (char c : password.toCharArray()) {
//            if (Character.isDigit(c)) {
//                System.out.println(Character.isDigit(c));
//                return 2;
//            }
//        }
//        return 0;
//    }
//
//    static int checkUpperCaseLowerCase(String password) {
//        boolean isUpper = !password.equals(password.toLowerCase());
//        boolean isLower = !password.equals(password.toLowerCase());
//        if (isLower && isUpper) {
//            return 3;
//        } else {
//            return 0;
//        }
//    }
//    static void Total(int re) {
//        if (re >= 8) {
//            System.out.println("password is strong");
//        } else if (re >= 6) {
//            System.out.println("password is normal");
//        } else {
//            System.out.println("password is week");
//        }
//    }



    // 8. Method Q8
//    public static void fibonacci(int num) {
//        int first = 0;
//        int second = 1;
//        System.out.println("Fibonacci sequence with " + num + " terms:");
//        System.out.print(first + " " + second + " ");
//        for (int i = 2; i < num; i++) {
//            int next = first + second;
//            System.out.print(next + " ");
//            first = second;
//            second = next;
//        }
//    }

//Start 5
    //Method for Q5
// ===== 5 ====
//public static int[] acceptElements(Scanner input) {
//    System.out.print("Enter the size of the array: ");
//    int size = input.nextInt();
//    int[] arr = new int[size];
//    System.out.println("Enter elements of array:");
//    for (int i = 0; i < size; i++) {
//        arr[i] = input.nextInt();
//    }
//    return arr;
//}
//    public static void displayElements(int[] arr) {
//        if (arr == null) {
//            System.out.println("Array is empty.");
//        } else {
//            System.out.print("Array elements: ");
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//        }
//    }
//    public static void searchElement(int[] arr, Scanner input) {
//        if (arr == null) {
//            System.out.println("Array is empty");
//            return;
//        }
//        System.out.print("Enter element to search: ");
//        int value = input.nextInt();
//        boolean found = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) {
//                System.out.println("Element " + value + " found at index " + i);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Element " + value + " not found in array.");
//        }
//    }
//    public static void sortArray(int[] arr) {
//        if (arr == null) {
//            System.out.println("Array is empty.");
//        }
//
//        Arrays.sort(arr);
//        System.out.print("order: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
    //END ===== 5 ======

    //======== 6 ================
    //Method for Q6
//    public static void getRandom(int min, int max, int count) {
//        Random random = new Random();
//
//        for (int i = 0; i < count; i++) {
//            int rNumber = random.nextInt(max - min + 1) + min;
//            System.out.print(rNumber+" ");
//        }
//    }
}