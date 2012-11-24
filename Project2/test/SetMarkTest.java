
import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

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

        game.printBoard();

        game.newBoard();
        game.printBoard();
    }

    public void testAllowedSymbol()
    {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        String separator = System.getProperty("line.separator");
        game.setMark(1,'P');
        assertEquals("This symbol is not allowed" +separator, os.toString());
        System.setOut(originalOut);
    }

}
