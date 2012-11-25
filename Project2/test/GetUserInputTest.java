import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;
import java.io.*;

/**
 * Made to test GetUserInput
 *
 *
 */

public class GetUserInputTest extends TestCase
{
    TicTacToe game = new TicTacToe();

    public void testGetUserInput()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("abc".getBytes());
        System.setIn(in);
        Assert.assertEquals(-1, game.getUserInput());

        in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        Assert.assertEquals(3, game.getUserInput());
    }
}
