/*
Hollow rectangle Pattern
Write a program to generate and print a hollow rectangle pattern using asterisks (*). The user will specify the number of rows and columns, and the program will print a hollow rectangle of that size.
Explanation
Dimensions:
•	The pattern will have a specified number of rows and columns.
•	For example, if the user inputs 4 rows and 5 columns, the output will create a rectangle with a solid border made of asterisks and hollow spaces in between.
Pattern Structure:
•	The first and last rows are filled with asterisks.
•	The rows in between have asterisks only at the start and end, with spaces in between.
Sample Input: rows = 4; columns = 5
Sample Output:
*****
*   *
*   *
*****

*/


import java.util.Scanner;
public class Day_201
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(i == 0 || j == 0 || i == r - 1 || j == c - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        s.close();
    }
}
