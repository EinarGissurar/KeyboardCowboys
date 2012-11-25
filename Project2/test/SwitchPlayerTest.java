
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Tests the function switchUser()
 *
 * It hard-codes the value for player1 to make sure its set to TRUE.
 * Calls the function switchPlayer and uses assert to verify that the variables
 * have switched from true to false and the other way around.
 * Dependent on function:
 */

public class SwitchPlayerTest extends TestCase {

    TicTacToe game = new TicTacToe();
    public void testSwitch()
    {
        game.player1=true;
        game.switchPlayer();
        Assert.assertEquals(game.player1,false);
        Assert.assertEquals(game.player2,true);

        game.switchPlayer();
        Assert.assertEquals(game.player1,true);
        Assert.assertEquals(game.player2,false);

    }


}
