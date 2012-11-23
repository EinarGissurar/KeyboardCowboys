package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe
{
    public boolean quitGame = false;

    public TicTacToe()
    {
        this.quitGame = false;
    }

    public boolean isQuitGame()
    {
        return quitGame;
    }

    public void QuitGame()
    {
        this.quitGame = true;
    }

    public int GetUserInput()
    {
        try
        {
            return new Scanner(System.in).nextInt();
        }
        catch (InputMismatchException ex)
        {
            return -1;
        }
    }
}
