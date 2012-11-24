
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

public class SetMarkTest extends TestCase {
    TicTacToe game = new TicTacToe();
    public void testSetMark()
    {
        game.setMark(5,'X');
        game.setMark(8,'O');
        game.setMark(5,'X');
        game.setMark(8,'X');

        Assert.assertEquals('X',game.arr[1][1]);
        Assert.assertEquals('O',game.arr[2][1]);

        game.printTable();

        game.newBoard();
        game.printTable();
    }

}
