import java.util.*;

 public class GamblerSimulationWorkshop1 
  {
	public static final int STAKE_AMOUNT= 100;
   public static final int MIN_BET= 1;
	static int TOTAL_AMOUNT_DIFF_IN_MONTH=0;
	static int WON=1;
	static int LOST=0;
	public static void main(String[] args) {
	int maxWon[]= new int[100];
	int maxLost[]= new int[100];
	int month =1;
	  boolean check = true;
	  while(check) {
	     System.out.println(" ******Month"+month+" gambling starts******");
		 int totalAmount = 0;
		 for (int i = 1; i <= 20; i++) {
			 int cashInHand = STAKE_AMOUNT;
			 	while(cashInHand > STAKE_AMOUNT /2 && cashInHand < STAKE_AMOUNT * 1.5) {
			 		int play = (int) Math.floor(Math.random() * 10) % 2;
			 		System.out.println("Gamblers play: "+play);
			 		switch(play) {
		 				case 1:
		 					cashInHand = cashInHand + MIN_BET;
		 					System.out.println("Total current cash gambler has "+cashInHand);
		 					break;
		 				case 0:
		 					cashInHand = cashInHand - MIN_BET;
		 					System.out.println("Total current cash gambler has "+cashInHand);
		 					break;
		 				default:
		 					System.out.println("default");
			 		}
				}
			 	if(cashInHand==(STAKE_AMOUNT / 2) || cashInHand==(STAKE_AMOUNT * 1.5)) {
			 		System.out.println("###############################################");
			 		System.out.println("Player would like to resign for current day"+i);
			 		System.out.println("###############################################");
			 	}
			 	if(cashInHand > STAKE_AMOUNT) {
			 		int amountWonPerDay = cashInHand - STAKE_AMOUNT;
			 		System.out.println("Player won day"+i+" RS "+amountWonPerDay);
			 		System.out.println("#########################################");
			 	}
			 	else if(cashInHand < STAKE_AMOUNT){
			 		int amountLostPerDay = STAKE_AMOUNT - cashInHand;
			 		System.out.println("Player lost day"+i+" RS "+amountLostPerDay);
			 		System.out.println("-----------------------------------");
			 	}
			 	if(cashInHand == (STAKE_AMOUNT * 1.5)) {
			 		maxWon[i] = cashInHand; 
			 	}
			 	else if (cashInHand == 50) {
			 		maxLost[i] = cashInHand;
			 	}
			 	totalAmount = totalAmount + cashInHand;
			 }
			 System.out.println("Luckiest days as following as gambler WON maximum amount");
			 for(int i = 1; i <= 20; i++) {
				 if(maxWon[i] == (STAKE_AMOUNT * 1.5))
				 System.out.println("Day"+i+" won "+maxWon[i]+" $");
			 }
			 System.out.println("*************************************************************");
			 System.out.println("Unluckiest days as following as gambler LOST maximum amount");
			 for(int i = 1; i <= 20; i++) {
				 if(maxLost[i]== (STAKE_AMOUNT / 2))
				 System.out.println("Day"+i+" lost "+maxLost[i]+" $");
			 }
			 System.out.println("*************************************************************************");
			 System.out.println("Total amount player has after 20 days as per day included = "+totalAmount+" $");
			 System.out.println("*************************************************************************");
			 TOTAL_AMOUNT_DIFF_IN_MONTH = totalAmount - STAKE_AMOUNT * 20;
			 if(TOTAL_AMOUNT_DIFF_IN_MONTH > 0) {
			 System.out.println("Total cash gambler won in month"+month+"= "+TOTAL_AMOUNT_DIFF_IN_MONTH+" $");
			 }
			 else if(TOTAL_AMOUNT_DIFF_IN_MONTH < 0) {
				 System.out.println("Total cash gambler lost in month"+month+"= "+TOTAL_AMOUNT_DIFF_IN_MONTH+" $");
			 }
			 else {
				 System.out.println("Total cash gambler neither lost or won in month"+month+"= "+TOTAL_AMOUNT_DIFF_IN_MONTH+" $");
			 }
			 System.out.println();
			 if(TOTAL_AMOUNT_DIFF_IN_MONTH > 0) {
				 System.out.println("Do you want to continue playing for next month");
				 System.out.println("If you want to continue playing type '1'");
				 System.out.println("if you want stop gambling type '2'");
             Scanner sc = new Scanner(System.in);
				 int responseToPlay = sc.nextInt();
				 if(responseToPlay == 1) {
					 check = true;
					 month++;
				 }
				 else {
					 check = false;
					 System.out.println("--Thanks for Playing--");
				 }
			 }
			 else {
				 System.out.println("You are in loss");
				 System.out.println("--Thanks for Playing--");
				 break;
			 }
		 }
	}
}
