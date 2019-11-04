package printer;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer(100,200);
    }
    @Test
    public void NoOfPapersTest(){
        assertEquals(100,printer.getPapersLeft());
    }
    @Test
    public void NoOfPapersLeftAfterPrintTest(){

        assertEquals("pages left after print 12",printer.print(22,4));
    }
    @Test
    public void ifPrintPagesMoreThanAvailableTest(){

        assertEquals("not enough pages left to print", printer.print(22,5));
    }
    @Test
    public void checkTonerTest(){
        printer.print(22,4);
        assertEquals(112, printer.getToner());
    }
}
