import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Tests the function isQuitGame()
 *
 * Creates the instance game of TicTacToe to be able to access its variables and functions.
 * Dependent on function: does not depend on other functions from TicTacToe
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
