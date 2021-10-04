package arrayList;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		


		String columns;
		String rows;
		String x;
		String XorO;
		int count = 3;
		
		String X = "X";
		String O = "O";
		int row;
		int column;
		int XrowChoice;
		
		
		String[][] board = {
			{"x", "x", "x"}, 
			{"x", "x", "x"}, 
			{"x", "x", "x"},
			};
		
		
		//String showBoard = board[column][row];
		
		boolean TorF = true;
		System.out.println("Welcome to the game, X goes first: ");

		while(TorF == true)
		{
		System.out.println("X moves now: ");
		System.out.println("row: ");
		for(row = 0; row < count; row++)
		{
		XrowChoice = in.nextInt();
		rows = board[0][XrowChoice+1];

		}
		//board= board[X][0];
		System.out.println("column: ");
		for(column = 0; column < count; column++)
		{
		int XcolChoice = in.nextInt();
		columns = board[XcolChoice+1][XrowChoice];
		}
		
		System.out.println(board);
		
		//Puts X into place the person chose
		
		System.out.println(board);
		
		System.out.println("O moves now: ");
		System.out.println("row: ");
		int OrowChoice = in.nextInt();

		System.out.println("column: ");
		int OcolChoice = in.nextInt();

		public static boolean checkWin(String[][] board,String XorO)
		{
			 boolean win = false;
			 //Test for win on rows
			 for (int i=0;i<3;i++)
			 {
			     if (board[i][0]==XorO && board[i][1]==XorO && board[i][2]==XorO)
			 {
			 }
			 win = true;
			 return win;
			   }
			 //test for win on columns
			 for (int j=0;j<3;j++)
			 {
			     {
			 }
			 {
			 if (board[0][j]==XorO && board[1][j]==XorO && board[2][j]==XorO)
			         win=true;
			         return win;
			 }
			 //test for win on diagonals
			 if (board[0][0]==XorO && board[1][1]==XorO && board[2][2]==XorO) {
			       win =true;
			 return win;
			 }
			 if (board[0][2]==XorO && board[1][1]==XorO && board[2][0]==XorO)
			    win = true;
			 return win;
			   }
	}

}
}
}
