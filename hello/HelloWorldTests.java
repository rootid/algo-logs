
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HelloWorldTests {

   @Test
   public void saysHello() {
      HelloWorld hw = new HelloWorld();
      assertEquals(hw.saysHello(), true);
   }

}
