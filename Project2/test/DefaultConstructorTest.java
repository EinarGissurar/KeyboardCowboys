
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Made to test the Default Constructor for TicTacToe
 *
 * Creates and instance of TicTacToe and then uses assert to check if
 * the variables quitGame, player1 and player2 have the correct values
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
