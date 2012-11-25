import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Tests the function isQuitGame()
 */


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

}
