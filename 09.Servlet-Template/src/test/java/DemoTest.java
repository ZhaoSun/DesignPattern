import junit.framework.TestCase;
import org.junit.Test;

public class DemoTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        System.out.println("setup");
        super.setUp();
    }

    @Test
    public void test_demo() {
        assertEquals(1, 1);
    }


    @Override
    protected void tearDown() throws Exception {
        System.out.println("tearDown");
        super.tearDown();
    }
}
