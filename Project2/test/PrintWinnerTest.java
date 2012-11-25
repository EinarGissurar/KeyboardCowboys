import junit.framework.TestCase;
import main.TicTacToe;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Made to test the function PrintWinner()
 *
 * Sets up the instance of TicTacToe, then we capture the PrintStream from the function for different inputs
 * in printWinner. For input 1 we expect to get "Player 1 wins!", for input 2 we expect "Player 2 wins!",
 * for input 3 we expect "DRAW!" and for any other input we expect "something went terribly wrong..".
 * If the PrintStream from the function matches the expected string, we pass the test.
 *
 */

public class PrintWinnerTest extends TestCase
{
    TicTacToe capture;

    protected void setUp() throws Exception
    {
        super.setUp();
        capture = new TicTacToe();
    }

    public final void testPlayer1Wins()
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

    public final void testPlayer2Wins()
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
