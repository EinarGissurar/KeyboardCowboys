package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe
{
    public boolean quitGame = false;
    public char[][] arr;
    public TicTacToe()
    {
        this.quitGame = false;
        arr=new char[3][3];
        char cntr='1';
        for (int i=0; i<3; i++)
        {
             for (int j=0;j<3;j++)
             {
                 arr[i][j]=cntr;
                 cntr++;
             }
        }
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
