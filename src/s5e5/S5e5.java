/*
 *April 4
 *Generates a simple math question and asks the user to try and solve it. If they're right, it gives them props.
 */

package s5e5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author eljam3239
 */
public class S5e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows user input to be read
        Random r = new Random(); //allows a random number to be generated
        int num1, num2;
        int operation;
        String operationdisplay = "";
        num1 = r.nextInt(10)+1;//generates first number
        num2 = r.nextInt(10)+1;//generates second number
        operation = r.nextInt(4)+1; //generates a third number that will corrpond to the operation
        
        int computeranswer = 0;
        switch (operation){ //will determine what operation is used
            case 1: computeranswer = num1+num2; break;
            case 2: computeranswer = num1-num2; break;
            case 3: computeranswer = num1*num2; break;
            case 4: computeranswer = num1/num2; break;
        }
         switch (operation){ //allows a string with the operation to be shown
            case 1: operationdisplay = "+"; break;
            case 2: operationdisplay = "-"; break;
            case 3: operationdisplay = "*"; break;
            case 4: operationdisplay = "/"; break;
        }
        System.out.println("what is "+num1+operationdisplay+num2+"?: ");        
        int useranswer = input.nextInt();
        if (useranswer == computeranswer){//tests if user answer is correct
            System.out.println("Nice job!");
        }else {
            System.out.println("Try with another question.");
        }
    }
