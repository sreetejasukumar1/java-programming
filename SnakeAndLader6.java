   public class SnakeAndLader6 {
   public static final int NO_PLAY = 0;
   public static final int LADDER = 1;
   public static final int SNAKE = 2;
   public static final int START = 0;


   public static void main(String[] args){
      int pos = 0, cntr1 = 0, cntr2 = 0, cntr3 = 0, cntr4 = 0;
      System.out.println("Starting position of player is: " + START);
      while(pos < 100){
      int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		cntr1++;
      System.out.println("Number on rolled dice is : " +roll);
      int con = (int) (Math.floor(Math.random() * 10) % 3);
      System.out.println("Condition: " +con);
      switch (con){
            case NO_PLAY:
                  System.out.println("New Position is: " + pos);
						cntr4++;
                  break;
            case LADDER:
                  pos = pos + roll;
                  if(pos <= 100)
                  System.out.println("New Position is: " + pos);
                  else{
						pos = pos - roll;
                  System.out.println("Remains at same position: " + pos);
						}
						cntr2++;
                  break;
            case SNAKE:
                  pos = pos - roll;
                  if (pos <= 100){
                  if (pos >= 0 ){
                  System.out.println("New Position is: " + pos);
						}
                  else{
                  pos = 0;
                  System.out.println("New Position is: " + pos);
                  }
						}
                  else{
                  System.out.println("New position is:" + pos);
						}
						cntr3++;
                  break;
            default:
                  System.out.println("Default");
                  break;
         }
      }
      System.out.println();
		System.out.println("Player ROLLED DICE "+cntr1+" time and got SNAKE "+cntr3+" times and got LADDER "+cntr2+" times and got NO PLAY "+cntr4+" times to win the game");
      if (pos == 100)
      System.out.println("-------------------");
      System.out.println("    PLAYER WON");
      System.out.println("-------------------");
      }

}
