import java.util.Arrays;
import java.util.Scanner ;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] list = {15,12,788,1,-1,-778,2,0};
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        Arrays.sort(list); // Firstly, i sorted the series.
        int minValue = list[0]; // I assigned the first element as the smallest
        int maxValue = list[list.length - 1]; //and the last element as the largest.

        for (int i = 0; i < list.length; i++) {
            /* i have set a condition that if the ith element of the array is
            less than the number and this number is greater than the minimum number. */
            if (list[i] < number) {
                if (list[i] > minValue ) {
                    minValue = list[i];
                }
            }
        }
        System.out.print("The nearest number smaller than the entered number is : " + minValue);

        for (int j = 0; j < list.length; j++) {
            if (list[j] > number ) {
                if (list[j] < maxValue) {
                    maxValue = list[j];
                }
            }
        }
        System.out.print("The nearest number greater than the entered number is : "+ maxValue);
    }
}