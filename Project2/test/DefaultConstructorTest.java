
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;



public class DefaultConstructorTest extends TestCase{

    TicTacToe game = new TicTacToe();

    public void testDefaultMatrix()
    {
        Assert.assertEquals(game.quitGame,false);
        Assert.assertEquals(game.player1,true);
        Assert.assertEquals(game.player2,false);

    }

}
