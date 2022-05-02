import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void skillTest(){
        assertEquals("Hello Mom",
         SkillDemo.demoMethod("Hello", "Mom"));
    }
}
