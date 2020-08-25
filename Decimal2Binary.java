/***********************************************************************************************************************
 * @file   Decimal2Binary.java
 * @brief  The user enters any number below 100, then we convert it to it's binary equivalent using remainder & division
 * @author Heba Beshai
 * @date   January 29, 2016
 ***********************************************************************************************************************/
package Binary2Decimal;
import java.util.Scanner;
public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // Define Variables to be Used in this program
            int result1, result2, result3, result4, result5, result6, result7;
            int origNum;


        // Ask the user to enter the data needed by the program
            System.out.println("Decimal 2 Binary =================");
            System.out.print("Please enter an integer that is less than or equal to 100: ");
            origNum = input.nextInt();

        // Do the needed calculations, use 1 or more variables to store your results
            result1 = origNum%2;
            origNum = origNum/2;
            result2 = origNum%2;
            origNum = origNum/2;
            result3 = origNum%2;
            origNum = origNum/2;
            result4 = origNum%2;
            origNum = origNum/2;
            result5 = origNum%2;
            origNum = origNum/2;
            result6 = origNum%2;
            origNum = origNum/2;
            result7 = origNum%2;
            origNum = origNum/2;

            sb.append(result7);
            sb.append(result6);
            sb.append(result5);
            sb.append(result4);
            sb.append(result3);
            sb.append(result2);
            sb.append(result1);

        // Print the results to the screen
             System.out.println("The number you entered in binary is: " + sb.toString());











    }

}
