import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger; 


public class PowerModule {

	public static void main(String arr[]) {
	
		System.out.print("Enter your base number: ");
		Scanner input = new Scanner(System.in);
		BigInteger number1 = input.nextBigInteger();
		System.out.print("Enter the power to your base number: ");
		Scanner power = new Scanner(System.in);
		BigInteger number2 = power.nextBigInteger();
		System.out.print("Enter your modulos to the base with power: ");
		Scanner modulos = new Scanner(System.in);
		BigInteger number3 = modulos.nextBigInteger();

		BigInteger final_result = number1.modPow(number2, number3);
		System.out.println("(" + number1 + "^" + number2 + ")" + "mod " + number3 + " = " + final_result);
		
	}

}
