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

}
