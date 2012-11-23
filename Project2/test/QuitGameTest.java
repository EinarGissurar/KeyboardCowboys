import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class QuitGameTest extends TestCase
{
    TicTacToe game = new TicTacToe();

    public void testQuitOutcome()
    {
        Assert.assertEquals(false, game.isQuitGame());

        game.QuitGame();

        assertEquals(true, game.isQuitGame());
    }
}
