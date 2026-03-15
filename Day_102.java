/*
Rectangle Pattern using asterisks
Write a program to generate and print a rectangle pattern using asterisks (*). The user will specify the number of rows and columns, and the program will print a rectangle of that size.
Explanation:
Dimensions:
•	The pattern will have a specified number of rows and columns.
•	For example, if the user inputs 4 rows and 5 columns, the output will be a rectangle made up of asterisks with those dimensions.
Sample Input: rows = 4 ; columns = 5
Sample Output:
*****
*****
*****
*****	

*/

import java.util.Scanner;
public class Day_102 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        s.close();
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
