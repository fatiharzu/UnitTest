package Day_02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_DisplayName {

    @Test
    // test_parseInt_If_it_is_throwing_for_non_digit_value
    @DisplayName("Test parseInt() methoduna numeric olmayan argüman gönderildiginde" +
            "firlatilan exception firlatan method")
    void kendimeAitIsim(){

     String str = "Merhaba";

     assertThrows(NumberFormatException.class, ()->{
         Integer.parseInt(str);
     });

    }
}
