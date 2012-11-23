import junit.framework.TestCase;
import main.TicTacToe;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: fannar
 * Date: 11/23/12
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class PrintWinnerTest extends TestCase
{
    TicTacToe capture;

    protected void setUp() throws Exception
    {
        super.setUp();
        capture = new TicTacToe();
    }

    public final void testPayer1Wins()
    {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        String separator = System.getProperty("line.separator");
        capture.printWinner(1);
        assertEquals("Player 1 wins!"+separator, os.toString());

        System.setOut(originalOut);
    }

    public final void testPayer2Wins()
    {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        String separator = System.getProperty("line.separator");
        capture.printWinner(2);
        assertEquals("Player 2 wins!"+separator, os.toString());

        System.setOut(originalOut);
    }

    public final void testDraw()
    {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        String separator = System.getProperty("line.separator");
        capture.printWinner(0);
        assertEquals("DRAW!"+separator, os.toString());

        System.setOut(originalOut);
    }

    public final void testException()
    {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        String separator = System.getProperty("line.separator");
        capture.printWinner(8);
        assertEquals("something went terribly wrong.."+separator, os.toString());

        System.setOut(originalOut);
    }
}
