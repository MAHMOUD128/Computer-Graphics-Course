import java.util.Arrays;
import java.util.Scanner;

/**
     * main - Read 10 Number from user and Print Max and Min number in Array
     * @{Scanner}: this to Read Input From User
     * Return: Max number by using "Arrays.stream(guys).max().getAsInt()",
     * and Min number by using "Arrays.stream(guys).min().getAsInt()".
     * */

public class Read {
    public static void main(String[] args)
    {
        int guys[] = new int[10];
        //this to Read input from user
        Scanner sc = new Scanner(System.in); // Define input

        for(int i = 0; i< guys.length;i++)
        {
            System.out.println("Enter number "+(i+1));
            guys[i] = sc.nextInt(); // read input from user
        }

        System.out.println("the max number is : "+ Arrays.stream(guys).max().getAsInt()+", and min number is : ,"+Arrays.stream(guys).min().getAsInt());
    }
}