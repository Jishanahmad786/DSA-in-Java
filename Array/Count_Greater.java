// Problem -> Write a Java program to count the number of elements in an array that are greater than a given value x
public class Count_Greater {

    public static void Solve(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3, 7, 8, 6 };
        int x = 4;
        Solve(arr, x);
    }

}
