import java.util.*;
import java.io.*;
// import java.util.scanner;
public class CoinChange {
	public static void main (String args[])  {
		int Q, D, N, P, C, amount;
		int i,j,k,m;
		int minCoins = 100;
      int numCoins;
      int savedQ = 0, savedD = 0, savedN = 0, savedP = 0, savedC = 0;
		boolean match;
	
   	Scanner input = new Scanner(System.in);
      System.out.println("Enter Value for Q: ");
		Q=input.nextInt();
      System.out.println("Enter Value for D: ");
		D=input.nextInt();
      System.out.println("Enter Value for N: ");
		N=input.nextInt();
      System.out.println("Enter Value for P: ");
		P=input.nextInt();
      System.out.println("Enter Value for C: ");
		C=input.nextInt();
		match = false;   //initialize match
		
			for (i=Q; i>=0; i--)
				for (j=D; j>=0; j--)
					for (k =N; k>=0; k--)
						for (m=P; m>=0; m--){
							amount = 25*i + 10*j+5*k+1*m;
							if (amount == C){
								match = true;
                        numCoins =  Q + D + N + P;
                        if(numCoins < minCoins) {
                        savedQ = Q;
                        savedD = D;
                        savedN = N;
                        savedP = P;
                        }
							}
						}

			if (!match)
				System.out.println("Cannot dispense the desired amount.");	
		  else  
      System.out.printf("Dispense %d quarters, %d dimes, %d nickels, and %d pennies.\n",savedQ,savedD,savedN,savedP);
      }
			
}//end class