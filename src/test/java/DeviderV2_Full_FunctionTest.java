import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.example.DeviderV2_Full_Function.devide;
import static org.example.DeviderV2_Full_Function.devideFunctionaStyle;

public class DeviderV2_Full_FunctionTest {


    @Test
    public void ok() {
        Optional<Double> result = devide("10/2");
        Assertions.assertEquals(result.get(), 5);
    }

    @Test
    public void no_fail_at_all() {
        Optional<Double> result = devide("10/A");
        Assertions.assertEquals(result, Optional.empty());
    }

    /**
     * Implement devideFunctionaStyle() then run code below
     */

    @Test
    public void ok_functaional_style() {
        Optional<Double> result = devideFunctionaStyle("10/2");
        Assertions.assertEquals(result.get(), 5);
    }

    @Test
    public void no_fail_at_all_functional_style() {
        Optional<Double> result = devideFunctionaStyle("10/A");
        Assertions.assertEquals(result, Optional.empty());
    }
}
