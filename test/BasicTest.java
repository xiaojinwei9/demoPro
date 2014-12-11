import org.codehaus.groovy.tools.shell.util.Logger;
import org.junit.*;

import java.util.*;

import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void TestTb(){
    	play.Logger.info("TestTbGo");
    	TestTb tb=new TestTb(1L,"xiao");
    	tb.save();
    	play.Logger.info("TestTbGoEnd");
    }
}
