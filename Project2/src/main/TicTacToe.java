package main;

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

    public void printTable()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

}
