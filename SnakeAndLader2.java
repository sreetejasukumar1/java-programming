public class  SnakeAndLader2 {
	public static void main(String[] args){
		int start = 0;
		System.out.println("Starting position of player is: " + start);
		int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println(roll);
	}
}
