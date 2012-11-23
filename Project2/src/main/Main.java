package main;

public class Main
{
	public static void main(String[] args)
	{
        TicTacToe game = new TicTacToe();

		System.out.println("TicTacToe \n\n");

        while (!game.isQuitGame())
        {
            System.out.println("What do you want to do?");
            System.out.println("1. Play a game of TicTacToe");
            System.out.println("2. TicTacToe rulebook");
            System.out.println("3. Quit");
            game.QuitGame();
        }

        System.out.println("Have a nice day!");

	}
}
