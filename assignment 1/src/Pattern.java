import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
/**
 * isPrime - this function to check if the number is Prime number or not and return true or false.
 * main - to make user enter start and the end number.
 * @{Scanner}: sc object from it, it makes user to input.
 * Return: all Prime Numbers.
 * */
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please number n :");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i -= 2) {
            for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
