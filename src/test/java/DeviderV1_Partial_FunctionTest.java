import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.DeviderV1_Partial_Function.*;

public class DeviderV1_Partial_FunctionTest {
    @Test
    public void ok(){
        Double result = devide("10/2");
        Assertions.assertEquals(result,5);
    }
    @Test
    public void fail(){
        Double result = devide("10/A");
        Assertions.assertEquals(result,5);
    }
}
