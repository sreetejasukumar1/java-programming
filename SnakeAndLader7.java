public class  SnakeAndLader7 {
   public static final int NO_PLAY = 0;
   public static final int LADDER = 1;
   public static final int SNAKE = 2;
   public static final int START = 0;


   public static void main(String[] args){
      int pos = 0, pos1 = 0, cntr1 = 0, cntr2 = 0, cntr3 = 0, cntr4 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		//int con = 1;
      System.out.println("Starting position of player is: " + START);
      while(pos < 100 && pos1 < 100){
		int con = 1;
a:		while(con == 1){
		System.out.println("PLAYER 1");
      int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		cntr1++;
      System.out.println("Number on rolled dice is : " +roll);
      con = (int) (Math.floor(Math.random() * 10) % 3);
      System.out.println("Condition: " +con);
      switch (con){
            case NO_PLAY:
						System.out.println("NO PLAY");
                  System.out.println("New Position is: " + pos);
						cntr4++;
                  break;
            case LADDER:
						System.out.println("Got LADDER");
                  pos = pos + roll;
                  if(pos <= 100)
                  System.out.println("New Position is: " + pos);
                  else{
						pos = pos - roll;
                  System.out.println("Remains at same position: " + pos);
						}
						cntr2++;
						continue a;
            case SNAKE:
						System.out.println("Got SNAKE");
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
		int con1 = 1;
b:		while(con1 == 1 && pos1 < 100){
		System.out.println("PLAYER 2");
		int roll1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
      c1++;
      System.out.println("Number on rolled dice is : " +roll1);
      con1 = (int) (Math.floor(Math.random() * 10) % 3);
      System.out.println("Condition: " +con1);
      switch (con1){
            case NO_PLAY:
						System.out.println("NO PLAY");
                  System.out.println("New Position is: " + pos1);
                  c4++;
                  break;
            case LADDER:
						System.out.println("Got LADDER");
                  pos1 = pos1 + roll1;
                  if(pos1 <= 100)
                  System.out.println("New Position is: " + pos1);
                  else{
                  pos1 = pos1 - roll1;
                  System.out.println("Remains at same position: " + pos1);
                  }
                  c2++;
						continue b;
            case SNAKE:
						System.out.println("Got SNAKE");
                  pos1 = pos1 - roll1;
                  if (pos1 <= 100){
                  if (pos1 >= 0 ){
                  System.out.println("New Position is: " + pos1);
                  }
                  else{
                  pos1 = 0;
                  System.out.println("New Position is: " + pos1);
                  }
                  }
                  else{
                  System.out.println("New position is:" + pos1);
                  }
                  c3++;
                  break;
            default:
                  System.out.println("Default");
                  break;
       	  }
			}
		}

      System.out.println();
		System.out.println("-------------------");
      if (pos == 100){
      System.out.println("Player1 ROLLED DICE "+ cntr1 +" time and got SNAKE "+ cntr3 +" times and got LADDER "+ cntr2 +" times and got NO PLAY "+ cntr4 +" times to win the game");
      System.out.println("    PLAYER1 WON");
		}
		else{
      System.out.println("Player2 ROLLED DICE "+ c1 +" time and got SNAKE "+ c3 +" times and got LADDER "+ c2 +" times and got NO PLAY "+c4+" times to win the game");
		System.out.println("    PLAYER2 WON");
		}
      System.out.println("-------------------");

      }
}
