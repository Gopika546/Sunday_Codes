/*
Diagonal Line Patterns
Write a Program to print diagonal line using asterisk (*).
Explanation:
User Input: The program starts by prompting the user to enter a value for n.
Outer Loop: The outer loop runs n times, which represents each row of the diagonal line.
Inner Loop:
•	The inner loop runs i times (where i is the current row index).
•	For each iteration, it prints a space to create the indentation.
Print Asterisk: After the inner loop, print the asterisk on the same line, followed by moving to the next line.
Sample Input: 4
Sample Output:
*
   *
      *
        *

*/



import java.util.Scanner;
public class Day_103 
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
                if(i == j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
