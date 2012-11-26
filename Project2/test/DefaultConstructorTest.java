
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Tests the Default Constructor for TicTacToe
 *
 * Creates the instance game of TicTacToe to be able to access its variables and functions.
 * It then uses assert to check if the variables quitGame, player1 and player2 have the correct values
 * Dependent on function: does not depend on other functions from TicTacToe
 */


public class DefaultConstructorTest extends TestCase{

    TicTacToe game = new TicTacToe();

    public void testDefaultMatrix()
    {
        Assert.assertEquals(game.quitGame,false);
        Assert.assertEquals(game.player1,true);
        Assert.assertEquals(game.player2,false);

    }

}
