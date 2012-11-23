import junit.framework.Assert;
import junit.framework.TestCase;
import main.TicTacToe;

/**
 * Created with IntelliJ IDEA.
 * User: fannar
 * Date: 11/23/12
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
public class PrintTableTest extends TestCase
{
    TicTacToe game = new TicTacToe();
    PrintTableTest print = new PrintTableTest();

    public void tPrintTable()
    {
        //Testing initial table
        System.out.println("123");
        System.out.println("456");
        System.out.println("789");

    }

    public void testPrintTable()
    {
        Assert.assertEquals(game.printTable(), print.tPrintTable());
    }

}
