import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import java.io.PrintStream;

/**
 * Made to test the function PrintBoard()
 *
 * Creates the instance game of TicTacToe to be able to access its variables and functions.
 * then we capture the PrintStream from the function and check if the stream matches the
 * results we expect to get: the board with the right values, inside angle brackets.
 * If the PrintStream from the function matches the expected string, we pass the test.
 *
 */


public class PrintBoardTest extends TestCase
{
    TicTacToe capture;

    protected void setUp() throws Exception
    {
        super.setUp();
        capture = new TicTacToe();
    }

    public final void testPrintTableTest()
    {
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        String separator = System.getProperty("line.separator");
        capture.printBoard();

        Assert.assertEquals("[ "+ capture.board[0][0] + "  "+ capture.board[0][1] + "  "+capture.board[0][2] +" ]"+ separator
                + "[ "+ capture.board[1][0] + "  "+ capture.board[1][1]+ "  "+capture.board[1][2] +" ]"+ separator
                + "[ "+ capture.board[2][0] + "  "+ capture.board[2][1] + "  "+capture.board[2][2] +" ]"+separator, os.toString());

        System.setOut(originalOut);

    }
}
