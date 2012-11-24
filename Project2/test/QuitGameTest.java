import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class QuitGameTest extends TestCase
{
    TicTacToe game = new TicTacToe();

    public void testIsQuitGame()
    {
        game.quitGame = false;
        Assert.assertEquals(false, game.isQuitGame());

        game.quitGame = true;
        Assert.assertEquals(true, game.isQuitGame());
    }

    public void testQuitGame()
    {
        Assert.assertEquals(false, game.isQuitGame());

        game.quitGame();

        Assert.assertEquals(true, game.isQuitGame());
    }
}
