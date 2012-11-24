
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class SwitchUserTest extends TestCase {

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
