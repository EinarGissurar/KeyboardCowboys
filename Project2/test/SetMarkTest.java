/**
 * Created with IntelliJ IDEA.
 * User: Lenvoo
 * Date: 23.11.2012
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class SetMarkTest extends TestCase {
    TicTacToe game = new TicTacToe();
    public void testSetMark()
    {
        game.setMark(5,'X');
        game.setMark(8,'O');

        Assert.assertEquals('X',game.arr[1][1]);
        Assert.assertEquals('O',game.arr[2][1]);
    }

}
