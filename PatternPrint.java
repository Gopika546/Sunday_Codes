/* *Inverted Right Triangle
Write a program to print the inverted right triangle pattern using stars, given the number of rows in a triangle(The left triangle star pattern is a triangle with a perpendicular line at the left side of the triangle.)
Hint:
•	Outer Loop: Use a loop that starts from the total number of rows and decrements to 1.
•	Space Printing: Before printing stars, create a loop that prints spaces. This loop should run from the total number of rows down to the current row number (to align the stars to the right).
•	Star Printing: After printing spaces, create another loop to print stars. This loop should run from 1 to the current row number.
Sample Input: 5
Sample Output:
* * * * *
  * * * *
    * * *
      * * 
        *	

*/



public class PatternPrint {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}