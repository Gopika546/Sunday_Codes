/*
Solid Square Asterisk
For any given number n, print solid Squares made with asterisk (*). 
Explanation:
Define the Size: The size of the square is determined by the input number n. 
Loop for Rows: You need to create a loop that will run n times. 
Print Asterisks: Inside the loop, you will need to print a row of asterisks.
Output Each Row: For each iteration, print the string of asterisks.
Sample Input (No. of Rows): n = 4
Sample Output: 
****
****
****
****

*/


import java.util.Scanner;
public class Day_101
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}